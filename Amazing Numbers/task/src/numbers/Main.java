package numbers;

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
            String inputS = sc.next();
            long input = Long.valueOf(inputS);
            if (input < 0) {
                System.out.println("The first parameter should be a natural number or zero.\n"
                        + "Enter a request:");

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

    long numberLong;
    boolean even;
    boolean odd;
    boolean buzz;
    boolean duck;
    boolean palimdromic;

    public Numero(long number) {
        this.numberLong = number;
    }

    public void isEvenOrOddMethod(long n) {
        if (n % 2 == 0) {
            setEven(true);
            setOdd(false);
        } else {
            setEven(false);
            setOdd(true);
        }
    }

    public void isDuckMethod(long n) {
        String input = String.valueOf(n);

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == '0') {
                setDuck(true);
            }
        }

    }

    public void isBuzzMethod(long n) {


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

    public void isPalindromic(long n) {
        String val = String.valueOf(n);
        StringBuilder sb = new StringBuilder(val).reverse();
        if (sb.toString().equals(val)) {
            palimdromic = true;
        } else palimdromic = false;
    }

    @Override
    public String toString() {
        isEvenOrOddMethod(numberLong);
        isBuzzMethod(numberLong);
        isDuckMethod(numberLong);
        isPalindromic(numberLong);
        return "Properties of " + getNumber() +
                "\n      even: " + even +
                "\n       odd: " + odd +
                "\n      buzz: " + buzz +
                "\n     duck : " + duck +
                "\nPALINDROMIC: " + palimdromic;
    }


    public long getNumber() {
        return numberLong;
    }

    public void setNumber(int number) {
        this.numberLong = number;
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