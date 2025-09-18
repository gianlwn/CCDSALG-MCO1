public class SelectionSort {
    public static void swap(String[] unsortedSfx, int[] sfxArr, int i, int minIdx) {
        String temp = unsortedSfx[i];
        unsortedSfx[i] = unsortedSfx[minIdx];
        unsortedSfx[minIdx] = temp;

        int nTemp = sfxArr[i];
        sfxArr[i] = sfxArr[minIdx];
        sfxArr[minIdx] = nTemp;
    }
    
    public static void selectionSort(String[] unsortedSfx, String[] sortedSfx, int[] sfxArr, int size) {
        for (int i = 0; i < size - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < size; j++)
                if (unsortedSfx[j].compareTo(unsortedSfx[minIdx]) < 0)
                    minIdx = j;

            // swap
            swap(unsortedSfx, sfxArr, i, minIdx);
        }

        for (int i = 0; i < size; i++)
            sortedSfx[i] = unsortedSfx[i];
    }
}
