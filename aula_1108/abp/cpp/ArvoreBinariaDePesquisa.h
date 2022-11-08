class ArvoreBinariaDePesquisa{
    private:
      class BinaryTreeNode{
          public:
            int value;
            BinaryTreeNode * father;
            BinaryTreeNode * left;
            BinaryTreeNode * rigth;                        
            BinaryTreeNode(int e);
      }
    public:
        bool isEmpty(){}
        int  size(){}
        void clear(){}
        int  getRoot(){}
        void add(int e){}
        bool remove(int e){}
        int  getLeft(int e){}
        int  getRight(int e){}
        int  getParent(int e){}
        int* positionsPre(){}
        int* positionsCentral(){}
        int* positionsPos(){}
        int* positionsWidth(){}
        int  level(int e){}
        bool contains(int e){}
        bool isInternal(int e){}
        bool isExternal(int e){}
}