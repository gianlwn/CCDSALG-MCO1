import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();

        int size = inputStr.length();
        //System.out.println(n);

        String[] suffixArr = new String[size];

        for (int i = 0; i < size; i++) {
            suffixArr[i] = inputStr.substring(i, size);
        }

        int width = String.valueOf(size - 1).length();
        for (int i = 0; i < size; i++) {
            System.out.printf("%" + width + "d: %-15s%n", i, suffixArr[i]);
        }
            
        sc.close();
    }
}
