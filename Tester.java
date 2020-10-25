import java.util.Arrays;
public class Tester{

    public static void main(String[] args) {
        int [] arr1 = {1, 3, 5, 9};
        int [] arr2 = {-1, -3, -5, -9};
        int [][] arr2D =new int[][]{{1,3,5,9},{2,4,6,8}};
        System.out.println(ArrayOps.sum(arr1));
        System.out.println(ArrayOps.sum(arr2));
        System.out.println(ArrayOps.largest(arr1));
        System.out.println(ArrayOps.largest(arr2));
        System.out.println(Arrays.toString(ArrayOps.sumRows(arr2D)));
    }
}