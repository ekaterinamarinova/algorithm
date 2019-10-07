import algorithm.BubbleSort;

/**
 * @author Ekaterina Marinova
 */
public class Application {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[]{10,9,8,7,6,5,4,3,2,1};
        BubbleSort bubbleSort = new BubbleSort();
        arr = bubbleSort.sortAscending(arr);

        for (int i = arr.length-1; i > 0; i--){
            System.out.println(arr[i]);
        }
    }
}
