public class BubbleSort{
    public static void main(String[] args) {
        System.out.println("Bubble Sort Example");
        int [] arr  = {5,4,1,2,3};
        bubbleSort(arr);
         for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void bubbleSort(int [] arr){
        System.out.println("Unsorted Array:");
        for(int i=0; i<arr.length-1; i++){
            boolean swapped = false;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
                if(!swapped) return;
            }
        }
        System.out.println("Sorted Array:");
         
       
    }
}