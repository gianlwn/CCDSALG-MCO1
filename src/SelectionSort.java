public class SelectionSort {
    public static void swap(String[] sfxArr, int i, int minIdx) {
        String temp = String sfxArr[i];
        sfxArr[i] = sfxArr[minIdx];
        sfxArr[minIdx] = temp;
    }
    
    public static void selectionSort(String[] sfxArr, int size) {
        for (int i = 0; i < size - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < size; j++) {
                if (sfxArr[j].compareTo(sfxArr[minIdx]) < 0) {
                    minIdx = j;
                }
            }

            // swap
            swap(sfxArr, i, minIdx);
        }
    }
}
