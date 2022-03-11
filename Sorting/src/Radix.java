public class Radix {
    public static void main(String[] args) {
        //
        int[] arr = {121, 432, 564, 23, 1, 45, 788};
        ArrayPrint(arr);
        int max = FindMax(arr);
        int x = (int) Math.ceil(Math.log10(max));
        for (int i = 0; i < x; i++) {
            arr = SortArray(arr, i);
        }
        ArrayPrint(arr);
    }

    public static int FindMax(int[] arr) {
        int max = -10;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void ArrayPrint(int[] arr) {
        System.out.print("(");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print(")");
        System.out.println("");
    }

    public static int[] SortArray(int[] arr, int x) {
        int[] temp = new int[arr.length];
        int[] countArr;
        int[] outputArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            outputArr[i] = arr[i];
            temp[i] = arr[i] / (int) (Math.pow(10, x)) % 10;
        }
        int max = FindMax(temp);
        countArr = new int[max + 1];
        for (int i = 0; i < countArr.length; i++) {
            int count = 0;
            for (int j = 0; j < temp.length; j++) {
                if (temp[j] == i) {
                    count++;
                }
            }
            countArr[i] = count;
        }
        for (int i = 1; i < countArr.length; i++) {
            countArr[i] += countArr[i - 1];
        }
        //int i=0; i<temp.length;i++ don't worked
        for (int i = temp.length - 1; i >= 0; i--) {
            outputArr[countArr[temp[i]] - 1] = arr[i];
            countArr[temp[i]]--;
        }
        return outputArr;
    }
}
