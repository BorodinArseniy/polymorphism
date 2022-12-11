public class Truck extends Transport implements Competiting {

    LoadCapacity loadCapacity;
    DriverC driverC;

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity, DriverC driverC) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
        this.driverC = driverC;
    }

    public DriverC getDriverC() {
        return driverC;
    }

    public void setDriverC(DriverC driverC) {
        this.driverC = driverC;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public enum LoadCapacity {
        N1(0D, 3.5),
        N2(3.5, 12D),
        N3(12D, null);

        private final Double from;
        private final Double to;

        LoadCapacity(Double from, Double to) {
            this.from = from;
            this.to = to;
        }

        public Double getFrom() {
            return from;
        }

        public Double getTo() {
            return to;
        }
    }

    public void printType(){
        if(loadCapacity!=null && loadCapacity.getFrom()!=null){
            System.out.println(loadCapacity.getFrom());
        } else {
            System.out.println("Данных по авто недостаточно");
        }
    }

    @Override
    public boolean service() {
        return Math.random()>0.75;
    }
    @Override
    public boolean repair() {
        return true;
    }


    @Override
    public void pitStop() {
        this.stopMoving();
        System.out.println("Getting fixed");
    }

    @Override
    public void bestTimeARough() {
        System.out.println("Best Time!!");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Max speed is reached");
    }
}
