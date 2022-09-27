public class minhaListaEncadeada {

    // definição do elemento base da lista encadeada
    private class Nodo{
        private int valor; // valor do nodo da lista
        private Nodo proximo; //referencia o proximo elemento
        public int getValor() {
            return valor;
        }
        public void setValor(int valor) {
            this.valor = valor;
        }
        public Nodo getProximo() {
            return proximo;
        }
        public void setProximo(Nodo proximo) {
            this.proximo = proximo;
        }        
    }

    // referencia para o inicio da lista
    private Nodo inicio;
    // nro de elementos da lista
    private int nElementos; 

    public minhaListaEncadeada() {
        nElementos=0;
        inicio=null;
    }

    public int capacity(){
    }

    public boolean add(int value){        
    }

    public boolean isEmpty(){
    }

    public boolean isFull(){
    }

    public boolean remove(int idx){
    }

    public int get(int idx){
    }

    public void clear(){
    }    
}