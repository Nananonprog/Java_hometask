package hometask21.hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] colors = {"red", "orange", "aqua", "pink","gray", "blue", "white", "black", "yellow", "brown"};
        HashMap<String, Color> colorMap = new HashMap<>();
        for (String color: colors) {
            Color newColor = new Color(color);
            colorMap.put(color, newColor);
        }
        int count = 1;
        for (String key : colorMap.keySet()) {
            System.out.println(count + ") " + key + ": " + colorMap.get(key));
            count++;

        }



        }

    }


class Color{
    String name;

    public Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name.toUpperCase();
    }
}