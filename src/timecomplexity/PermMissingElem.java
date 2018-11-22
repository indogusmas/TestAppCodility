package timecomplexity;

public class PermMissingElem {

    static  int getMisingNo(int[] a){
        int  total;
        int n = a.length;
        total  = (n+1)*(n+2)/2;
        for (int i = 0; i < n; i++)
            total -= a[i];
        return total;
    }
    public  static  void main(String[] args){
     int[] a = {1,2,3,4,6,7,8};
     int miss = getMisingNo(a);
     System.out.println(miss);
    }
}
