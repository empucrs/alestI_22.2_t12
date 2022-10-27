/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {
        GenericTree gt = new GenericTree();
        gt.printTree();
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Adicionando a raiz 3");
        gt.add(3, -1);
        gt.printTree();
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Adicionando o filho 1 ao nodo 3");
        gt.add(1, 3);
        gt.printTree();
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Adicionando o filho 7 ao nodo 3");
        gt.add(7, 3);
        gt.printTree();
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Adicionando o filho 4 ao nodo 3");
        gt.add(4, 3);
        gt.printTree();
        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Adicionando 5 e 6 como filhos de 7");
        gt.add(5, 7);
        gt.add(6, 7);
        gt.printTree();
        
    }
}
