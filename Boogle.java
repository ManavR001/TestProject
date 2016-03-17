import java.util.List;

/**
 * Created by manavrattan on 1/24/16.
 */
public class Boogle {

    private Board board;
    private BoogleSolver solver;


    public Boogle(String input){

        board = buildBoard(input);
        solver = new GeneratePossibleWordsSolver();

    }

    private Board buildBoard(String input) {
        return null; //TODO
    }

    public void solve(){

        List<String>  foundWords = solver.solve(board);

        for(String foundWord : foundWords){
            System.out.println(foundWord + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){

        new Boogle(args[0]).solve();
    }
}
