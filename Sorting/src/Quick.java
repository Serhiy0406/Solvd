public class Quick {
    public static void main(String[] args) {
        int[] arr = {6,2,8,3,9,4,-3,0,29,-1};
        int left = 0;
        int right = arr.length-1;

        System.out.println("Array: ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        quickSort(left, right, arr);

        System.out.println("");
        System.out.println("Sorted array: ");
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    private static void quickSort(int left, int right, int[] array) {

        int i = left;
        int j = right;
        int pivot = array[left+(right-left)/2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchange(i, j, array);
                i++;
                j--;
            }
        }
        if (left < j)
            quickSort(left, j, array);
        if (i < right)
            quickSort(i, right, array);
    }

    private static void exchange(int i, int j, int[] array) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}