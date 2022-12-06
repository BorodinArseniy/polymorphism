public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
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
                "model='" + model + '\'' +
                '}';
    }

    public void printType(){}

}
