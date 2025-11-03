interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Light implements SmartDevice {
    public void turnOn() { System.out.println("Light turned ON."); }
    public void turnOff() { System.out.println("Light turned OFF."); }
}

class AC implements SmartDevice {
    public void turnOn() { System.out.println("AC started."); }
    public void turnOff() { System.out.println("AC stopped."); }
}

class TV implements SmartDevice {
    public void turnOn() { System.out.println("TV turned ON."); }
    public void turnOff() { System.out.println("TV turned OFF."); }
}

public class Main1 {
    public static void main(String[] args) {
        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();
        light.turnOn(); ac.turnOn(); tv.turnOn();
    }
}
