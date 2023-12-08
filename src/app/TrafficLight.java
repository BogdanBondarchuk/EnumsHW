package app;

class TrafficLight {
    private TrafficLightColor color;
    public void changeLight() {
        switch (color) {
            case RED:
                color = TrafficLightColor.YELLOW;
                break;
            case GREEN:
                color = TrafficLightColor.RED;
                break;
            case YELLOW:
                color = TrafficLightColor.GREEN;
                break;
        }
    }
    public TrafficLightColor getColor() {
        return color;
    }
    public TrafficLight() {
        color = TrafficLightColor.RED;
    }
}
