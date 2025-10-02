public class QuickSort {
    private static void swap(String[] suffixesArr, int[] indicesArr, int i, int j) {
        String temp = suffixesArr[i];
        suffixesArr[i] = suffixesArr[j];
        suffixesArr[j] = temp;

        int nTemp = indicesArr[i];
        indicesArr[i] = indicesArr[j];
        indicesArr[j] = nTemp;
    }

    private static int partition(String[] suffixesArr, int[] indicesArr, int low, int high) {
        String pivot = suffixesArr[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (suffixesArr[j].compareTo(pivot) < 0) {
                i++;
                swap(suffixesArr, indicesArr, i, j);
            }
        }

        i++;
        swap(suffixesArr, indicesArr, i, high);
        return i;
    }
    
    public static void quickSort(String[] suffixesArr, int[] indicesArr, int low, int high) {
        if (low < high) {
            int p = partition(suffixesArr, indicesArr, low, high);

            quickSort(suffixesArr, indicesArr, low, p - 1);
            quickSort(suffixesArr, indicesArr, p + 1, high);
        }
    }
}
