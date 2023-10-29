public class arrayshuffle1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};  //if want to make for user input ,then just we will import java.util. and will take user input

        for (int i = 0; i < arr.length; i++) {
            int randomIndex = (int)(Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
