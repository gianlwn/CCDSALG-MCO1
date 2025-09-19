public class SelectionSort {
    private static void swap(String[] suffixesArr, int[] sfxArr, int i, int minIdx) {
        String temp = suffixesArr[i];
        suffixesArr[i] = suffixesArr[minIdx];
        suffixesArr[minIdx] = temp;

        int nTemp = sfxArr[i];
        sfxArr[i] = sfxArr[minIdx];
        sfxArr[minIdx] = nTemp;
    }
    
    public static void selectionSort(String[] suffixesArr, int[] sfxArr, int size) {
        for (int i = 0; i < size - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < size; j++)
                if (suffixesArr[j].compareTo(suffixesArr[minIdx]) < 0)
                    minIdx = j;

            // swap
            swap(suffixesArr, sfxArr, i, minIdx);
        }
    }
}
