import java.io.*;
import java.util.*;

class IslandCount {

  static int getNumberOfIslands(int[][] binaryMatrix) {
    boolean[][] visited = new boolean[binaryMatrix.length][binaryMatrix[0].length];
    int count = 0;
    for(int i = 0; i < binaryMatrix.length; i++){
      for(int j = 0; j < binaryMatrix[0].length; j++){
        if(binaryMatrix[i][j] == 1){
          if(!visited[i][j]){
            visit(binaryMatrix, visited, i, j);
            count+=1;
          }
        }
      }
    }
    return count;
  }
  
  static void visit(int[][] binaryMatrix, boolean[][] visited, int i, int j) {
    if(i < 0 || j < 0 || i >=binaryMatrix.length || j >= binaryMatrix[0].length){
      return;
    }
    if(binaryMatrix[i][j] == 0 || visited[i][j]){
      return;
    }
    visited[i][j] = true;
    visit(binaryMatrix, visited, i-1, j);
    visit(binaryMatrix, visited, i+1, j);
    visit(binaryMatrix, visited, i, j-1);
    visit(binaryMatrix, visited, i, j+1);
  }

  public static void main(String[] args) {
    int[][] binaryMatrix = { {0,    1,    0,    1,    0},
                            {0,    0,    1,    1,    1},
                            {1,    0,    0,    1,    0},
                            {0,    1,    1,    0,    0},
                            {1,    0,    1,    0,    1} };
      System.out.println(getNumberOfIslands(binaryMatrix));

  }

}
