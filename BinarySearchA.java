import java.util.Arrays;

public class BinarySearchA {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        int key = 9;
        System.out.println(Arrays.toString(array));
        System.out.println("Key "+ key);
        int index = Binarysearch(array, 0, array.length-1, key);
        if(index!= -1) System.out.println("Element found at "+index);
        else System.out.println("Element is not present in the array");
    }
    private static int Binarysearch(int[] array,int start , int end,  int key) {
        if(start<=end) {
            int mid = start + (end - start) / 2;
            int value = array[mid];
            if (value == key) return mid;
            if (key < value) return Binarysearch(array, 0, mid - 1, key);
            if (key > value) return Binarysearch(array, mid + 1, array.length-1, key);
        }
        return -1;
    }
}
