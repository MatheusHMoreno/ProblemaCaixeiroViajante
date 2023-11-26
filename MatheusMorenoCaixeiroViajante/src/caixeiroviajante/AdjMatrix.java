package caixeiroviajante;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Douglas
 */
public class AdjMatrix implements Graph, Serializable {

    private int[][] matrix;

    public AdjMatrix(int nVertex) {
        this.matrix = new int[nVertex][nVertex];
    }

    @Override
    public ArrayList<Integer> getAdjVertex(int node) {
        ArrayList<Integer> adj = new ArrayList<>();
        for (int j = 0; j < this.matrix.length; j++) {
            if (node != j && this.matrix[node][j] != 0) {
                adj.add(j);
            }
        }
        return adj;
    }

    @Override
    public void setEdge(int ori, int target, int weight) {
        if (ori >= 0 && ori < matrix.length && target >= 0 && target < matrix[0].length) {
            this.matrix[ori][target] = weight;
        } /*
           * else {
           * System.out.println("Indice fora do limite.");
           * }
           */
    }

    @Override
    public void printGraph() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix.length; j++) {
                System.out.printf("%d\t", this.matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public int getVertexSize() {
        return this.matrix.length;
    }

    @Override
    public int getEdgeWeight(int ori, int target) {
        if (this.matrix[ori][target] != 0) {
            return this.matrix[ori][target];
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public int[][] getAdjacencyMatrix() {
        return this.matrix;
    }
}
