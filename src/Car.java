public class Car extends Transport implements Competiting {
    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
