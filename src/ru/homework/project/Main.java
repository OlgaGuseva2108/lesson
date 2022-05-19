package ru.homework.project;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Kompot", 30), new Cat("Korjik", 20), new Cat("Karamelka", 25)};



    Plate plate = new Plate( 50);

        for (Cat cat:cats) {
        cat.eat(plate);
        cat.info();
    }
}
}
