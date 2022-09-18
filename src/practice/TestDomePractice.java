package practice;
/*
 * Created By: Hiren Patel
 * Project Name: Java-Practice
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestDomePractice {
    public static String[] uniqueNames(String[] names1, String[] names2) {
        List<String> names = Arrays.stream(names1).collect(Collectors.toList());
        for (String name : names2) {
            if (!names.contains(name)) {
                names.add(name);
            }
        }
        String[] namesArray = new String[names.size()];
        for (int i = 0; i < names.size(); i++) {
            namesArray[i] = names.get(i);
        }
        return namesArray;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", TestDomePractice.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia

    }
}
