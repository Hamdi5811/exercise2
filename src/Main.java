import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] temperatures = {45, 29, 10, 22, 41, 28, 33};
        double[] probabilities = {0.95, 0.6, 0.25, 0.05, 0.0, 0.75, 0.9};


        for (int i = 0; i < 7; i++) {

            if (temperatures[i] <= 32) {

                if (probabilities[i] > 0.5) {

                    System.out.println("Day " + (i + 1) + ": It's likely to snow.");
                } else {
                    System.out.println("Day " + (i + 1) + ": It's not likely to snow.");
                }
            } else {
                System.out.println("Day " + (i + 1) + ": The high temperature is above 32 degrees Fahrenheit.");
            }
        }
    }
}