package hometask22.Thread;


public class Main {
    public static void main(String[] args) {
     TrafficLight trafficLight = new TrafficLight();
    trafficLight.run();
    }
}
class TrafficLight extends Thread {

    private enum LightColor {
        RED, YELLOW, GREEN
    }

    private LightColor currentColor = LightColor.RED;
@Override
    public void run() {
        while (true) {
            switch (currentColor) {
                case RED:
                    System.out.println("RED");
                    sleepForInterval(3000); // Red light for 3 seconds
                    currentColor = LightColor.GREEN;
                    break;
                case GREEN:
                    System.out.println("GREEN");
                    sleepForInterval(3000); // Green light for 3 seconds
                    currentColor = LightColor.YELLOW;
                    break;
                case YELLOW:
                    System.out.println("YELLOW");
                    sleepForInterval(1000); // Yellow light for 1 second
                    currentColor = LightColor.RED;
                    break;
            }
        }
    }

    private void sleepForInterval(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}