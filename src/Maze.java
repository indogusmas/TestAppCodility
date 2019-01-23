public class Maze {

    public static void main(String[] args){
        solutionMaze(9);
    }

    static  void solutionMaze(int input){
        int i = 0;
        while (i < (input + 1) / 4){
            System.out.print("@"+"@");
             i += 1;
        }
    }
}
