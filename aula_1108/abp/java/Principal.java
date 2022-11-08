public class Principal {
    public static void main(String[] args) {
        ArvoreBinariaDePesquisa abp = new ArvoreBinariaDePesquisa();
        abp.add(10);
        abp.add(5);
        abp.add(2);
        abp.add(15);
        abp.add(20);
        abp.add(7);
        abp.add(12);

        int [] lista = abp.positionsCentral();
        for (int i : lista) 
            System.out.print(i+", ");            
        System.out.println(" --> tamvet = "+lista.length);
    }
}
