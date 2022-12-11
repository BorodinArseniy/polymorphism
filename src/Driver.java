import java.util.Objects;

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return hasLicense == driver.hasLicense && experience == driver.experience && Objects.equals(name, driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, hasLicense, experience);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", hasLicense=" + hasLicense +
                ", experience=" + experience +
                '}';
    }
}
