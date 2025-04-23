package oop.Associations;

public class Computer {
    public boolean isPoweredOn = false;

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
