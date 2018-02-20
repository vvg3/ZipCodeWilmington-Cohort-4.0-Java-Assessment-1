package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Cat extends Pet implements Comparable<Pet>{

    private String name;
    private Integer age;
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {
        this.age = age;
        this.name = "Cat name";
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        this.name = name;
        this.age = 0;

    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        this.name = "Cat name";
        this.age = 0;
    }

    /**
     * @return meow as a string
     */
    public String speak() {

        return "Meow";
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
