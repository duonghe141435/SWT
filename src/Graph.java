/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bookm
 */
public class Graph {
    private boolean adjacencyMatrix[][] = null;
    private int vertexCount = 5;

    public Graph(int vertexCount) {
        this.vertexCount = vertexCount;
        adjacencyMatrix = new boolean[vertexCount][vertexCount];
    }

    public void addEdge(int i, int j) {
        if (i >= 0 && i <= vertexCount && j > 0 && j <= vertexCount) {
            adjacencyMatrix[i-1][j-1] = true;
            adjacencyMatrix[j-1][i-1] = true;
        }
    }

    public String isEdge(int i, int j) {
        if (adjacencyMatrix[i-1][j-1] == true || adjacencyMatrix[j-1][i-1] == true) {
            return "This is an edge";
        } else {
            return "This not is an edge";
        }
    }
}

