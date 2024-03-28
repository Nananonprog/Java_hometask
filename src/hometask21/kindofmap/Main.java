package hometask21.kindofmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> basMap = new HashMap<>();
         basMap.put("X", 1);
         basMap.put("Y", 2);
         basMap.put("Z", 3);

        HashMap<Integer, String> newMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry : basMap.entrySet()) {
            newMap.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Исходный Map: " + basMap);
        System.out.println("Измененный Map: " + newMap);
    }
}
