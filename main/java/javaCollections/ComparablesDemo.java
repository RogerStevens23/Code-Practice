package javaCollections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparablesDemo
{
    public static void runDemo()
    {
        ArrayList<String> names = new ArrayList<>();

        names.add("Zack");
        names.add("Lynn");
        names.add("Alan");

        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
    }
}
