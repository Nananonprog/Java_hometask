package hometask20.linlis;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Красный");
        arrayList.add("Оранжевый");
        arrayList.add("Желтый");
        arrayList.add("Зеленый");
        arrayList.add("Голубой");
        arrayList.add("Синий");
        arrayList.add("Фиолетовый");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            iterator.next();
        }
        System.out.print("Список: " + arrayList + "\n");

        Rainbow c1 = new Rainbow("Красный");
        Rainbow c2 = new Rainbow("Оранжевый");
        Rainbow c3 = new Rainbow("Желтый");
        Rainbow c4 = new Rainbow("Зеленый");
        Rainbow c5 = new Rainbow("Голубой");
        Rainbow c6 = new Rainbow("Синий");
        Rainbow c7 = new Rainbow("Фиолетовый");
        LinkedList<Rainbow> rLL = new LinkedList<>();
        rLL.add(c1);
        rLL.add(c2);
        rLL.add(c3);
        rLL.add(c4);
        rLL.add(c5);
        rLL.add(c6);
        rLL.add(c7);



        ListIterator <Rainbow> listIterator = rLL.listIterator();
        System.out.println("\nСписок итераторов в прямом направлении: ");
        while (listIterator.hasNext()){
            System.out.println("Индекс = " + listIterator.nextIndex() + ", " + listIterator.next());
        }
        System.out.println();
        System.out.println("\nСписок итераторов в обратном направлении: ");
        while (listIterator.hasPrevious()){
            System.out.println("Индекс = " + listIterator.previousIndex() + ", " + listIterator.previous());
        }
    }
}

class Rainbow{

    String color;

    public Rainbow(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Элемент = " + this.color;
    }
}