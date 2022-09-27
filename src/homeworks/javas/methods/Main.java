package javas.methods;

public class Main {

    public static void main(String[] args) {
        findThisNumber();

    }

    public static void findThisNumber() {
        int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
        int findThisNumber = 5;
        boolean anyHave = false;

        for (int number : numbers) {
            if (number == findThisNumber) {
                anyHave = true;
                break;
            }
        }
        if (anyHave) {
            printMessage("I am hereeeee!!!!: " + findThisNumber);
        } else {
            printMessage("No, try again " + findThisNumber);
        }
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

}
