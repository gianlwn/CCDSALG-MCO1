public class SelectionSort {
    private static void swap(String[] suffixesArr, int[] indicesArr, int i, int minIdx) {
        String temp = suffixesArr[i];
        suffixesArr[i] = suffixesArr[minIdx];
        suffixesArr[minIdx] = temp;

        int nTemp = indicesArr[i];
        indicesArr[i] = indicesArr[minIdx];
        indicesArr[minIdx] = nTemp;
    }
    
    public static void selectionSort(String[] suffixesArr, int[] indicesArr, int size) {
        for (int i = 0; i < size - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < size; j++)
                if (suffixesArr[j].compareTo(suffixesArr[minIdx]) < 0)
                    minIdx = j;

            // swap
            swap(suffixesArr, indicesArr, i, minIdx);
        }
    }
}
