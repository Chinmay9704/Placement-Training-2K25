import java.util.Scanner;
public class missingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Missing Numbers:");
        for (int i = 0; i < n; i++) {
            int diff = arr[i+1] - arr[i];
            if (diff > 1) {
                for (int j = 1; j < diff; j++) {
                    System.out.println((arr[i] + j)+" ");
                }
            
            }
        }
    }
}
