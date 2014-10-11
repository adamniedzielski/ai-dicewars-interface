ai-dicewars-interface
=====================

This is the common interface for AI Dicewars project. Use it in your subprojects and stick to the interfaces defined here.

## How to integrate

Add JAR file from this project as a dependency to your project (in Eclipse: Project -> Java Build Path -> Libraries -> Add JARs)


## Example

```java
package ai.dicewars.yourname;

import java.util.List;

import ai.dicewars.common.Agent;
import ai.dicewars.common.Answer;
import ai.dicewars.common.Vertex;

// This is a stupid agent which never moves
public class StupidAgent implements Agent {

  @Override
  public Answer makeMove(List<Vertex> vertices) {
    for(Vertex vertex : vertices) {
      System.out.println(vertex.getNumberOfDices());
    }
    
    return new Answer() {
      
      @Override
      public boolean isEmptyMove() {
        return true;
      }
      
      @Override
      public int getTo() {
        return 0;
      }
      
      @Override
      public int getFrom() {
        return 0;
      }
    };
  }

  @Override
  public void setPlayerNumber(int arg0) {
    // I don't care about my number
    
  }
}


```
