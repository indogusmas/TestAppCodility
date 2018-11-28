package countingelement;

import java.util.HashSet;

public class FrogRiverOne {

    public  static  int solution(int[] A, int x){
        HashSet<Integer> fallen = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++){
            if (A[i] <= x)
                fallen.add(A[i]);
            if (fallen.size()== x)
                return i;
        }
        return -1;
    }

    public static  void main(String[] args){
        System.out.println(solution(new int[]{1,3,1,4,2,3,5,4},5));
    }

}
