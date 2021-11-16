package com.company;

public class Pet {
    String species;
    String nickname;
    int age;
    int trickLevel;
    String[] habits;
    String foxy;

    public Pet(String species , String nickname , int age , int trickLevel , String[] habits,  String foxy) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
        this.foxy=foxy;
    }

    public Pet(String species , String nickname ){
               this.species = species;
               this.nickname = nickname;
    }
   public Pet (){

    }
    void eat(){
        System.out.println("Я кушаю!");
    }
    void foul(){
        System.out.println("Нужно хорошо замести следы...");
    }
    public String toString(){
        return String.format("%s{nickname = `%s` , age= %d , trickLevel = %d , habits = %s , habit = [%s]}" , species , nickname,age, trickLevel, String.join(",", habits));
    }
}


