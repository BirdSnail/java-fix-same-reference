package com.bytelegend;

import com.bytelegend.pet.Cat;

public class Home {
    public static Cat cat1;
    public static Cat cat2;
    public static Cat cat3;

    public static void main(String[] args) {
        cat1 = new Cat();
        cat2 = new Cat();
        cat3 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
    }
}
