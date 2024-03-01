package hometask19.speed;

public class Transport {
    public static void main(String[] args) {
        System.out.println("Скорость самолета составляет 600 миль в час.");
        System.out.println();
        System.out.println("Скорости транспортных средств:");
        for ( Speed s : Speed.values()) {
            System.out.println(s.name() + " типичная скорость составляет " + s + " миль в час." );

        }
    }
}
     enum Speed {
        CAR("65"), TRUCK("55"), AIRPLANE("600"), TRAIN("70"), BOAT("22");
         String speed;

        Speed(String speed) {
            this.speed = speed;
        }


         @Override
         public String toString() {
             return speed;
         }
     }

