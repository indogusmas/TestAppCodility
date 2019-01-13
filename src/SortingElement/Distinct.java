package SortingElement;


import java.util.Arrays;

public class Distinct {


    static  int solution(int[] A){
        int result = 0;
        Arrays.sort(A);
        for (int i = 1; i < A.length; i++){
            if(A[i] != A[i-1]){
                result++;
            }
        }
        return  result;

    }
    public static void main(String[] args){
        solution(new int[]{2,5,5,3,4,5,5,2,3,4});
    }
}
