package LabTest3.folder;


public class Test_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Graph<String> graph = new Graph();
        String[] actors = {"Ben Whishaw", "Jeffrey Wright", "Joseph Mazello", "Nick Frost", "Rami Malek", "Robert Popper", "Simon Pegg", "Ving Rhames"};
        for (String i : actors)
            graph.addVertex(i);
        
        graph.addEdge("Ben Whishaw", "Jeffrey Wright");
        graph.addEdge("Ben Whishaw", "Rami Malek");
        graph.addEdge("Jeffrey Wright", "Rami Malek");
        graph.addEdge("Joseph Mazello", "Rami Malek");
        graph.addEdge("Nick Frost", "Robert Popper");
        graph.addEdge("Nick Frost", "Simon Pegg");
        graph.addEdge("Robert Popper", "Simon Pegg");
        graph.addEdge("Simon Pegg", "Ving Rhames");
        for (int i = 0; i < 7; i++) {
            System.out.println(graph.getAllVertices());
        }
        int relation[][]={{1,0,0,0,0,1,0},
                        {0,0,0,0,0,1,0},
                        {0,0,0,0,0,1,0},
                        {0,0,0,1,0,0,0},
                        {1,0,0,0,1,0,1},
                        {0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0}};
        for (int i = 0; i < 7; i++) {
            System.out.print(relation[i][i]);
        }
        
        Dfs_Graph graph2 = new Dfs_Graph();
        for (String i : actors)
            graph.addVertex(i);
        
        graph2.addEdge("Ben Whishaw", "Jeffrey Wright");
        graph2.addEdge("Ben Whishaw", "Rami Malek");
        graph2.addEdge("Jeffrey Wright", "Rami Malek");
        graph2.addEdge("Joseph Mazello", "Rami Malek");
        graph2.addEdge("Nick Frost", "Robert Popper");
        graph2.addEdge("Nick Frost", "Simon Pegg");
        graph2.addEdge("Robert Popper", "Simon Pegg");
        graph2.addEdge("Simon Pegg", "Ving Rhames");
        graph2.DFS("Simon Pegg", "Ving Rhames");
    }
    
}
