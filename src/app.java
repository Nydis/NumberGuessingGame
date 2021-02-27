import java.util.Scanner;
import java.util.Random;

public class app {

    public static void main(String[] args) {
        greeting();
        randomNumber();
        insert();
        correctnessTest(int rand,int insertedNumber);
    }

    static void greeting() {
        System.out.println("Welcome to the NumberGuessingGame!");
        System.out.println("The Rules are simple: Enter a Number between 0 and 100. If you guess the correct Number, you will win.");
    }

    static int randomNumber() {
        Random random = new Random();
        int rand = random.nextInt(100);
        System.out.println(rand);
        return rand;
    }

    static int insert() {
        Scanner scanner = new Scanner(System.in);
        int insertedNumber = scanner.nextInt();
        return insertedNumber;
    }

    static void correctnessTest(int rand, int insertedNumber) {
        if (insertedNumber == rand) {
            System.out.println("You Win!");
        } else if (insertedNumber > rand) {
            System.out.println("Inserted Number is too high, please try again!");
        } else if (insertedNumber < rand) {
            System.out.println("Inserted Number is too low, please try again!");
        } else {
            System.out.println("Wrong Input, please insert a Number from 0 - 100");
        }
    }

}

