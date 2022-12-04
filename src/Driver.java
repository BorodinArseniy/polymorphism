public abstract class Driver {

    private final String name;
    private final boolean hasLicense;
    private final int experience;

    public Driver(String name, boolean hasLicense, int experience) {
        this.name = name;
        this.hasLicense = hasLicense;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public boolean isHasLicense() {
        return hasLicense;
    }

    public int getExperience() {
        return experience;
    }

    abstract void move();
    abstract void stop();
    abstract void refuel();
    
}
