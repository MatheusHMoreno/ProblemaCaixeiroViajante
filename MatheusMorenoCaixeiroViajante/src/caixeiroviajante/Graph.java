package caixeiroviajante;

import java.util.ArrayList;

/**
 *
 * @author Douglas
 */
public interface Graph {

    public void setEdge(int ori, int target, int weight);

    public ArrayList<Integer> getAdjVertex(int node);

    public int getVertexSize();

    public void printGraph();

    public int getEdgeWeight(int ori, int target);

    public int[][] getAdjacencyMatrix();

}
