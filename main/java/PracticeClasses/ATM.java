package PracticeClasses;

import java.util.Scanner;

public class ATM {
    // Fields
    public int enteredPin = 0, privatePin = 1234, attempts = 3;
    public boolean exit = false;

    // Methods
    public String checkPin() {
        if (enteredPin == privatePin) {
            exit = true;
            return "Correct, congrats! Here's your money: $$$$$$";
        } else {
            attempts--;
            return "Incorrect PIN, please try again...";
        }
    }

    public int getInputNum() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public boolean isOverAttempts() {
        if (attempts <= 0)
            return true;
        return false;
    }
}