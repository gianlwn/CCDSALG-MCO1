import java.util.Scanner;

public class DriverQuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputStr = sc.nextLine();
        int size = inputStr.length();

        String[] suffixesArr = new String[size];
        int [] sfxArr = new int[size];

        for (int i = 0; i < size; i++) {
            suffixesArr[i] = inputStr.substring(i, size);
            sfxArr[i] = i;
        }

        int width = String.valueOf(size - 1).length();
        System.out.println("\nAll suffixes: \n");
        for (int i = 0; i < size; i++)
            System.out.printf("%" + width + "d: %-15s%n", sfxArr[i], suffixesArr[i]);

        QuickSort.quickSort(suffixesArr, sfxArr, 0, size - 1);

        System.out.println("\nSorted suffixes: \n");
        for (int i = 0; i < size; i++)
            System.out.printf("%" + width + "d: %-15s%n", sfxArr[i], suffixesArr[i]);

        System.out.println("\nSuffix array: \n");
        for (int i = 0; i < size; i++)
            if (i == size - 1)
                System.out.print(sfxArr[i]);
            else
                System.out.print(sfxArr[i] + ", ");
            
        sc.close();
    }
}
