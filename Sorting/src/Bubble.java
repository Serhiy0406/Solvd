public class Bubble {
    public static void main(String[] args) {
        int[] arr = {6,2,8,3,9,4,-3,0,29,-1};
        int value = 0;
        boolean undone = true;
        System.out.println("Array: ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        while(undone){
            undone = false;
            for(int i=0; i<arr.length-1; i++){
                if(arr[i]<arr[i+1]){
                    value = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = value;
                    undone = true;
                }
            }
        }
        System.out.println("");
        System.out.println("Sorted array: ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
