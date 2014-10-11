package ai.dicewars.common;
import java.util.List;

public interface Agent {
	Answer makeMove(List<Vertex> vertices);
	void setPlayerNumber(int number);
}
