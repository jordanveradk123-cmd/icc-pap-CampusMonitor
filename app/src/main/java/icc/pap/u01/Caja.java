package icc.pap.u01;

import java.util.function.Function;

//CLASE GENERICA 
public class Caja<T> {
    // ATRIBUTO GENERICO
    private final T valor;

    // CONSTRUCTOR
    public Caja(T valor) {
        this.valor = valor;
    }

    // METODO GENRICO
    public T obtener() {
        return valor;
    }

    // METODO GENERICO QUE RECIBE UNA FUNCION Y DEVUELVE EL RESULTADO DE APLICAR ESA
    // FUNCION AL VALOR DE LA CAJA
    public <R> R mapear(Function<T, R> operacion) {
        R resultado = operacion.apply(valor);
        return resultado;
    }

}
