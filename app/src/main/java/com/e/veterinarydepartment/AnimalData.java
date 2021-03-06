package com.e.veterinarydepartment;

public class AnimalData {

    private String phone, animalType, animalname, gender, age;

    public AnimalData() {
    }

    public AnimalData(String phone, String animalType, String animalname, String gender, String age) {
        this.phone = phone;
        this.animalType = animalType;
        this.animalname = animalname;
        this.gender = gender;
        this.age = age;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalname() {
        return animalname;
    }

    public void setAnimalname(String animalname) {
        this.animalname = animalname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
