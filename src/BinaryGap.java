import java.util.ArrayList;
import java.util.List;

public class BinaryGap {

    static int solution(int N){
        String binaryString = Integer.toBinaryString(N);

        int longestBinaryGap = 0;
        List<Integer> onList = new ArrayList();

        for (int i = 0; i < binaryString.length(); i++){
            if(binaryString.charAt(i) == '0')
                continue;;
                onList.add(i);

        }

        for(int i=0; i<onList.size() - 1; i++) {
            //subtract 1 so that don't count 1's next to each other as having any gap
            int indicesDiff = onList.get(i+1) - onList.get(i)-1;

            longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
        }
        return longestBinaryGap;
    }
    public  static  void main(String[] srg){
        System.out.print(solution(9));
    }
}
