package com.company;
import com.company.Pet;
import com.company.Human;
import com.company.Family;
import java.util.Scanner;

public class Main {
  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String command;
        Pet animal = null;
        Human father = null;

        do {
            System.out.println();
            System.out.println("Create father");
            System.out.println("Create mother");
            System.out.println("Create pet");
            System.out.println("Say hi to pet");
            System.out.println("Describe pet");
            System.out.println("Feed pet");
            System.out.println("Make foul");
            System.out.println("Exit");
            command = scanner.nextLine();
            switch (command) {
                case "Create father":
                    father = createHuman(animal);
                    break;
                case "Create mother":
                    createHuman(animal);

                    break;
                case "Create pet":
                    animal = createAnimal();
                    break;
                case "Say hi to pet":
                    father.sayHi();
                    break;
                case "Describe pet":

                    break;
                case "Feed pet":
                    animal.eat();
                    break;
                case "describePet":
                    father.describePet();
                    break;
                case "Make foul":
                    animal.foul();

                    break;
                case "Exit":
                    break;
            }
        } while (!command.equals("Exit"));
    }
    private static Human createHuman( Pet pet ){

        System.out.print("Input name:  ");
        String name = scanner.nextLine();
        System.out.print("Input surname:  ");
        String surname = scanner.nextLine();
        System.out.print("Input year:  ");
        int year = scanner.nextInt();
        int iq;
        do{
            System.out.println("Input Iq");
            iq = scanner.nextInt();
        }while (iq>100|| iq < 0 );
        System.out.println("Input habit");
        String humanHabit = scanner.nextLine();
        Human father = new Human( name, surname , year );
        return father;
    }
    private static Pet createAnimal(){
        System.out.print("Input species:  ");
        String species = scanner.nextLine();
        System.out.print("Input nickname:  ");
        String nickname = scanner.nextLine();
        System.out.print("Input age:  ");
        int age = scanner.nextInt();
        System.out.print("Input trickLevel:  ");
        int trickLevel;
        do{
            System.out.println("Input trickLevel");
            trickLevel = scanner.nextInt();

        }while (trickLevel>100|| trickLevel < 0 );
        String foxy;
        if(trickLevel>50){
             foxy = "очень хитрый";
        }
        else{
             foxy = "почти не хитрый]" ;
        }
        System.out.println("Input habit");
        String habits = scanner.nextLine();

        Pet pet = new Pet(species, nickname, age, trickLevel, habits.split(","), foxy );
        return pet;
    }
}
