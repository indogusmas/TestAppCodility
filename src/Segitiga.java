public class Segitiga {

    public  static  void main(String[] args){
        int n =9;

        for (int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k= n; k > 0; k--){
            for (int l = k; l >0; l--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
