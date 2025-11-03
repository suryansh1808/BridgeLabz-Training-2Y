interface VehicleDashboard {
    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery: 80%");
    }
}

class ElectricCar implements VehicleDashboard {
    public void displaySpeed() { System.out.println("Speed: 90 km/h"); }
}

public class Dashboard {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.displaySpeed();
        e.displayBattery();
    }
}
