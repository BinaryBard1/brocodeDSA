import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {3,7,6,1,2,9,5,8,0,4};
        Selectionsort1(array);
    }
    private static void Selectionsort1(int[] array) {
        for ( int i = 0 ; i< array.length-1;i++){
            int min = i;
            for (int j = i+1 ; j< array.length;j++){
                if (array[min]>array[j]) min = j;
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}