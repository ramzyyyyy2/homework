package homework4;

import java.util.ArrayList;
import java.util.List;

public class Cities {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>(List.of("Kyiv", "Lviv", "Odesa"));
        cities.add("Dnipro");
        System.out.println(cities);
    }
}
