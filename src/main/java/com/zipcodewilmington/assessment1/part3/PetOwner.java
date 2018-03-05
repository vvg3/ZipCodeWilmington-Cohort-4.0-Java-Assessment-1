package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    String name;
    ArrayList<Pet> ownersPets;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.ownersPets = new ArrayList<>();
        if (pets != null) {
            this.ownersPets.addAll(Arrays.asList(pets));
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {

        this.ownersPets.add(pet);

    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {

        this.ownersPets.remove(pet);

    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {

        return ownersPets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungestPetAge() {

        sortPetsByAge();

        return 0;
//        return ownersPets[0].getAge();
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {

        sortPetsByAge();

        return null;

//        return ownersPets[ownersPets.length - 1].getAge();
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        return null;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return ownersPets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {

        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {

        Pet[] petArray = new Pet[ownersPets.size()];

        for (int i = 0; i < ownersPets.size(); i++) {
            petArray[i] = ownersPets.get(i);
        }

        return petArray;
    }

    public Pet[] sortPetsByAge() {

//        Arrays.sort(ownersPets);

        return null;
//        return ownersPets;
    }


}
