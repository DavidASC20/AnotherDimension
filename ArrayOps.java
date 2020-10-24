public class ArrayOps{
    public static int sum(int[] arr){
        int total = 0;
        for(int i = 0; i < arr.length; i ++){
            total += arr[i];
        }return total;
    }

    public static int largest(int[] arr){
        int largest = arr[0];
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }return largest;
    }
}