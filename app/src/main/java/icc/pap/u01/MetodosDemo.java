package icc.pap.u01;

public class MetodosDemo {

    public static void min(String[] args) {
        Caja<String> original = new Caja<String>("algoritmo");

        // MAPEAR EL VALOR STRING DE LA CAJA A UN INTEGER
        Integer longitud = original.mapear(texto -> texto.length());
        String etiqueta = original.mapear(texto -> "Materia:" + texto);

        System.out.println("Original" + original.obtener());
        System.out.println("longitud" + longitud);
        System.out.println(etiqueta);

    }

}
