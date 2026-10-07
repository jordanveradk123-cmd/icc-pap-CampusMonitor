package main.java.icc.pap.u01;

//CLASE GENERICA 
public class Caja<T> {
    // ATRIBUTO GENERICO
    private final T valor;

    // CONSTRUCTOR
    public Caja(T valor) {
        this.valor = valor;
    }

    // METODO
    public T obtener() {
        return valor;
    }

}
