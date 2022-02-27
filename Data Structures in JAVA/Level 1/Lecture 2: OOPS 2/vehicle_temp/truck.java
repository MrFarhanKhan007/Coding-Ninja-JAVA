package vehicle_temp;

import vehicle.Vehicle;

public class truck extends Vehicle {
    static int maxloadingcapacity;

    public truck(int maxSpeed) {
        super(maxSpeed);
    }

    public void print(){
        System.out.print("Truck capacity: "+maxloadingcapacity);
        System.out.println("Truck color: "+color);
    }
}
