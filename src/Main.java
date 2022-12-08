public class Main {

    public static void main(String[] args) {

        Car car = new Car("Mercedes", "GLE", 150.00, Car.BodyType.SEDAN);
        Truck truck = new Truck("Mercedes", "TRUCK MODEl", 1500.00, Truck.LoadCapacity.N1);
        Bus bus = new Bus("Mercedes", "Bus", 150.00, Bus.Capacity.SMALL);

        car.pitStop();
        car.service();
        car.maxSpeed();
        bus.bestTimeARough();

        DriverD carDriver = new DriverD("null", true, 10);
        System.out.println(carDriver.getCarMessage(bus));


    }
}
