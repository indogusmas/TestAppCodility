package timecomplexity;

public class FrogJmp {
    static int solution(int x, int y, int d){
        return (y-x)/d+((y-x)%d == 0? 0:1);
    }
    public  static  void main(String[] args){
        System.out.println("Test FrogJmp");
        System.out.println(FrogJmp.solution(1,5,2));
    }
}
