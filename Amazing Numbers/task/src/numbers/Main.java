package numbers;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Amazing Numbers!\n" +
                "\n" +
                "Supported requests:\n" +
                "- enter a natural number to know its properties;\n" +
                "- enter 0 to exit." +
                "\nEnter a request:");


        while (true) {
            int input = sc.nextInt();
            if (input < 0) {
                System.out.println("The first parameter should be a natural number or zero.");

            } else if (input == 0) {
                System.out.println("Goodbye!");
                System.exit(1);
            } else {
                Numero workWithNewNumber = new Numero(input);
                System.out.println(workWithNewNumber.toString());
                System.out.println("\nEnter a request:");
            }
        }
    }
}

class Numero {

    int numberInt;
    boolean even;
    boolean odd;
    boolean buzz;
    boolean duck;
    boolean palimdromic;

    public Numero(int number) {
        this.numberInt = number;
    }

    public void isEvenOrOddMethod(int n) {
        if (n % 2 == 0) {
            setEven(true);
            setOdd(false);
        } else {
            setEven(false);
            setOdd(true);
        }
    }

    public void isDuckMethod(int n) {
        String input = String.valueOf(n);

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == '0') {
                setDuck(true);
            }
        }

    }

    public void isBuzzMethod(int n) {


        boolean isBuzzNumber = false;
        boolean endsWithSeven = false;
        boolean divisibleBy7 = false;

        if (String.valueOf(n).charAt(String.valueOf(n).length() - 1) == '7') {
            setBuzz(true);
            //   endsWithSeven = true;
        }
        if (n % 7 == 0) {
            setBuzz(true);

        }

    }

    public void isPalindromic(int n) {

    }

    @Override
    public String toString() {
        isEvenOrOddMethod(numberInt);
        isBuzzMethod(numberInt);
        isDuckMethod(numberInt);
        return "Properties of " + getNumber() +
                "\neven: " + even +
                "\nodd: " + odd +
                "\nbuzz: " + buzz +
                "\nduck :" + duck +
                "\npalindomic: " + palimdromic;
    }


    public int getNumber() {
        return numberInt;
    }

    public void setNumber(int number) {
        this.numberInt = number;
    }

    public boolean isEven() {
        return even;
    }

    public void setEven(boolean even) {
        this.even = even;
    }

    public boolean isOdd() {
        return odd;
    }

    public void setOdd(boolean odd) {
        this.odd = odd;
    }

    public boolean isBuzz() {
        return buzz;
    }

    public void setBuzz(boolean buzz) {
        this.buzz = buzz;
    }

    public boolean isDuck() {
        return duck;
    }

    public void setDuck(boolean duck) {
        this.duck = duck;
    }


}