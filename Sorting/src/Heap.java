import java.util.Arrays;
import java.util.List;

public class Heap {
    public static void main(String[] args) {
        int[] arr = {6,2,8,3,9,4,-3,0,29,-1};
        int size = arr.length;
        int value = 0;
//        Index of left child= 2*(index of its parent)+1
//        Index of right child= 2*(index of its parent)+2
        System.out.println("Array: ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        while(size > 1){
            for(int i = size - 1; i>=0; i--){
                if(2*(i)+2 < size && arr[2*(i)+2] > arr[i]){
                    value = arr[i];
                    arr[i] = arr[2*(i)+2];
                    arr[2*(i)+2] = value;
                }
                if(2*(i)+1 < size && arr[2*(i)+1] > arr[i]){
                    value = arr[i];
                    arr[i] = arr[2*(i)+1];
                    arr[2*(i)+1] = value;
                }
            }
            value = arr[0];
            arr[0]=arr[size-1];
            arr[size-1]=value;

            size-=1;
        }


        System.out.println("");
        System.out.println("Sorted array: ");
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
