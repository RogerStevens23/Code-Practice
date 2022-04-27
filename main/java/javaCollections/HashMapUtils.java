package javaCollections;
import java.util.HashMap;
import java.util.Map;

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
    public String getValueWithKey(int key)
    {
        String result = map.get(key);
        if(result == null)
            result = "There is no value associated with that key.";
        return result;
    }
    public boolean checkIfKeyValuePairExists(int key, String value)
    {
        boolean result = false;
        if(map.containsKey(key))
        {
            String mapValue = map.get(key);
            if(mapValue.equals(value))
                result = true;
        }
        return result;
    }
}