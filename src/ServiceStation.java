import java.util.List;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> queue;

    public void addCar(Car transport){
        queue.offer(transport);
    }
    public void addTruck(Truck transport){
        queue.offer(transport);
    }
    public void doService(){
        if(!queue.isEmpty()){
            Transport transport = queue.poll();
            transport.service();
        }
    }
}
