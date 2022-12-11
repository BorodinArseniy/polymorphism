public class Sponsor {
    private final String name;
    private int amountOfSupport;

    public Sponsor(String name, int amountOfSupport) {
        this.name = name;
        this.amountOfSupport = amountOfSupport;
    }

    public String getName() {
        return name;
    }

    public int getAmountOfSupport() {
        return amountOfSupport;
    }

    public void setAmountOfSupport(int amountOfSupport) {
        this.amountOfSupport = amountOfSupport;
    }

    public void sponsorRace(){
        amountOfSupport = 0;
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "name='" + name + '\'' +
                ", amountOfSupport=" + amountOfSupport +
                '}';
    }
}
