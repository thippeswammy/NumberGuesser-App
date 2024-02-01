import java.io.IOException;
import java.util.Scanner;

class NumberGuesser {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String response;
        int score = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.print("Would you like to play? (y/n): >>> ");
        response = scanner.nextLine().toLowerCase();
        if (response.equals("y")) {
            System.out.println("\nGreat! Think of a number between 1 and 100.");
            System.out.println("I will try to guess it by asking a few questions.");

            System.out.println("\n2,3,6,7,10,11,14,15,18,19");
            System.out.println("22,23,26,27,30,31,34,35,38,39");
            System.out.println("42,43,47,48,50,51,54,55,58,59");
            System.out.println("62,63,67,70,71,74,75,78,79");
            System.out.println("82,83,86,87,90,91,94,95,98,99");
            System.out.print("Is the number here? (y/n): >>> ");
            response = scanner.nextLine().toLowerCase();
            if (response.equals("y")) score = score + 2;
            System.out.println("\n4,5,6,7,12,13,14,15,20");
            System.out.println("21,22,23,28,29,30,31,36,37,38,39");
            System.out.println("44,45,46,47,52,53,54,55,60");
            System.out.println("61,62,63,66,68,69,70,71,76,77,78,79");
            System.out.println("84,85,86,87,92,93,94,95");
            System.out.print("Is the number here? (y/n): >>> ");
            response = scanner.nextLine().toLowerCase();
            if (response.equals("y")) score = score + 4;
            System.out.println("\n1,3,5,7,9,11,13,15,17,19,21,23,25,27,39,41,43,45,47,49");
            System.out.println("51,53,57,59,61,63,65,67,79,81,83,85,87,89,91,93,97,99>>>");
            System.out.print("Is the number here? (y/n): >>> ");
            response = scanner.nextLine().toLowerCase();
            if (response.equals("y")) score = score + 1;
            System.out.println("\n16,17,18,19,20,21,22,23,24,25,26,27,28,29,30");
            System.out.println("31,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,66,80");
            System.out.println("81,82,83,84,85,86,87,88,89,90,91,92,93,94,95>>>");
            System.out.print("Is the number here? (y/n): >>> ");
            response = scanner.nextLine().toLowerCase();
            if (response.equals("y")) score = score + 16;
            System.out.println("\n8,9,10,11,12,13,14,15,24,25,26");
            System.out.println("27,28,29,30,31,40,41,42,43,44,45,46,47");
            System.out.println("56,57,58,59,60,61,62,63,66,72,73,74,75");
            System.out.println("76,77,78,79,88,89,90,91,92,93,94,95>>>");
            System.out.print("Is the number here? (y/n): >>> ");
            response = scanner.nextLine().toLowerCase();
            if (response.equals("y")) score = score + 8;
            System.out.println("\n32,33,34,35,36,37,38,39,40");
            System.out.println("41,42,43,44,45,46,47,48,49,50");
            System.out.println("51,52,53,54,55,56,57,58,59");
            System.out.println("60,61,62,63,66,96,97,98,99>>>");
            System.out.print("Is the number here? (y/n): >>> ");
            response = scanner.nextLine().toLowerCase();
            if (response.equals("y")) score = score + 32;
            System.out.println("\n64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79");
            System.out.println("80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99>>>");
            System.out.print("Is the number here? (y/n): >>> ");
            response = scanner.nextLine().toLowerCase();
            if (response.equals("y")) score = score + 6;
            System.out.println("\n69,70,71,72,73,74,75,76,77");
            System.out.println("78,79,80,81,82,83,84,85,86");
            System.out.println("87,88,89,90,91,92,93,94,95,96,97,98,99");
            System.out.print("Is the number here? (y/n): >>> ");
            response = scanner.nextLine().toLowerCase();
            if (response.equals("y")) score = score + 58;
            System.out.println("\n\nYour answer is = " + score);
        } else {
            System.out.println("Thank you for considering. Have a great day!");
        }
    }
}
 
