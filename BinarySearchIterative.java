import java.util.Arrays;

public class BinarySearchIterative {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(array));
        int key = 6;
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            int midValue = array[mid];
            if(mid == key) System.out.println("Found at "+(mid-1));
            if (key>midValue) start = mid+1;
            else if(key<midValue) end = mid-1;
        }

    }
}
