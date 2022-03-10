public class Gnom {

    public static void Exchange(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void GnomeSort(int[] arr){
        for(int j=1; j < arr.length; j++){
            if(arr[j]<arr[j-1]){
                Exchange(j-1, j, arr);
                if(j-2>=0){
                    j-=2;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {6,2,8,3,9,4,-3,0,29,-1};

        System.out.println("Array: ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");

        GnomeSort(arr);

        System.out.println("");
        System.out.println("Sorted array: ");
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
