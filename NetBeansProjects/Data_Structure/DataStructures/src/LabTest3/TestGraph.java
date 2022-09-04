package LabTest3;

public class TestGraph {

    public static void main(String[] args) {
        // (a)
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
        graph.addEdge("Ben Whishaw", "Ben Whishaw");
        graph.addEdge("Rami Malek", "Rami Malek");
        graph.addEdge("Joseph Mazello", "Joseph Mazello"); 
        graph.addEdge("Nick Frost", "Nick Frost");
        graph.addEdge("Simon Pegg", "Simon Pegg");
        graph.addEdge("Robert Popper", "Robert Popper");
        graph.addEdge("Ving Rhames", "Ving Rhames");

        // (b)
        graph.printEdges();
    }
    
}
