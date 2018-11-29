public class RotateArray {

    public static int[] rotate(int[] nums, int k){
        int[] a = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            a[(i+k)%nums.length] = nums[i];
        }
        for (int i= 0; i < nums.length;i++){
            nums[i]=a[i];
        }
        for (int b: a){
            System.out.println(b);
        }
        return a;
    }
    public  static  void main(String[] args){
        int[] a = {1,2,3,4,5,6};
        int k = 3;
        System.out.println(rotate(a, k));
    }
}
