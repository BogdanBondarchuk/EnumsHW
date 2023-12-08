package app;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        System.out.println("Initial color: " + trafficLight.getColor());

        trafficLight.changeLight();
        System.out.println("New color: " + trafficLight.getColor());

        trafficLight.changeLight();
        System.out.println("New color: " + trafficLight.getColor());
    }
}
