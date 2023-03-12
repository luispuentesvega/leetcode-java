package dataStructure;

import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Bogota", "Colombia");
        capitalCities.put("Phnom Penh", "Cambodia");
        capitalCities.put("Bangkok", "Thailand");

        System.out.println(capitalCities);

        System.out.println(capitalCities.get("Bogota") + "---");

        // Print Keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        System.out.println("---Values---");
        // Print Values
        for (String v : capitalCities.values()) {
            System.out.println(v);
        }
    }
}
