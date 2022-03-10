public class Insertion {
    public static void main(String[] args) {
        int[] arr = {6,2,8,3,9,4,-3,0,29,-1};
        int value = 0;
        System.out.println("Array: ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        for(int i=0; i < arr.length - 1; i++){
            while(arr[i+1] < arr[i]){
                value = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = value;
                if(i==0){
                    break;
                }else{
                    i--;
                }
            }
        }

        System.out.println("");
        System.out.println("Sorted array: ");
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
