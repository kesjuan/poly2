import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Animal {
    private String name, food;
    private String speak = "";
//public Animal Dog;
    public Animal(String name, String food, String speak) {
        this.name = name;
        this.food = food;
        this.speak = speak;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

       public Animal createAnimal(){
               Animal animal = new Animal("","","");

               return animal;
           }

    public void makeNoise(Animal animal){
        if (animal instanceof Dog ){
            System.out.println(animal.speak);
        }
        else if (animal instanceof Cat){
            System.out.println(animal.speak);
        }
        else {
            System.out.println("");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", speak='" + speak + '\'' +
                '}';
    }

    public Dog placeDog(String animalName){
            Dog dog = new Dog(animalName,"Dog Food", "woof woof");
        return dog;
    }
    public Cat placeCat(String animalName){
        Cat cat = new Cat(animalName,"Catfood", "meow");
        return cat;
    }

           public Pig placePig(String animalName){
               Pig pig = new Pig(animalName,"Pigfood", "Oink oink");
               return pig;
           }
    public Animal animalReader(String animal, String animalName){
       Animal animalType = new Animal("null",null,null);
        if (animal.matches("dog") || animal.matches("Dog")){
            Dog dog1 = new Dog(animalName, "Dogfood", "bark bark") ;
           // animalType = "Dog";
              // dog1.createDog().setName(animalName);
            animalType = placeDog(animalName);

        }
        else if (animal.matches("cat") || animal.matches("Cat")) {
            Cat cat1 = new Cat(animalName,"catfood","meow meow");
            animalType = placeCat(animalName);
            //createCat
        }
        else if (animal.matches("pig") || animal.matches("Pig")) {
        Pig pig1 = new Pig(animalName, "pigfood","oink oink");
         animalType = placePig(animalName);

        }

          return animalType ;
    }

       public void loopInfo(Animal[] petsInfo) {
        String str = " ";
        for (int y = 0; y < petsInfo.length; y++) {
           // str = petsInfo[y].toString();
            System.out.println(petsInfo[y].getName());
            makeNoise(petsInfo[y]);
            System.out.println(petsInfo[y].getFood());
        }
             //return str;
       }



















    public void typeOfAnimal(int amount){
        if (amount == 1) {
            Scanner scan1 = new Scanner(System.in);
            System.out.print("What kind of animal is it? ");
            String type = scan1.nextLine().trim();
            System.out.print("What is its name? ");
            String animalName = scan1.nextLine().trim();
            animalReader(type,animalName);
            Animal[] pets = new Animal[1];
            pets[0] = animalReader(type,animalName);
            loopInfo(pets);

        } else if (amount == 2) {
            //Animal animal ;
           //Animal animal1;
            Scanner scan1 = new Scanner(System.in);
            System.out.print("What kind of animal is the first? ");
           String type1 = scan1.nextLine().trim();
            System.out.print("What is its name? ");
            String animalName = scan1.nextLine().trim();
           animalReader(type1, animalName);
          // scan1.nextLine();
            System.out.print("What kind of animal is the second? ");
            String type2 = scan1.nextLine().trim();
            System.out.print("What is its name? ");
            String animalName1 = scan1.nextLine().trim();
            animalReader(type2, animalName1);
            Animal[] pets = new Animal[2];
            pets[0] = animalReader(type1,animalName);
            pets[1] = animalReader(type2,animalName1);
            //String[] PetNames = new String[2];
            loopInfo(pets);


        } else if (amount == 3) {
            Scanner scan1 = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            System.out.print("What kind of animal is the first? ");
            String type1 = scan1.nextLine().trim();
            System.out.print("What is its name? ");
            String animalName = scan1.nextLine().trim();
            animalReader(type1, animalName);
            //scan1.nextLine();
            System.out.print("What kind of animal is the second? ");
            String type2 = scan1.nextLine().trim();
            System.out.print("What is its name? ");
            String animalName1 = scan1.nextLine().trim();
            animalReader(type2,animalName1);
            System.out.print("What kind of animal is the third? ");
            String type3 = scan2.nextLine().trim();
            System.out.print("What is its name? ");
            String animalName2 = scan2.nextLine().trim();
            animalReader(type3,animalName2);
            Animal[] pets = new Animal[3];
            pets[0]= animalReader(type1,animalName);
            pets[1]= animalReader(type2, animalName1);
            pets[2]= animalReader(type3, animalName2);
            loopInfo(pets);
            //String[] petNames = new String[3];
        } else if (amount == 4) {
            Scanner scan1 = new Scanner(System.in);
            Scanner scan2 = new Scanner(System.in);
            System.out.print("What kind of animal is the first? ");
            String type1 = scan1.nextLine().trim();
            System.out.print("What is its name? ");
            String animalName = scan1.nextLine().trim();
            animalReader(type1,animalName);
            //scan1.nextLine();
            System.out.print("What kind of animal is the second? ");
            String type2 = scan1.nextLine().trim();
            System.out.print("What is its name? ");
            String animalName1 = scan1.nextLine().trim();
            animalReader(type2,animalName1);
            System.out.print("What kind of animal is the third? ");
            String type3 = scan2.nextLine().trim();
            System.out.print("What is its name? ");
            String animalName2 = scan2.nextLine().trim();
            animalReader(type3,animalName2);
            System.out.print("What kind of animal is the fourth? ");
            String type4 = scan2.nextLine().trim();
            System.out.print("What is its name? ");
            String animalName3 = scan2.nextLine().trim();
            animalReader(type4,animalName3);
            Animal[] pets = new Animal[4];
            pets[0] = animalReader(type1,animalName);
            pets[1] = animalReader(type2,animalName1);
            pets[2] = animalReader(type3,animalName2);
            pets[3] = animalReader(type4, animalName3);
            loopInfo(pets);
            //String[] petNames = new String[4];

        }

    }

    public void numberOfPets(int amount){
        Scanner scan1 = new Scanner(System.in);
        amount = scan1.nextInt();
        if (amount == 1){
            typeOfAnimal(1);
        } else if (amount == 2) {
            
        }


    }


}
