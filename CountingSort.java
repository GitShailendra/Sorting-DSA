public class CountingSort{
    public static void main(String[] args) {
        int [] arr = {4, 2, 2, 8, 3, 3, 1};
        countingSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void countingSort(int [] arr){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int [] count = new int[largest + 1];
        for(int i = 0; i<arr.length; i++){
            count[arr[i]]++;
        }
        int index = 0;
        for(int i = 0; i<count.length; i++){
            while(count[i] > 0){
                arr[index++] = i;
                count[i]--;
            }
        }
    }
}