package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public String about() {
        return "My charge: " + load + "%";
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery first = new Battery(30);
        Battery second = new Battery(50);
        System.out.println("First." + first.about());
        System.out.println("Second." + second.about());
        first.exchange(second);
        System.out.println("First." + first.about());
        System.out.println("Second." + second.about());
    }
}


