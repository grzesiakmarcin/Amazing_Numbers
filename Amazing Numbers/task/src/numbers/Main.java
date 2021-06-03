package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Numero workWithNewNumber = new Numero(sc.nextInt());
        System.out.println( workWithNewNumber.toString());

//        System.out.println("Enter a natural number:");
//        String input = sc.next();
//        int inputAsInt = Integer.parseInt(input);
//
//        if (inputAsInt == 0) {
//            System.out.println(inputAsInt + " is not natural.");
//            System.exit(1);
//        } else if (inputAsInt < 0) {
//            System.out.println("This number is not natural!");
//            System.exit(1);
//        }


    }
}

class Numero {

    int numberInt;
    boolean even;
    boolean odd;
    boolean buzz;
    boolean duck;

    public Numero(int number) {
        this.numberInt = number;
    }

    public void isEvenOrOddMethod(int n) {
        if (n % 2 == 0) {
            setEven(true);
            setOdd(false);
        }
        else {
            setEven(false);
            setOdd(true);
        }
    }

    public void isDuckMethod(int n) {
        System.out.println("pusta metoda - drukuje liczbe: " + n);
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
//            divisibleBy7 = true;
//        }

//     String secondline = isBuzzNumber ? "It is a Buzz number.\n" : "It is not a Buzz number.\n";
//
//      String explanation = "";
//        if (isBuzzNumber == false) {
//          //  explanation = " is neither divisible by 7 nor it ends with 7.";
//        }
//        if (isBuzzNumber && endsWithSeven) {
//       //     explanation = " is ends with 7";
//        }
//        if (isBuzzNumber && divisibleBy7) {
//        //    explanation = " is divisible by 7.";
//        }
//        if (isBuzzNumber && endsWithSeven && divisibleBy7) {
//       //     explanation = " is divisible by 7 and it ends with 7.";
//        }

//
//        String lastLine = n + explanation;
//
//        System.out.println("This number is " + OddOrEven + ".\n" +
//                secondline +
//                "Explanation:\n" +
//                lastLine);

    }

}


    @Override
    public String toString() {
        isEvenOrOddMethod(numberInt);
        isBuzzMethod(numberInt);
        isDuckMethod(numberInt);
        return "Property of " + getNumber() +
                "\neven: " + even +
                "\nodd: " + odd +
                "\nbuzz: " + buzz +
                "\nduck :" + duck;
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