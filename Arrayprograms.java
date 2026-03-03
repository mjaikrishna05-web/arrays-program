public class ArrayPrograms {
    public static void main(String[] args) {
         //1) Maximum and Minimum in Array:
        int[] arr1 = {10, 5, 20, 8, 25};
        int max = arr1[0];
        int min = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }
        System.out.println("Maximum is: " + max);
        System.out.println("Minimum is: " + min);

        // 2) Sum of 2D Array is:
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int sum2D = 0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                sum2D += arr2[i][j];
            }
        }
        System.out.println("Sum of 2D Array: " + sum2D);

         // 3) Pattern 1 is:
        int n = 4;
        System.out.println("\nPattern 1:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 4)Pattern 2 is:
        for (int i = 1; i <= n; i++) {
            for (int space = 1; space <= n - i; space++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 5) Sum of Elements in Array:
        int[] arr3 = {5, 10, 15, 20};
        int sum = 0;
        for (int i = 0; i < arr3.length; i++) {
            sum += arr3[i];
        }
        System.out.println("Sum of Array: " + sum);

        // 6) Count Even and Odd Numbers:
        int[] arr4 = {1, 2, 3, 4, 5, 6};
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even Count: " + even);
        System.out.println("Odd Count: " + odd);

        // 7) Pattern 3:
        System.out.println("\nPattern 3:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 8) Pattern 4:
        System.out.println("\nPattern 4:");
        for (int i = n; i >= 1; i--) {
            for (int space = 0; space < n - i; space++) {
                System.out.print("  ");
            }
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    
}
}
