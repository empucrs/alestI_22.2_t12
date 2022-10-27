/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {
        GenericTree gt = new GenericTree();
        gt.printTree();

        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Adicionando a raiz 3");
        int valor=3;       
        gt.add(valor, -1);
        gt.printTree();
        Integer papai = gt.getParent(valor);
        System.out.println(valor+" ("+((papai==null)?"-":papai)+")");

        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Adicionando o filho 1 ao nodo 3");
        valor=1;
        gt.add(valor, 3);
        gt.printTree();
        papai = gt.getParent(valor);
        System.out.println(valor+" ("+((papai==null)?"-":papai)+")");

        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Adicionando o filho 7 ao nodo 3");
        valor=7;
        gt.add(valor, 3);
        gt.printTree();
        papai = gt.getParent(valor);
        System.out.println(valor+" ("+((papai==null)?"-":papai)+")");

        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Adicionando o filho 4 ao nodo 3");
        valor=4;
        gt.add(valor, 3);
        gt.printTree();
        papai = gt.getParent(valor);
        System.out.println(valor+" ("+((papai==null)?"-":papai)+")");

        System.out.println("-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Adicionando 5 e 6 como filhos de 7");
        valor=5;
        gt.add(valor, 7);
        gt.printTree();
        papai = gt.getParent(valor);
        System.out.println(valor+" ("+((papai==null)?"-":papai)+")");

        valor=6;
        gt.add(valor, 7);
        gt.printTree();
        papai = gt.getParent(valor);
        System.out.println(valor+" ("+((papai==null)?"-":papai)+")");        
    }
}
