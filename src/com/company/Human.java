package com.company;

public class Human {
    private  String name;
    private  String surname;
    private  int year;
    private  int iq;
    private  Pet pet;
    private  String[] humanHabit;
      Human father;
      Human mother;

        public void Human( String userName , String userSurname , int userYear , int userIq , Pet UserPet, String[] userHumanHabit ){
            setName(userName);
            setSurname(userSurname);
            setYear(userYear);
            setIq(userIq);
            setPet(UserPet);
            setHumanHabit(userHumanHabit);

        }
        public Human ( String userName , String userSurname , int userYear){
            setName(userName);
            setSurname(userSurname);
            setYear(userYear);

        }
        public Human ( String userName , String userSurname , int userYear , Human father , Human mother){
            setName(userName);
            setSurname(userSurname);
            setYear(userYear);
            this.father = father;
            this.mother = mother;
        }
        public Human(){

        }
        void sayHi(){
            System.out.println("Привет ,  " + pet.nickname);
        }
        void describePet(){
            System.out.println("У меня есть " + pet.species + ", ему " + pet.age + " лет , он  " + pet.foxy);
        }

     public String toString(){
        return String.format("%s{name = `%s` , surname = `%s` ,  year= %d , iq = %d , habits = %s}" , name , surname,year,iq , String.join(",", humanHabit) );
    }
    public void setName(String userName){
        this.name= userName;
    }
    public String getName(){
        return name;
    }

    public void setSurname(String userSurname){
        this.surname= userSurname;
    }
    public String getSurname(){
        return surname;
    }

    public void setYear(int userYear){
        this.year= userYear;
    }
    public int getYear(){
        return year;
    }

    public  void setIq(int userIq){this.iq = userIq;}
    public int getIq(){return iq;}

    public void setPet(Pet userPet){ this.pet = userPet;}
    public Pet getPet(){return pet;}

    public void setHumanHabit(String[] userHumanHabit){this.humanHabit = userHumanHabit;}
    public String getHumanHabit(){return humanHabit; }
}
