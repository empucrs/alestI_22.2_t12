public class ArvoreBinariaDePesquisa {

    //nodo
    private class BinaryTreeNode{
        public int value;
        public BinaryTreeNode father;
        public BinaryTreeNode left, right;

        public BinaryTreeNode(int e){
            this.value=e;
            father=left=rigth=null;
        }
    }

    //raiz
    private BinaryTreeNode root;
    //nElementos
    private int nElements;

    // -- MÉTODOS --
    public ArvoreBinariaDePesquisa(){
        clear();
    }

    public boolean isEmpty(){
        return (nElements==0);
    }
    public int size(){
        return nElements;
    }
    public void clear(){
        nElements=0;
        root=null;
    }
    public int getRoot(){
        if(nElements>0)
            return root.value;
        throw new Exception();
    }
    
    public void add(int e){
        if(nElements==0)
            root=new BinaryTreeNode(e);
        else{
            System.out.println("Implementar a navegação na arvore");
            //navegação
        }

        nElements++;
    }
    public boolean remove(int e){
        //buscar o elemento na árvore (NR)
        // se o elemento nao existe
          // retorna falso
        // se o elemento existe
          // se o elemento for uma folha
            // tira a referencia do pai dele para ele
          // se for um galho
            // se tem o filho da esquerda e não tem o direita
              // o pai do elemento a ser removido referencia o filho da esquerda
            // se tem o filho da direita mas não tem o da esquerda
              // o pai do elemento a ser removido referencia o filho da direita
            // senao
              // referencio o primeiro nodo da subarvore da esquerda
              // navego para right até o right referenciar nulo
              // ao chegar no nodo substituto(NS)
              // NR.value = NS.value
              // se NS é folha
                // ns.father.right = null
              // se NR é galho
                // ns.father.right = ns.left
        //nelements--;
        return true;
    }
    public int getLeft(int e){
        //busca elemento e
        // se o elemento existe e existem o filho esquerda
          // retorna o valor do filho da esquerda
        // senão
          // gera excecao
        }
    public int getRight(int e){
        //busca elemento e (aux=searchNode(e,root))
        // se o elemento existe e existem o filho direita
          // retorna o valor do filho da direita
        // senão
          // gera excecao
    }
    private BinaryTreeNode searchNode(int e, BinaryTreeNode ref){
        if(ref==null)
            return null;
        if(ref.value==e)
            return ref;
        if(e<=ref.value)
            return searchNode(e, ref.left);
        else
            return searchNode(e, ref.right);

    }
    public int getParent(int e){}
    public int[] positionsPre(){}
    public int[] positionsCentral(){}
    public int[] positionsPos(){}
    public int[] positionsWidth(){}
    public int level(int e){}
    public boolean contains(int e){}
    public boolean isInternal(int e){}
    public boolean isExternal(int e){}

    
}
