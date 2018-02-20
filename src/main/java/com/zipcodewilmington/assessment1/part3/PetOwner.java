package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    Pet[] petArray;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if (pets == null) {
            this.petArray = new Pet[0];
        } else {
            this.petArray = pets;
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {


        Pet[] tempArray = new Pet[this.petArray.length + 1];
        System.arraycopy(this.petArray, 0, tempArray, 0, this.petArray.length);
        tempArray[tempArray.length - 1] = pet;
        this.petArray = tempArray;
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        for (int i = 0; i < this.petArray.length; i++) {
            if (petArray[i].equals(pet))
                petArray[i] = null;
        }

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        for (int i = 0; i < this.petArray.length; i++) {
            if (petArray[i].equals(pet))
                return true;
        }
        return false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        sortPetsByAge();

        return petArray[petArray.length - 1].getAge();
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        sortPetsByAge();

        return petArray[0].getAge();
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        Float totalPetAge = 0F;
        int totalPets = petArray.length;

        for (int i = 0; i < petArray.length; i++) {
            totalPetAge += petArray[i].getAge();
        }

        return totalPetAge / totalPets;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return petArray.length;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {

        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        return petArray;
    }

    public Pet[] sortPetsByAge() {
        Arrays.sort(petArray);

        return petArray;
    }


}
