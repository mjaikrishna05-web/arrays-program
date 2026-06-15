//Two Sum Program:
import java.util.Scanner;
public class TwoSum{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[4];
    int target = sc.nextInt();
    for(int i = 0; i<4; i++){
      nums[i] = sc.nextInt();
    }
    for(int i = 0; i<4 ; i++){
      for(int j = i+1; j<4; j++){
        if(nums[i] + nums[j] == target){
          System.out.print("indices:" + i + j);
          return;
        }
      }
    }
  }
}

//maximum subarray:
import java.util.Scanner;
public class Subarray{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[9];
    for(int i = 0; i<9; i++){
      nums[i] = sc.nextInt();
    }
    int largest = nums[0];
    for(int i = 0; i<9 ; i++){
      int sum = 0;
      for(int j = i; j<9; j++){
        sum = sum + nums[j];
        if(sum>largest){
          largest = sum;
        }
      }
    }
    System.out.print(largest);
  }
}

//valid palindrome:
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String r = s.replaceAll("[^a-zA-Z0-9]", "");
        String rev = "";

        for (int i = r.length() - 1; i >= 0; i--) {
            rev = rev + r.charAt(i);
        }
        if (r.equals(rev)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}

//longest substring without repeating characters:

import java.util.Scanner;
public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                boolean[] visited = new boolean[256];
                boolean isUnique = true;
                for (int k = i; k <= j; k++) {
                    char ch = s.charAt(k);

                    if (visited[ch]) {
                        isUnique = false;
                        break;
                    }
                    visited[ch] = true;
                }
                if (isUnique) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
      System.out.println(maxLen);
    }
}
