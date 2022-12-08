public class Bus extends Transport implements Competiting {

    Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public enum Capacity {
        EXTRA_SMALL(0,10),
        SMALL(10, 25),
        MEDIUM(25, 50),
        LARGE(60, 80),
        EXTRA_LARGE(100, 120);

        private final int from;
        private final int to;

        Capacity(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public int getFrom() {
            return from;
        }

        public int getTo() {
            return to;
        }
    }

    public void printType(){
        if(capacity!=null && capacity.getFrom()!=0){
            System.out.println(capacity.getFrom());
        } else {
            System.out.println("Данных по авто недостаточно");
        }
    }

    @Override
    public boolean service() {
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
