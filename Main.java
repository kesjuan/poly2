import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal pet = new Animal("null", "food", "null");
        Scanner scan1 = new Scanner(System.in);
        System.out.print("How many pets do you have? ");
        int amount = scan1.nextInt();
        pet.typeOfAnimal(amount);






    }


}
