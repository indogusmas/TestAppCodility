public class SecondMaxValue {


    public  static  void print2Largest(int arr[],
                                       int arrSize){
        int i, first, second;

        first = second = Integer.MIN_VALUE;
        for (i =0; i < arrSize; i++){
            if (arr[i] > first){
                second = first;
                first = arr[i];
            }else  if (arr[i] > second && arr[i] != first)
                second = arr[i];
        }
        System.out.print("The second largest element "+ second);

    }
    public  static  void main(String[] args){
        int arrr[] = {12,3,4,1,2,45,2};
        int n = arrr.length;
        print2Largest(arrr, n);
    }
}
