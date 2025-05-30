package oop.Compositions;

public class Computer {
    private Processor processor;
    public boolean isPoweredOn = false;

    public Computer() {
        this.processor = new Processor();
    }

    public void turnOn() {
        // ... Logic
        isPoweredOn = true;
        System.out.println("Turning on... \n");
    }

    public void turnOff() {
        // ... Logic
        isPoweredOn = false;
        System.out.println("Turning off... \n");
    }

    public String poweredStatus() {
        return isPoweredOn ? "ON" : "OFF";
    }
}
