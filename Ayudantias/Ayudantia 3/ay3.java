public class ay3 {
    public static void main(String[] args) {
        int[] arr1 = {1,8,2,6,2,3,5};
        int[] arr2 = {1,8,2,6,2,3,5};
        int[] arr3 = {1,8,2,6,2,3,5};

        bubbleSort(arr1);
        selectionSort(arr2);
        insertionSort(arr3);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println("\n");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int j = i -1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}