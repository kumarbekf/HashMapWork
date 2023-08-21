import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {
        ArrayList<City> cityList = new ArrayList<>();
        City city1 = new City(3, "Бишкек");
        City city2 = new City(1, "Ош");
        City city3 = new City(5, "Жалал-Абад");
        City city4 = new City(2, "Нарын");
        City city5 = new City(4, "Талас");
        City city6 = new City(6, "Баткен");
        City city7 = new City(7, "Ысык-Кол");
        cityList.add(city1);
        cityList.add(city2);
        cityList.add(city3);
        cityList.add(city4);
        cityList.add(city5);
        cityList.add(city6);
        cityList.add(city7);
        Comparator comparator = Comparator.comparingInt(City::getCode);
        Collections.sort(cityList, comparator.reversed());


        TreeSet<City> codeSet = new TreeSet<>(comparator);
        for (City city : cityList) {
            if (city.getCode() % 2 == 1) {
                codeSet.add(city);
            }
        }
        System.out.println("чонунан кичинесине караган тартипте");
        for (City city : cityList) {
            System.out.println(city.getCode() + ": " + city.getName());
        }
        System.out.println("\ncode так сан");
        for (City city : codeSet) {
            System.out.println(city.getCode() + ": " + city.getName());
        }
    }
}