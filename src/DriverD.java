public class DriverD<T extends Bus & Competiting> extends Driver{
    public DriverD(String name, boolean hasLicense, int experience) {
        super(name, hasLicense, experience);
    }

    @Override
    void move() {
        System.out.println("Bus...");
    }

    @Override
    void stop() {
        System.out.println("Bus...");
    }

    @Override
    void refuel() {
        System.out.println("Bus...");
    }

    public String getCarMessage(T bus) {
        return "Driver " + getName() + " is driving bus " + bus.getModel() + " " + " participates in the race";
    }
    ///

}
