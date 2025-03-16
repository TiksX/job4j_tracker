package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item item = new Item("Test Item", 1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-EEEE-yyyy HH:mm:ss");
        String formattedDate = item.getCreated().format(formatter);
        System.out.println(formattedDate);
    }
}

