import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;
    private boolean diagnosticsPassed;
    private List<Sponsor> sponsors;
    private List<Mechanic<?>> mechanics;

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.sponsors = new ArrayList<>();
        this.mechanics = new ArrayList<>();
    }

    public void setDiagnosticsPassed(boolean diagnosticsPassed) {
        this.diagnosticsPassed = diagnosticsPassed;
    }

    public void setSponsors(List<Sponsor> sponsors) {
        this.sponsors = sponsors;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }
    public void addMechanic(Mechanic mechanic){
        mechanics.add(mechanic);
    }

    public void setMechanics(List<Mechanic<?>> mechanics) {
        this.mechanics = mechanics;
    }

    public boolean isDiagnosticsPassed() {
        return diagnosticsPassed;
    }

    //region
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    //endregion

    void startMoving() {
        System.out.println(this + " is moving");
    }



    void stopMoving(){
        System.out.println(this + " has stopped moving");
    }

    @Override
    public String toString() {
        return "Transport{" +
                "diagnosticsPassed=" + diagnosticsPassed +
                ", sponsors=" + sponsors +
                ", mechanics=" + mechanics +
                '}';
    }

    public void printType(){}

    public abstract boolean service();
    public abstract boolean repair();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && diagnosticsPassed == transport.diagnosticsPassed && brand.equals(transport.brand) && model.equals(transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, diagnosticsPassed);
    }
}
