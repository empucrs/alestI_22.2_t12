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
        if(pos<vetor.length){
            vetor[pos]=value;
            pos++;
            return true;
        }
        else
            return false;
    }

    public boolean isEmpty(){
        return (pos==0);
    }

    public boolean isFull(){
        return (pos==vetor.length)
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