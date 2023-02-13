import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] array = new int[100];
        for (int i = 0; i<100; i++){
            array[i] = i;
        }
        int key = 30;
        int index = Binarysearch(array, 0, array.length-1, key);
        if(index!= -1){
            System.out.println("Element found at "+index);
        }
        else{
            System.out.println("Element is not present in the array");
        }
    }

    private static int Binarysearch(int[] array,int start , int end,  int key) {
        if(start<=end) {
            int mid = start + (end - start) / 2;
            int value = array[mid];
            System.out.println(value);
            if (value == key) return mid;
            if (key > value) return Binarysearch(array, mid + 1, array.length - 1, key);
            else return Binarysearch(array, 0, mid - 1, key);
        }
        return -1;
    }
}
