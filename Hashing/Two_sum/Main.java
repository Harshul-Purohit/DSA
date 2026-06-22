package Two_sum;

//0(n)
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            if (map.containsKey(complement)) {

                System.out.println(map.get(complement) + " " + i);
                return;
            }

            map.put(nums[i], i);
        }
    }
}

//0(n^2)

// public class Main {
//     public static void main(String[] args) {

//         int[] nums = {2, 11, 15, 7};
//         int target = 9;

//         for (int i = 0; i < nums.length; i++) {

//             for (int j = i + 1; j < nums.length; j++) {

//                 if (nums[i] + nums[j] == target) {

//                     System.out.println(i + " " + j);
//                 }
//             }
//         }
//     }
// }