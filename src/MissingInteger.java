import java.util.HashSet;

public class MissingInteger {

    public static int solution(int[] A){

        HashSet<Integer>seen = new HashSet<>();
        int min  = 1;

        for(int i = 0 ; i < A.length; i++){
            if (A[i] > 0)
                seen.add(A[i]);
        }

        for (int i = 1; i< Integer.MAX_VALUE; i++){
            if(!seen.contains(i));

        }
        return min;
    }

    public static  void main(String[] args){
        solution(new int[]{1,2,5,3});
    }
}
