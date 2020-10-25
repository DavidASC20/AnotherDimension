import java.util.Arrays;
public class Tester{

    public static void main(String[] args) {
        int [] arr1 = {1, 3, 5, 9};
        int [] arr2 = {-1, -3, -5, -9};
        int [][] arr2D =new int[][]{{1,3,5,9},{2,4,6,8}};
        int [][] goodRow = new int[][]{{1, 2, 3, 4}, {3, 2 ,4, 1}, {3, 4, 1 , 2}};
        int [][] goodCol = new int[][]{{1,1,1},{2,2,2},{3,3,3}};
        System.out.println(ArrayOps.sum(arr1));
        System.out.println(ArrayOps.sum(arr2));
        System.out.println(ArrayOps.largest(arr1));
        System.out.println(ArrayOps.largest(arr2));
        System.out.println(Arrays.toString(ArrayOps.sumRows(arr2D)));
        System.out.println(Arrays.toString(ArrayOps.largestInRows(arr2D)));
        System.out.println(ArrayOps.sum(arr2D));
        System.out.println(Arrays.toString(ArrayOps.sumCols(arr2D)));
        System.out.println(ArrayOps.isRowMagic(goodRow));
        System.out.println(ArrayOps.isRowMagic(arr2D));
        System.out.println(ArrayOps.isColMagic(goodRow));
        System.out.println(ArrayOps.isColMagic(goodCol));
    }
}