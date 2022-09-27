public class minhaLista {

    private int vetor[];
    private int pos;

    public minhaLista() {
        vetor = new int[10];        
        pos=0;
    }

    public int capacity(){
        return vetor.length;
    }

    public boolean add(int value){        
        if(pos>=vetor.length){
            int [] novoVetor = new int [vetor.length*2];
            for(int i=0; i<vetor.length; i++)
              novoVetor[i]=vetor[i];
            vetor=novoVetor;
        }            
        vetor[pos]=value;
        pos++;
        return true;
}

    public boolean isEmpty(){
        return (pos==0);
    }

    public boolean isFull(){
        return (pos==vetor.length);
    }

    public boolean remove(int idx){

        if((idx>=0) && (idx<pos)){

            if(idx!=pos-1)
                for(int i=idx; i<pos; i++)
                    vetor[i]=vetor[i+1];
            pos--;
            return true;

        }
        else
            return false;

    }


    public int get(int idx){
        if((idx>=0)&&(idx<pos)){
            return vetor[idx];
        }
        else
            return vetor[0];
    }

    public void clear(){
        pos=0;
    }


    
}