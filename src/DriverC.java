public class DriverC<T extends Truck & Competiting> extends Driver{
    public DriverC(String name, boolean hasLicense, int experience) {
        super(name, hasLicense, experience);
    }

    @Override
    void move() {
        System.out.println("Truck...");
    }

    @Override
    void stop() {
        System.out.println("Truck...");
    }

    @Override
    void refuel() {
        System.out.println("Truck...");
    }

    public String getCarMessage(T truck) {
        return "Driver " + getName() + " is driving truck " + truck.getModel() + " " + " participates in the race";
    }

}
