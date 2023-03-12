package dataStructure;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<String>();
        people.add("Luis");
        people.add("German");

        System.out.println(people);
        System.out.println("First Person:" + people.get(0));
        System.out.println("Changing the name");
        people.set(0, "Lewis");
        System.out.println(people.get(0));
        people.remove(0);
        System.out.println(people);
        System.out.println("Array size:" + people.size());
        people.add("Pepito");
        people.add("Pedro");
        people.add("Sultano");
        // looping the array
        for (int i = 0; i < people.size(); i++) {
            System.out.println("People at " + i + " = " + people.get(i));
        }

        // sorting the array
        Collections.sort(people);

        // looping using a foreach
        for (String i : people) {
            System.out.println(i);
        }

        //
    }
}
