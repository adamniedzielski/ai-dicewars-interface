package ai.dicewars.common;
import java.util.List;

public interface Agent {
	Answer makeMove(List<? extends Vertex> vertices);
	void setPlayerNumber(int number);
}
