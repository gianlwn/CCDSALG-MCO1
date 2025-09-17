public class SelectionSort {
    public static void swap(String[] unsortedStrings, int[] sfxArr, int i, int minIdx) {
        String temp = unsortedStrings[i];
        unsortedStrings[i] = unsortedStrings[minIdx];
        unsortedStrings[minIdx] = temp;

        int nTemp = sfxArr[i];
        sfxArr[i] = sfxArr[minIdx];
        sfxArr[minIdx] = nTemp;
    }
    
    public static void selectionSort(String[] unsortedStrings, int[] sfxArr, int size) {
        for (int i = 0; i < size - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < size; j++) {
                if (unsortedStrings[j].compareTo(unsortedStrings[minIdx]) < 0) {
                    minIdx = j;
                }
            }

            // swap
            swap(unsortedStrings, sfxArr, i, minIdx);
        }
    }
}
