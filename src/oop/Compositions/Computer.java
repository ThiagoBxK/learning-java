package oop.Compositions;

public class Computer {
    private Processor processor;
    public boolean isPoweredOn = false;

    public Computer() {
        this.processor = new Processor();
    }

    public void turnOn() {
        if (isPoweredOn) {
            System.out.println("The computer is already turning on \n");
            return;
        }

        isPoweredOn = true;
        System.out.println("Turning on... \n");
    }

    public void turnOff() {
        if (!isPoweredOn) {
            System.out.println("The computer is already turning off \n");
            return;
        }

        isPoweredOn = false;
        System.out.println("Turning off... \n");
    }

    public String poweredStatus() {
        return isPoweredOn ? "ON" : "OFF";
    }
}
