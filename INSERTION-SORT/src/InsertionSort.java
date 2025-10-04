public class InsertionSort {
    public static void insertionSort(String[] suffixesArr, int[] indicesArr, int size) {
        for (int i = 1; i < size; ++i) {
            String sfxKey = suffixesArr[i];
            int indKey = indicesArr[i];
            int j = i - 1;

            while (j >= 0 && (suffixesArr[j].compareTo(sfxKey) > 0)) {
                suffixesArr[j + 1] = suffixesArr[j];
                indicesArr[j + 1] = indicesArr[j];
                j--;
            }

            suffixesArr[j + 1] = sfxKey;
            indicesArr[j + 1] = indKey;
        }
    }
}
