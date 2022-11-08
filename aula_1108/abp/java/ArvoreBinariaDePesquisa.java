public class ArvoreBinariaDePesquisa {

    //nodo
    private class BinaryTreeNode{
        public int value;
        public BinaryTreeNode father;
        public BinaryTreeNode left, right;

        public BinaryTreeNode(int e){
            this.value=e;
            father=left=right=null;
        }
    }

    //raiz
    private BinaryTreeNode root;
    //nro de Elementos na árvore
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
    public int getRoot() throws Exception{
        if(nElements>0)
            return root.value;
        throw new Exception();
    }
    
    private void add(int e, BinaryTreeNode ref){
      if(ref!=null){
        if(e<=ref.value){// insere a esquerda
          if(ref.left==null){
            ref.left = new BinaryTreeNode(e);
            ref.left.father = ref;
          }
          else
            add(e, ref.left);
        }
        else{// insere a direita
          if(ref.right==null){
            ref.right=new BinaryTreeNode(e);
            ref.right.father=ref;
          }
          else
            add(e, ref.right);
        }
      }
    }

    public void add(int e){
        if(nElements==0)
          root=new BinaryTreeNode(e);
        else
          add(e, root);

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
    public int getLeft(int e) throws Exception{
      //busca elemento e
      BinaryTreeNode aux = searchNode(e, root);
      //se não existe o elemento
      if(aux==null)
        throw new Exception();

      //se não existe o filho esquerda
      if(aux.left==null)
        throw new Exception();

      // if((aux.left==null)||(aux==null))
      //   throw new Exception();

      //senão
      return aux.left.value;
    }
    public int getRight(int e){
        //busca elemento e (aux=searchNode(e,root))
        // se o elemento existe e existem o filho direita
          // retorna o valor do filho da direita
        // senão
          // gera excecao
        return 0;
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
    public int getParent(int e){
      return 0;
    }
    public int[] positionsPre(){
      return null;
    }

    private int positionsCentral(int [] vetor, int pos, BinaryTreeNode ref){
      if(ref!=null){
        pos=positionsCentral(vetor, pos, ref.left);
        vetor[pos]=ref.value;
        pos++;
        pos=positionsCentral(vetor, pos, ref.right);
      }
      return pos;
    }
    public int[] positionsCentral(){
      if(nElements==0)
        return null;
      int [] resultado = new int[nElements];
      positionsCentral(resultado, 0, root);
      return resultado;
    }
    public int[] positionsPos(){
      return null;
    }
    public int[] positionsWidth(){
      return null;
    }
    public int level(int e){
      return 0;
    }
    public boolean contains(int e){
      return false;
    }
    public boolean isInternal(int e){
      return false;
    }
    public boolean isExternal(int e){
      return false;
    }

    
}
