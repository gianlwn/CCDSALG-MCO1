import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();

        int size = inputStr.length();
        //System.out.println(n);

        String[] unsortedStrings = new String[size];
        int [] sfxArr1 = new int[size];

        for (int i = 0; i < size; i++) {
            unsortedStrings[i] = inputStr.substring(i, size);
            sfxArr1[i] = i;
        }

        int width = String.valueOf(size - 1).length();
        for (int i = 0; i < size; i++) {
            System.out.printf("%" + width + "d: %-15s%n", sfxArr1[i], unsortedStrings[i]);
        }

        SelectionSort.selectionSort(unsortedStrings, sfxArr1, size);

        System.out.println("\nAfter selection sort: ");
        for (int i = 0; i < size; i++) {
            System.out.printf("%" + width + "d: %-15s%n", sfxArr1[i], unsortedStrings[i]);
        }
            
        sc.close();
    }
}
