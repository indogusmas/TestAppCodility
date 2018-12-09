package countingelement;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public  static int  solution(int[] A){
        /**
         * Example Array[6,3,2,1,5,4]
         */
        Set<Integer> bucket = new HashSet<>();
        int max = 0;
        int sum = 0;
        for (int counter = 0; counter<A.length; counter++){
            if (max < A[counter]) max = A[counter];
            if (bucket.add(A[counter])){
                sum = sum+A[counter];
            }else{
                return  0;
            }
        }

        int expectedSum = (max*(max+1))/2;
        if (expectedSum==sum)return 1;
        return  0;
    }
    public  static  void main(String[] args){
        int[] a = {4,3,1,6,2};
        System.out.println(solution(a));
    }
}
