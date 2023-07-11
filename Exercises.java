import java.util.Scanner;
import java.util.Arrays;
public class Exercises {
    public static void main(String[] args) {
        Exercises ec = new Exercises();
        ec.problem8();

    }
    public void problem1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number >>> ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number >>> ");
        int num2 = sc.nextInt();
        System.out.println("Your sum is " + (num1 + num2));
    } //add 2 strings
    public void problem2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Find the multiples of >>> ");
        int multiple = sc.nextInt();
        for (int i = 0; i <= 12; i++) {
            System.out.println(multiple + " x " + i + " = " + (i*multiple));
        }
    } //multiples
    public void problem3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number >>> ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number >>> ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is greater");
        } else if (num2 > num1) {
            System.out.println(num2 + " is greater");
        } else {
            System.out.println(num1 + " and " + num2 + " are equal");
        }
    } //greater or less than
    public void problem4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string to reverse >>> ");
        String word = sc.nextLine();
        char[] letters = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            letters[i] = word.charAt(i);
        }
        System.out.print(word + " reversed >>> ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    } // reverse string
    public void problem5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string >>> ");
        String word = sc.nextLine();
        int letter = 0;
        int num = 0;
        int space = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                space++;
            } else if (Character.isDigit(word.charAt(i))) {
                num++;
            } else {
                letter++;
            }
        }
        System.out.println("Your string has " + letter + " letters, " + num + " numbers, and " + space + " spaces");
    } // count num, letter, space
    public void problem6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first word >>> ");
        String word1 = sc.nextLine();
        System.out.print("Enter your second word >>> ");
        String word2 = sc.nextLine();
        char arr1[] = new char[word1.length()];
        char arr2[] = new char[word2.length()];
        int len = word1.length();
        if (word1.length() != word2.length()) {
            System.out.println(word1 + " and " + word2 + " are not anagram pairs");
        } else {
            for (int i = 0; i < len; i++) {
                arr1[i] = word1.charAt(i);
                arr2[i] = word2.charAt(i);
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            String wordOne = new String(arr1);
            String wordTwo = new String(arr2);
            if (wordOne.equals(wordTwo)) {
                System.out.println(word1 + " and " + word2 + " are anagram pairs");
            } else {
                System.out.println(word1 + " and " + word2 + " are not anagram pairs");
            }
        }
    } //anagram pairs
    public void problem7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word >>> ");
        String str = sc.nextLine();
        String revStr = "";
        for (int i = str.length(); i >= 1; i--) {
            revStr += str.substring(i - 1, i);
        }
        if (str.equals(revStr)) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    } // palendrome
    public void problem8() {
        
    }
}
