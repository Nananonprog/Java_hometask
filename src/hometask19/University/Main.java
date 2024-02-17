package hometask19.University;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Виктор Вербов","Gr111", 5);
        s.Itog();
        Aspirant a = new Aspirant("Александр Невзоров", "Gr222", 4, "Work1");
        Aspirant a1 = new Aspirant("Антон Бобров", "Gr333", 5, "Work2");
        a.ItogAsp();
        a1.ItogAsp();

    }
}
