package ru.job4j.ex;

public class FindMaxLength {

    public static void main(String[] args) {
        String[] shops = {"Ebay", "WB", "Amazon", "Yandex Market", "Ozon"};
        int max = 0;
        for (int index = 0; index < shops.length; index++) {
            String element = shops[index];
            if (element.length() > max) {
                max = element.length();
            }
        }
        System.out.println("Max length : " + max);
    }
}
