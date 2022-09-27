public class minhaListaEncadeada {

    // definição do elemento base da lista encadeada
    private class Nodo{
        private int valor; // valor do nodo da lista
        private Nodo proximo; //referencia o proximo elemento
        public int getValor() {
            return valor;
        }
        public Nodo(int valor) {
            this.valor = valor;
            this.proximo=null;
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
        clear();
    }

    public boolean add_On(int value){
        if(isEmpty()){
            inicio = new Nodo(value);
            nElementos++;
        }
        else{
            Nodo auxiliar = new Nodo(value);
            nElementos++;

            //tem ao menos 1 elemento na minha lista
            //inicio aponta para o primeiro elemento
            //auxiliar está referenciando o nodo a ser incluido na lista
            Nodo amyrKlink = inicio;
            while(amyrKlink.getProximo()!=null)
                amyrKlink = amyrKlink.getProximo();

            amyrKlink.setProximo(auxiliar);
        }
        return true;
    }

    public boolean add_vaiSaber(int value){
        if(isEmpty()){
            inicio = new Nodo(value);
            nElementos++;
        }
        else{
            Nodo auxiliar = new Nodo(value);
            auxiliar.setProximo(inicio);
            inicio = auxiliar;
            nElementos++;
        }
    }


    public boolean isEmpty(){
        return (nElementos==0);
    }

    public boolean remove(int idx){
    }

    public int get(int idx){
    }

    public void clear(){
        nElementos=0;
        inicio=null;
   }    
}