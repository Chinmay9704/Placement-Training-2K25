import java.util.Scanner;

public class countthedigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num; // Store original number
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);

        int[] digitCount = new int[10];
        num = originalNum; // Restore original number
        while (num > 0) {
            int digit = num % 10;
            digitCount[digit]++;
            num /= 10;
        }

        boolean hasRepeated = false;
        System.out.print("Repeated digits: ");
        for (int i = 0; i < 10; i++) {
            if (digitCount[i] > 1) {
                System.out.print(i + " ");
                hasRepeated = true;
            }
        }
        if (!hasRepeated) {
            System.out.print("None");
        }
        System.out.println(); // For clean output
    }
} 