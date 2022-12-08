public class DriverB<T extends Car & Competiting> extends Driver{
    public DriverB(String name, boolean hasLicense, int experience) {
        super(name, hasLicense, experience);
    }

    @Override
    void move() {
        System.out.println("Car...");
    }

    @Override
    void stop() {
        System.out.println("Car...");
    }

    @Override
    void refuel() {
        System.out.println("Car...");
    }

    public String getCarMessage(T car) {
        return "Driver " + getName() + " is driving car " +
                "" + car.getModel() + " " + " participates in the race";
    }

}

