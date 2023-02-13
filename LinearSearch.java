public class LinearSearch {
    public static void main(String[] args) {
        int [] array = {9,8,6,3,7,2,1};
        int key = 10;
        int index = Linearsearch(array, key);
        if (index!= -1){
            System.out.printf("Element found at index %d",index);
        }
        else{
            System.out.println("Searched element is not in the array ");
        }

    }

    private static int Linearsearch(int[] array, int key) {
        for (int i = 0 ; i< array.length; i++){
            if (array[i]== key){
                return i;
            }
        }
        return -1;
    }
}
