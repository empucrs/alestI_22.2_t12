public class Potencia{
    public static void main(String[] args) {
        int base = Integer.parseInt(args[0]);
        int expoente = Integer.parseInt(args[1]);

        System.out.println("NRec: "+base+" ^ "+expoente+" = "+potenciaNaoRecursiva(base, expoente));
        System.out.println(" Rec: "+base+" ^ "+expoente+" = "+potenciaRecursiva(base, expoente));

    }

    private static int potenciaNaoRecursiva(int bs, int ex){
        int resultado=1;
        while(ex-->0)
            resultado*=bs;
        return resultado;
    }

    private static int potenciaRecursiva(int bs, int ex){
        if(ex==0)
            return 1;
        else
            return bs * potenciaRecursiva(bs, ex-1);
    }
}