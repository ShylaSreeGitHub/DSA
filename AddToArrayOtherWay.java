import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddToArrayOtherWay {
    public static void main(String[] args) {
//       int[] arr = {9,9,9,9,9,9,9,9,9,9};
//        int k = 1;
       int[] arr = {2,1,5};
        int k = 806;
////        int[] arr = {0};
//        int k = 10000;
        System.out.println(addToArrayList(arr,k));
    }
    static List addToArrayList(int[] num, int k){
        List<Integer> result = new ArrayList<>();

        for(int i = num.length - 1; i >= 0; i--){
            result.add(0,(num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while ( k > 0){
            result.add(0,k % 10);
            k = k/10;
        }
        return result;
    }
    static int[] addToArrayFormFixed(int[] num, int k) {
        int i = 0;
        int[] result = num;
        while (i < num.length){
            result[num.length - i - 1] = num[num.length - i - 1]+ k;
            k = result[num.length - i - 1] / 10;
            result[num.length - i - 1] = result[num.length - i - 1] % 10;
            i++;
        }
//        System.out.println("result is "+ Arrays.toString(result));
        return result;
    }
}
