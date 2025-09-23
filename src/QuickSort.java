public class QuickSort {
    private static void swap(String[] suffixesArr, int[] sfxArr, int i, int j) {
        String temp = suffixesArr[i];
        suffixesArr[i] = suffixesArr[j];
        suffixesArr[j] = temp;

        int nTemp = sfxArr[i];
        sfxArr[i] = sfxArr[j];
        sfxArr[j] = nTemp;
    }

    private static int partition(String[] suffixesArr, int[] sfxArr, int low, int high) {
        String pivot = suffixesArr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (suffixesArr[j].compareTo(pivot) < 0) {
                i++;
                swap(suffixesArr, sfxArr, i, j);
            }
        }

        i++;
        swap(suffixesArr, sfxArr, i, high);
        return i;
    }
    
    public static void quickSort(String[] suffixesArr, int[] sfxArr, int low, int high) {
        if (low < high) {
            int p = partition(suffixesArr, sfxArr, low, high);

            quickSort(suffixesArr, sfxArr, low, p - 1);
            quickSort(suffixesArr, sfxArr, p + 1, high);
        }
    }
}
