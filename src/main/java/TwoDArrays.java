import java.util.Scanner;

public class TwoDArrays {

    /*
    * This problem is a variation of the classic "frog jump" problem. The objective is to determine if it is possible to reach the end of an array by making jumps of length at most leap, given that some cells in the array are blocked and cannot be landed on.

We can solve this problem using a recursive function that tries all possible jumps from the current position in the array. The function takes three parameters: the current position i in the array, the size of the leap leap, and the array game. If the current position is outside the bounds of the array, we return true (because we have reached the end of the array). If the current position is blocked (i.e., it contains a 1), we return false. Otherwise, we try all possible jumps from the current position:

We try jumping forward to position i + 1. If this leads to a win, we return true.
We try jumping backward to position i - 1 (if this is a valid position). If this leads to a win, we return true.
We try jumping to position i + leap. If this leads to a win, we return true.
If none of these jumps leads to a win, we return false.

Here's the Java code to implement this approach:
    *
    * */

    public static boolean canWin(int leap, int [] game){
        int n = game.length;
        boolean[] visited =  new boolean[n];
        return canWinHelper(0 , leap, game, visited);
    }

    static boolean canWinHelper(int i, int leap, int[] game, boolean[] visited) {
        if (i >= game.length) {
            return true;
        }
        if (i < 0 || visited[i] || game[i] == 1) {
            return false;
        }

        visited[i] = true; // mark the current cell as visited
        return canWinHelper(i + leap, leap, game, visited) || canWinHelper(i + 1, leap, game, visited) || canWinHelper(i - 1, leap, game, visited);


    }

    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int q = sc.nextInt();
            for(int i = 0; i < q; i++){
                int n = sc.nextInt();
                int leap = sc.nextInt();
                int [] game = new int[n];

                for(int j = 0; j > n; j++){
                    game[j] = sc.nextInt();
                }

                System.out.println( canWin(leap , game) ? "YES" : "NO");
            }
    }
}



