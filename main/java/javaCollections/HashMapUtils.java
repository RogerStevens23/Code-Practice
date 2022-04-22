package javaCollections;
import java.util.HashMap;

public class HashMapUtils
{
    private int key = 100;
    private HashMap<Integer, String> map = new HashMap();

    public void addWord(String word)
    {
        map.put(key, word);
        key += 3;
    }

    public HashMap<Integer, String> getMap()
    {
        return map;
    }
}