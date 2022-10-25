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

    public boolean add(Integer e, Integer father){
        return true;
    }
    public Integer getRoot(){
        return null;
    }
    public void setRoot(Integer e){}
    public Integer getParent(Integer e){
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
        return false;
    }
    public boolean isEmpty(){
        return false;
    }
    public int size(){
        return 0;
    }
    public void clear(){}
    public int[] positionsPre(){
        return null;
    }
    public int[] positionsPos(){
        return null;
    }
    public int[] positionsWidth(){
        return null;
    }
}
