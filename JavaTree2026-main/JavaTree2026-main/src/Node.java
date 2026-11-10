public class Node<T extends Comparable<T>> {
    T dado;
    Node<T> esquerda;
    Node<T> direita;
    int fb; // fator de balanceamento

    public Node(T dado) {
        this.dado = dado;
        this.esquerda = null;
        this.direita = null;
        this.fb = 0; 
    }
}
