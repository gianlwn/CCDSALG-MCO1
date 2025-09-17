public class SelectionSort {
    public static String selectionSort(String[] suffixArr, int size) {
        for (int i = 0; i < size - 1; i++) {
            int minIdx = i;

            for (int j = i + 1; j < size; j++) {
                if (suffixArr[j].compareTo(suffixArr[minIdx]) < 0) {
                    minIdx = j;
                }
            }

            // swap
        }

        return "";
    }
}
