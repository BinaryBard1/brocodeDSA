import java.util.Arrays;
public class BinarySearchD {
    public static void main(String[] args) {
        int [] array = {9,8,7,6,5,4,3,2,1};
        int key = 7;
        System.out.println(Arrays.toString(array));
        System.out.println("Key:-"+key);
        int index = RBinarysearchd(array, 0 , array.length-1,key);
        if(index!= -1) System.out.printf("Found at %d", index);
        else System.out.println("Not Found");
    }
    private static int RBinarysearchd(int[] array, int start, int end, int key) {
        while(start<=end){
            int mid = start+(end-start)/2;
            int midvalue = array[mid];
            if(midvalue == key) return mid;
            if(key>midvalue) return RBinarysearchd(array, 0 , mid-1,key);
            if(key<midvalue) return RBinarysearchd(array, mid+1, array.length-1,key);
        }
        return -1;
    }
}
