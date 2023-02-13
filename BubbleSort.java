import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {7,9,4,6,1,0,3,8,2,5};
        bubbleSort(array);
    }
    private static void bubbleSort(int[] array) {
        for(int i = 0 ; i< array.length-1;i++){
            for(int j =0 ; j< array.length-i-1;j++){
                if(array[j]>array[j+1]){
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
