import java.util.Arrays;

public class Array {
    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    public void sortArray() {
        Arrays.sort(array);
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }

    public int findIndexArray(int startIndex, int value) {
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
