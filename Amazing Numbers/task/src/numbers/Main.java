package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a natural number:");
        String input = sc.next();
        int inputAsInt = Integer.parseInt(input);

        if (inputAsInt == 0) {
            System.out.println(inputAsInt + " is not natural.");
            System.exit(1);
        } else if (inputAsInt < 0) {
            System.out.println("This number is not natural!");
            System.exit(1);
        }


        String OddOrEven = "Odd";
        if (inputAsInt % 2 == 0) {
            OddOrEven = "Even";
        }

        boolean isBuzzNumber = false;
        boolean endsWithSeven = false;
        boolean divisibleBy7 = false;

        if (input.charAt(input.length() - 1) == '7') {
            isBuzzNumber = true;
            endsWithSeven = true;
        }
        if (inputAsInt % 7 == 0) {
            isBuzzNumber = true;
            divisibleBy7 = true;
        }

        String secondline = isBuzzNumber ? "It is a Buzz number.\n" : "It is not a Buzz number.\n";

        String explanation = "";
        if (isBuzzNumber == false) {
            explanation = " is neither divisible by 7 nor it ends with 7.";
        }
        if (isBuzzNumber && endsWithSeven) {
            explanation = " is ends with 7";
        }
        if (isBuzzNumber && divisibleBy7) {
            explanation = " is divisible by 7.";
        }
        if (isBuzzNumber && endsWithSeven && divisibleBy7) {
            explanation = " is divisible by 7 and it ends with 7.";
        }


        String lastLine = input + explanation;

        System.out.println("This number is " + OddOrEven + ".\n" +
                secondline +
                "Explanation:\n" +
                lastLine);


    }
}
