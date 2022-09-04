package LabTest3.folder;

/**
 *
 * @author User
 */

import java.util.*;

public class Dfs_Graph {
  private LinkedList<String> adjLists[];
  private boolean visited[];

  // Graph creation
  public Dfs_Graph(int vertices) {
    adjLists = new LinkedList[vertices];
    visited = new boolean[vertices];

    for (int i = 0; i < vertices; i++)
      adjLists[i] = new LinkedList<String>();
  }

    Dfs_Graph() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

  // Add edges
  void addEdge(int src, String dest) {
    adjLists[src].add(dest);
  }

  // DFS algorithm
  void DFS(int vertex) {
    visited[vertex] = true;
    System.out.print(vertex + " ");

    Iterator<String> ite = adjLists[vertex].listIterator();
    while (ite.hasNext()) {
        String adj = ite.next();
      if (!visited[adj]) {
          DFS(adj);
      } else {
      }
    }
  }

    void DFS(String simon_Pegg, String ving_Rhames) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void addEdge(String ben_Whishaw, String jeffrey_Wright) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
