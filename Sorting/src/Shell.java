public class Shell {/////////////////////undone
    public static void Exchange(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void ShellSort(int[] arr){
        int count = 2;
        int size = arr.length;
        int i = 55;
        while(i>=1){
            i = size/count;
            for (int j=0; j < arr.length; j++){
                if( arr[i]<arr[j]){
                    Exchange(i, j, arr);
                    i++;
                }else{
                    i--;
                    j-=2;
                }
                if(i < size){
                    count+=2;
                    break;
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

        ShellSort(arr);

        System.out.println("");
        System.out.println("Sorted array: ");
        for (int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
