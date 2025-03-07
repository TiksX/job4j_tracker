package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void showFood() {
        System.out.println(this.food);
    }

    public void showName() {
        System.out.println(this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        System.out.println("This is kitten ");
        gav.giveNick("Gav");
        gav.showName();
        System.out.println("He ate ");
        gav.eat("cutlet");
        gav.showFood();
        System.out.println("This is kitten ");
        gav.giveNick("Black");
        gav.showName();
        System.out.println("He ate ");
        gav.eat("fish");
        gav.showFood();
    }
}
