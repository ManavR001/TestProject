import java.util.List;

/**
 * Created by manavrattan on 1/24/16.
 */
public class Board {
    private final List<Node> nodes;

    public Board(List<Node> nodes){
        this.nodes = nodes;
    }

    public List<Node> getNodes(){
        return nodes;
    }
}
