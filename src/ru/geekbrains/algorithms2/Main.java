package ru.geekbrains.algorithms2;

public class Main {

    public static void main(String[] args) {
        Arr numbers = new Arr(100000);

        for (int i = 0; i <numbers.getSize() ; i++) {
            numbers.setElement(i, (int) (Math.random() * 100000));
        }
//        numbers.info();
//        numbers.setElement(1, 4);
//        numbers.info();
//        numbers.delete(4);
//        numbers.info();
//        numbers.findElemIndex(4);
        numbers.sortBubble();

        Arr numbers2 = new Arr(100000);

        for (int i = 0; i <numbers2.getSize() ; i++) {
            numbers2.setElement(i, (int) (Math.random() * 100000));
        }
        numbers2.sortSelect();

        Arr numbers3 = new Arr(100000);

        for (int i = 0; i <numbers3.getSize() ; i++) {
            numbers3.setElement(i, (int) (Math.random() * 100000));
        }
        numbers3.sortInsert();
    }
}
