import java.util.Random;

public class Car extends Transport implements Competiting {

    private BodyType bodyType;
    private DriverB driver;


    public Car(String brand, String model, double engineVolume, BodyType bodyType, DriverB driver) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
        this.driver = driver;
    }

    public void setDriver(DriverB driver) {
        this.driver = driver;
    }

    public DriverB getDriver() {
        return driver;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public enum BodyType {
        SEDAN,
        HATCHBACK,
        COUPE,
        UNIVERSAL,
        SUV,
        CROSSOVER,
        PICKUP,
        VAN,
        MINIVAN;
    }

    public void printType(){
        if(bodyType==null){
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println(bodyType);
        }
    }

    @Override
    public boolean service() {
        return Math.random()>0.5;
    }
    @Override
    public boolean repair() {
        return true;
    }
    @Override
    public void pitStop() {
        stopMoving();
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
