package leetcode;

public class RemoveElement {

    public static   int removeElement(int[] nums, int val){
        int i = 0;
        int n = nums.length;
        while (i < n){
            if (nums[i] == val){
                nums[i] = nums[n-1];
                //reduce array size by one
                n--;
            }else {
                i++;
            }
        }
        return  n;
    }

    public  static void main(String[] args){
        removeElement(new int[]{1,2,3,4,5}, 1);
    }
}
