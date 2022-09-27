import org.w3c.dom.Node;

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
    private Nodo inicio, fim;
    // nro de elementos da lista
    private int nElementos; 

    public minhaListaEncadeada() {
        clear();
    }

    public boolean add_On(int value){
        if(isEmpty()){
            inicio = new Nodo(value);
            fim = inicio;
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

            fim=auxiliar;
        }
        return true;
    }

    public boolean add_O1_inicio(int value){
        if(isEmpty()){
            inicio = new Nodo(value);
            fim = inicio;
            nElementos++;
        }
        else{
            Nodo auxiliar = new Nodo(value);
            auxiliar.setProximo(inicio);
            inicio = auxiliar;
            nElementos++;
        }
        return true;
    }

    public boolean add_O1_fim(int value){
        Nodo auxiliar = new Nodo(value);

        if(isEmpty())
            inicio = auxiliar;
        else
            fim.setProximo(auxiliar);

        fim=auxiliar;
        nElementos++;
        return true;
    }


    public boolean isEmpty(){
        return (nElementos==0);
    }

    public boolean remove(int idx){
        if((idx>0) && (idx<nElementos)){
            Nodo amyrKlink=inicio;
            if(idx==0){
                inicio=amyrKlink.getProximo();
                amyrKlink.setProximo(null);
            }
            else{
                idx--;
                while(idx>0){
                    amyrKlink=amyrKlink.getProximo();
                    idx--;
                }
                Nodo nodoAEliminar = amyrKlink.getProximo();
                amyrKlink.setProximo(nodoAEliminar.getProximo());
                nodoAEliminar.setProximo(null);
            }

            nElementos--;
            // posso remover
            return true;
        }
        else
            return false;
    }

    public int get(int idx){
        // o índice é inválido
        if((idx<0)||(idx>=nElementos))
            return -1;
        else {
            Nodo amyrKlink = inicio;
            for(int i=0; i<idx; i++)
                amyrKlink = amyrKlink.getProximo();
            return amyrKlink.getValor();
        }
    }

    public void clear(){
        nElementos=0;
        inicio=null;
        fim=null;
   }    
}