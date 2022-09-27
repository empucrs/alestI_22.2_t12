#include <stdio.h>
#include <stdlib.h>

int potenciaNaoRecursiva(int, int);
int potenciaRecursiva(int, int);

int main(int argc, char* argv[]){

    int base = atoi(argv[1]);
    int expoente = atoi(argv[2]);

    printf("NRec: %d ^ %d = %d\n", base, expoente, potenciaNaoRecursiva(base, expoente));
    printf(" Rec: %d ^ %d = %d\n", base, expoente, potenciaRecursiva(base, expoente));

}

int potenciaNaoRecursiva(int bs, int ex){
    int resultado=1;
    while(ex-->0)
        resultado*=bs;
    return resultado;
}

int potenciaRecursiva(int bs, int ex){
    if(ex==0)
        return 1;
    else
        return bs * potenciaRecursiva(bs, ex-1);
}

