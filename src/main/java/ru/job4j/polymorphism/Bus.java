package ru.job4j.polymorphism;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Движение ТС");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Количество пассажиров в ТС: " + count);
    }

    @Override
    public int refuel(int fuel) {
        System.out.println("ТС заправлено на: " + fuel);
        return fuel;
    }
}
