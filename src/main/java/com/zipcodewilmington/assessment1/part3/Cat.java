package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        this.petName = name;
        this.petAge = age;
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        this.petAge = age;
        petName = "Cat name";
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        this.petName = name;
        petAge = 0;

    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        return null;
    }
}
