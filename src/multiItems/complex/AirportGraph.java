package multiItems.complex;

public class AirportGraph {

    public static void main(String[] args) {
        Graph airports = createGraph();
        printOutAllFlights(airports);

        System.out.println("-------------");
        printConnections(airports, "Cape Town");
    }

    public static void printOutAll(Graph graph) {
        for (Vertex key : graph.getAdjVertices().keySet()) {
            System.out.println(key.label);
        }
    }


    public static void printOutAllFlights(Graph graph) {
        int count = 0;
        for (Vertex key : graph.getAdjVertices().keySet()) {
            System.out.println(key.label + "  flights to -> " + graph.getAdjVertices(key.label));
            count += graph.getAdjVertices(key.label).size();
        }

        System.out.println("Total flight count = " + count);
    }


    public static void printConnections(Graph graph, String place) {
        System.out.println(graph.getAdjVertices(place));
    }


    public static Graph createGraph() {
        Graph graph = new Graph();
        graph.addVertex("Windhoek");
        graph.addVertex("Cape Town");
        graph.addVertex("Tambo");
        graph.addVertex("PE");
        graph.addVertex("East London");
        graph.addVertex("Durbs");
        graph.addVertex("Mauritius");
        graph.addVertex("Harare");
        graph.addVertex("Livingstone");
        graph.addVertex("Victoria Falls");

        graph.addEdge("Tambo", "Cape Town");
        graph.addEdge("Tambo", "PE");
        graph.addEdge("Tambo", "East London");
        graph.addEdge("Tambo", "Durbs");
        graph.addEdge("Tambo", "Mauritius");
        graph.addEdge("Tambo", "Harare");
        graph.addEdge("Tambo", "Livingstone");
        graph.addEdge("Tambo", "Victoria Falls");
        graph.addEdge("Tambo", "Windhoek");

        graph.addEdge("PE", "Cape Town");
        graph.addEdge("East London", "Cape Town");
        graph.addEdge("Durbs", "Cape Town");

        graph.addEdge("PE", "Durbs");

        return graph;
    }
}
