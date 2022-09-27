#include "ListaDuplamenteEncadeada.hpp"

ListaDuplamenteEncadeada::ListaDuplamenteEncadeada(){
    nElementos=0;
    fim=inicio=nullptr;
};

bool ListaDuplamenteEncadeada::add(int value){

    if(isEmpty()){
        fim = inicio = new Nodo(value);
    }
    else{
        Nodo * novoNodo = new Nodo(value);
        novoNodo->setAnterior(fim);
        fim->setProximo(novoNodo);
        fim=novoNodo;
    }
    nElementos++;
}

bool ListaDuplamenteEncadeada::::remove(){
}

int ListaDuplamenteEncadeada::size(){
}

bool ListaDuplamenteEncadeada::isEmpty(){
    return (nElementos==0);
}

int ListaDuplamenteEncadeada::get(int idx){
}

void ListaDuplamenteEncadeada::clear(){
}
// ==> métodos do nodo base da lista
ListaDuplamenteEncadeada::Nodo::Nodo(int valor){
    this->valor=valor;
    this->proximo=this->anterior=nullptr;
}
int ListaDuplamenteEncadeada::Nodo::getValor(){
    return this->valor;
}
void ListaDuplamenteEncadeada::Nodo::setValor(int valor){
    this->valor = valor;    
}
ListaDuplamenteEncadeada::Nodo * ListaDuplamenteEncadeada::Nodo::getProximo(){
    return this->proximo;
}
void ListaDuplamenteEncadeada::Nodo::setProximo(Nodo* referencia){
    this->proximo = referencia;
}
ListaDuplamenteEncadeada::Nodo * ListaDuplamenteEncadeada::Nodo::getAnterior(){
    return this->anterior;
}
void ListaDuplamenteEncadeada::Nodo::setAnterior(Nodo* referencia){
    this->anterior = referencia;
}
