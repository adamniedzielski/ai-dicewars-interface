package ai.dicewars.common;
import java.util.List;

public interface Vertex {
	int getId();
	int getPlayer();
	int getNumberOfDices();
	List<Integer> getNeighbours();
}
