import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);

            System.out.println(map.keySet());
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public  static  void main(String[] args){
        int[] result = twoSum(new int[]{3,5,8,10},13);
        for (int i : result){
            System.out.println(i);
        }
        System.out.println(result);
    }
}
