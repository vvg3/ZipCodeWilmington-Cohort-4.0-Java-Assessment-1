package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet implements Comparable<Pet> {
    private String name;
    private Integer age;

    /**
     * @param name name of this Dog
     * @param age  age of this dog
     */
    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        this.age = age;
        this.name = "Dog name";
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        this.name = name;
        this.age = 0;

    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        this.name = "Dog name";
        this.age = 0;

    }

    /**
     * @return bark as a string
     */
    public String speak() {
        return "Bark";
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public int compareTo(Pet pet) {
        Integer age1 = getAge();
        Integer age2 = pet.getAge();

        if (age1 > age2) {
            return -1;
        } else return 1;

    }
}
