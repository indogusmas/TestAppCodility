package leetcode;

public class RemoveDuplicateArray {

    /**
     *
     * @param nums
     * @return
     *
     * Array must already sorted
     */

    public  static int removeDuplicate(int[] nums){
        if(nums.length  == 0) return  0;

        int  i = 0;

        for (int j = 1; j < nums.length; j++){
            if (nums[j] !=nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return  i+1;
    }

    public  static  void main(String[] args){
       System.out.println(removeDuplicate(new int[]{1,1,1,1,2,2,2}));
    }
}
