public class Selection {
    public static void main(String[] args) {
        int[] arr = {6,2,8,3,9,4,-3,0,29,-1};
        int value = 0;

        System.out.println("Array: ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");


        int minIndex = 0;
        for(int i=0; i < arr.length; i++){
            int minValue = 100;
            for(int j=i; j < arr.length; j++){
                if(arr[j] < minValue){
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            value = arr[i];
            arr[i] = minValue;
            arr[minIndex] = value;

        }

        System.out.println("");
        System.out.println("Sorted array: ");
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
