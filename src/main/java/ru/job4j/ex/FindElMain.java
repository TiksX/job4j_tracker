package ru.job4j.ex;

public class FindElMain {
    public static void main(String[] args) {
        String[] values = {"apple", "banana", "cherry"};
        String key = "orange";

        try {
            int index = FindEl.indexOf(values, key);
            System.out.println("Index of " + key + ": " + index);
        } catch (ElementNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
