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

    public static int[] sumRows(int[][] matrix){
        int[] arr = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++){
            arr[i] += sum(matrix[i]);
        }return arr;
    }

    public static int[] largestInRows(int[][] matrix){
        int [] arr = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++){
            arr[i] = largest(matrix[i]);
        }return arr;
    }
    
    public static int sum(int[][] arr){
        int[] arr2 = new int[arr.length];
        arr2 = sumRows(arr);
        return sum(arr2);
    }

    public static int[] sumCols(int[][] matrix){
        int[] arr = new int[matrix[0].length];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                arr[j] += matrix[i][j];
            }
        }return arr;
    }

    public static boolean isRowMagic(int[][] matrix){
        int firstSum = sum(matrix[0]);
        for(int i = 0; i < matrix.length; i++){
            if(sum(matrix[i]) != firstSum){
                return false;
            }
        }return true;
    }

    public static boolean isColMagic(int[][] matrix){
        int[] arr = sumCols(matrix);
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != arr[i+1]){
                return false;
            }
        }return true;
    }
}