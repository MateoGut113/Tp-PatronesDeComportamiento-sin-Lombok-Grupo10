package Visitor;

// Contrato que deben implementar las clases que aceptan un Visitor
public interface Elemento {
    void accept(Visitor visitor);
}
