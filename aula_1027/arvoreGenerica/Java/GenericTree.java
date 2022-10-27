public class GenericTree {

    private class TreeNode{
        public TreeNode father;
        public int value;
        private TreeNode[] children;
        private int nChild;

        public TreeNode (Integer element){
            this.value=element;
            father=null;
            children=new TreeNode[10];
            nChild=0;
        }
        public void addSubtree (TreeNode n){
            if(n!=null){
                if(nChild==children.length)
                    grow();
                children[nChild]=n;
                nChild++;
                n.father=this;
            }
        }
        private void grow(){
            TreeNode [] aux = new TreeNode[children.length*2];
            for(int i=0; i<children.length; i++)
                aux[i]=children[i];
            children=aux;
        }
        public boolean removeSubtree(TreeNode n){
            //TBD
            return false;
        }
        public TreeNode getSubtree(int idx){
            if(idx>=0 && idx<nChild)
                return children[idx];
            return null;
        }
        public int getSubtreesSize(){
            return nChild;
        }
    }

    private TreeNode root;
    private int nElements;

    //método básico para caminhamento/busca na árvore
    private TreeNode searchNode(Integer e, TreeNode ref){
        if(ref!=null){
            if(ref.value==e)
                return ref;
            else{
                TreeNode aux=null;
                for(int i=0; i<ref.getSubtreesSize(); i++){
                    aux=searchNode(e, ref.getSubtree(i));
                    if(aux!=null)
                        return aux;
                }
                return null;                    
            }
        }
        else{
            return null;
        }
    }

    public boolean add(Integer e, Integer father){
        if(nElements==0) // adicionando o elemento raiz
            root=new TreeNode(e);
        else{// adicionando um elemento que não é a raiz da árvore
            //tenho de encontrar o pai
            TreeNode aux = searchNode(father, root);
            //se eu encontrei o pai
            if(aux!=null)
              //tenho de adicionar o e ao pai
              aux.addSubtree(new TreeNode(e));
            //senao
            else
              // tenho q informa q não possivel adicionar o filho
              return false;
        }
        nElements++;
        return true;
    }
    public Integer getRoot(){
        if(root!=null)
            return root.value;
        return null;
    }
    public void setRoot(Integer e){
        if(e!=null)
            if(root==null)
                add(e, null);
            else
                root.value=e;
    }
    public Integer getParent(Integer e){
        if(e!=null){
            TreeNode aux = searchNode(e, root);
            // o elemento não existe
            if(aux==null)
                return null;
            // o elemento é raiz
            if(aux==root)
                return null;
            // o elemento não é raiz
            return aux.father.value;
        }
        return null;
    }
    public boolean removeBranch(Integer e){
        return false;
    }
    public boolean contains(Integer e){
        return false;
    }
    public boolean isInternal(Integer e){
        return false;
    }
    public boolean isExternal(Integer e){
        return false;
    }
    public boolean isRoot(Integer e){
        if((root!=null)&&(e!=null)&&(root.value==e))
            return true;
        return false;
    }
    public boolean isEmpty(){
        return (nElements==0);
    }
    public int size(){
        return nElements;
    }
    public void clear(){
        //Jeito certo
        //Jeito apoiado em garbage collector
        nElements=0;
        root=null;
    }
    public int[] positionsPre(){
        return null;
    }
    public int[] positionsPos(){
        return null;
    }
    public int[] positionsWidth(){
        return null;
    }
    private void printTree(TreeNode ref){
        if(ref!=null){
            System.out.print(ref.value+"; ");
            for(int i=0; i<ref.getSubtreesSize(); i++)
                printTree(ref.getSubtree(i));            
        }
    }
    public void printTree(){
        if(root==null)
            System.out.print("A árvore está vazia");
        else
            printTree(root);
        System.out.println();
    }

}
