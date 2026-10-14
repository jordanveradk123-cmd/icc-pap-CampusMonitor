package icc.pap.Models;

import com.google.common.base.Function;

public class Lectura<T> {

    // Atributos de la clase Lectura
    private String idSensor;
    private T valor;
    private String unidad;
     
    // Constructor de la clase Lectura
    public Lectura(String idSensor, T valor, String unidad) {
        this.idSensor = idSensor;
        this.valor = valor;
        this.unidad = unidad;
    }
    
    // Getters para los atributos de la clase Lectura
    public String getIdSensor() {
        return idSensor;
    }

    public T getValor() {
        return valor;
    }

    public String getUnidad() {
        return unidad;
    }

    // método público de instancia que declare su propio parámetro R:
    public <R> Lectura<R> transformar(Function<T, R> conversor, String nuevaUnidad) {

        if (conversor == null) {
            throw new IllegalArgumentException("El conversor no puede ser nulo ");
        }

        R valorTransformado = conversor.apply(this.valor);

        if (valorTransformado == null) {
            throw new IllegalArgumentException("El resultado de la conversión no puede ser nulo");
        }

        return new Lectura<>(this.idSensor, valorTransformado, nuevaUnidad);
    }

}
