package com.example.LinkedList;

import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
        /*
        addFirst()
        addLast()
        removeFirst()
        removeLast()
        getFirst()
        getLast()
         */

        LinkedList<String> cars = new LinkedList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        //incluindo Mazda no início
        cars.addFirst("Mazda");
        System.out.println(cars);

        //incluindo Bugatti no fim
        cars.addLast("Bugatti");
        System.out.println(cars);

        String carro;
        carro = cars.get(3);
        System.out.println(carro);

        //removendo Mazda
        cars.removeFirst();
        System.out.println(cars);

        //pegar o primeiro
        System.out.println(cars.getFirst());
        System.out.println(cars);

    }
}
