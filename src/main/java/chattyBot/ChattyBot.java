package chattyBot;

import java.util.Scanner;

class ChattyBot {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greet("Aid", "2018");
        remindName();
        guessAge();
        count();
        test();
    }

    static void greet (String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in" + " " + birthYear + ".");
        System.out.println("Please, remind me you name.");
    }

    static void remindName() {
        String name = scanner.next();
        System.out.println("What a great name you have" + "," + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int reminder3 = scanner.nextInt();
        int reminder5 = scanner.nextInt();
        int reminder7 = scanner.nextInt();
        int myAge = (reminder3 * 70 + reminder5 * 21 + reminder7 * 15) % 105;
        System.out.println("Your age is" + " " + myAge + ";" + " " + "that's a good time to start programming ");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int anyNumber = scanner.nextInt();
        for (int i = 0; i <= anyNumber; i++) {
            System.out.println(i + "!");
        }

    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat statement multiply times.");
        System.out.println("2. To decompose program into several small subroutines");
        System.out.println("3. To determine the execution time of program.");
        System.out.println("4. To interrupt the execution of a program. ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
            case 3:
            case 4:
                System.out.println("Please try again");
                test();
                break;
            case 2:
                end();
                break;

        }

    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
