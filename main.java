import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        NumberFinder numberFinder = new NumberFinder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Enter number " + (i + 1) + ":");
            int number = scanner.nextInt();
            numberFinder.nums.add(number);
        }

        System.out.println("Checking numbers...");
        numberFinder.numsChecker();
        
    }
}
