package hometask18.Automobile;

public class Car {
    private String model;
    private int year;
    private String produc;
    private int capacity;
    private String color;
    private int price;

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, int year, String produc, int capacity, String color, int price) {
        this.model = model;
        setYear(year);
        this.produc = produc;
        this.capacity = capacity;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getProduc() {
        return produc;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if(year > 1900 && year < 2024){
            this.year = year;
        }

    }

    public void setProduc(String produc) {
        this.produc = produc;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    void printInfo(){
        System.out.println("********** Данные автомобиля **********");
        System.out.printf("Название модели: %s%n", this.model);
        System.out.printf("Год выпуска: %d%n", this.year);
        System.out.printf("Производитель: %s%n", this.produc);
        System.out.printf("Мощность двигателя: %s%n", this.capacity + " л.с");
        System.out.printf("Цвет машины: %s%n", this.color);
        System.out.printf("Цена: %d%n", this.price);
        System.out.println("=======================================");
    }

}
