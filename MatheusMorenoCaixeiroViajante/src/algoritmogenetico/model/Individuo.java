package algoritmogenetico.model;

import java.util.Random;

public class Individuo implements Cloneable {

    private int[] genes;
    private int tamanho;

    public Individuo(int tamanho) {
        this.tamanho = tamanho;
        this.genes = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            this.genes[i] = -1;
        }

    }

    public void setGene(int posicao, int gene) {
        this.genes[posicao] = gene;
    }

    public int[] getGenes() {
        return genes;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void printIndividuo() {
        for (Integer gene : this.genes) {
            System.out.print(gene + "\t");
        }
        System.out.println("");

    }

}
