import java.util.ArrayList;
import java.util.List;

public class AddToArray {
    public static void main(String[] args) {
//        int[] arr = {1,2,0,0};
//        int k = 34;
//        int[] arr = {2,1,5};
//        int k = 806;
        int[] arr = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addToArrayFormWayOne(arr, k));
    }
    static List<Integer> addToArrayFormWayOne(int[] num, int k){
        List<Integer> addedArr = new ArrayList<>();
        String numStr = "";
        for(int n : num){
            n = (char)n;
            numStr +=n;
        }

        int addition = Integer.parseInt(numStr) + k;
        System.out.println(addition);
        while (addition > 0){
            int remainder = addition % 10;
            addedArr.add(remainder);
            addition = addition / 10;
        }

        return Reverse(addedArr);
    }
    static List Reverse(List arr){
        List<Integer> revArr = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(arr.size() - i - 1));

            revArr.add((Integer) arr.get(arr.size() - i - 1));
        }

        return revArr;
    }
}
