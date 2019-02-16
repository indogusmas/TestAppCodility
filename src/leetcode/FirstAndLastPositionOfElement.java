package leetcode;

public class FirstAndLastPositionOfElement {

    public static   int[] searchRange(int[] nums, int target){
        int[] targeRange = {-1, -1};
        for (int i = 0; i< nums.length; i++){
            if (nums[i] == target){
                targeRange[0] = i;
                break;
            }
        }

        if (targeRange[0] ==-1){
            return targeRange;
        }
        for (int j = nums.length -1; j >= 0; j--){
            if (nums[j] == target){
                targeRange[1] =  j;
                break;
            }
        }
        return targeRange;
    }
    public static  void main (String[] args){
        System.out.print(searchRange(new int[]{1,3,4,5},3));
    }
}
