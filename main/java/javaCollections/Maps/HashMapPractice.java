package javaCollections.Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPractice
{
    public static void hashMap()
    {
        Map<String, String> students = new HashMap<>();
        students.put("23A52", "Harvey Dent");
        students.put("68Z29", "Jessica Jones");
        students.put("57W85", "J Jonah Jameson");

        System.out.println("--------------------------------------------------------------");
        System.out.println("The students are " + students);
        System.out.println("--------------------------------------------------------------");

        // A faster way of obtaining an element than that of ArrayList iterating.
        String studentName = students.get("23A52");
        System.out.println("Found the student!");
        System.out.println("The student's name is " + studentName);
        System.out.println("--------------------------------------------------------------");

        // To look at all the keys.
        Set<String> studentIds = students.keySet();
        System.out.println("The student IDs are " + studentIds);
        System.out.println("--------------------------------------------------------------");

        // To look at all the values.
        Collection<String> studentNames = students.values();
        System.out.println("The student names are " + studentNames);
        System.out.println("--------------------------------------------------------------");

        // Looking at entries.
        // This results in poor performance, since it is looking up the value for every key.
        for(String id : students.keySet())
        {
            System.out.println("This student's name is: " + students.get(id));
        }
        System.out.println("--------------------------------------------------------------");

        // This is a better approach since it's using an Entry, meaning a set of key/value pairs.
        for(Map.Entry<String, String> entry : students.entrySet())
        {
            System.out.println("The student's id is: " + entry.getKey());
            System.out.println("The student's name is: " + entry.getValue());
        }
        System.out.println("--------------------------------------------------------------");
    }
}
