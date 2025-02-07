package algunit;

public class SortClass {

    public static void main(String[] args) {
        int[] a = {5, 3, 4, 1, 2};
        bubbleSort(a);
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void insertSort(int[] a) {
        var lenght = a.length;
        for (int i = 1; i < lenght; i++) {
            int k = i;
            while (k > 0 && a[k - 1] > a[k]) {
                int temp = a[k];
                a[k] = a[k - 1];
                a[k - 1] = temp;
                k--;
            }

        }
    }

    public static void choiceSort(int[] a) {
        var len = a.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[j] < a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }

            }
        }
    }

    public static void bubbleSort(int[] a) {
        var len = a.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }
        }
    }

}
