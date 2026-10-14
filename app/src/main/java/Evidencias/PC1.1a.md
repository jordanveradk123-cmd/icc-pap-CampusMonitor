1.Implementacion Realizada


Que representa la clase Lectura<T>.
Es una clase que va a utilizar un atributo generico, que tiene 3 atributos 2 de tipo String y un tipo generico que quiere decir esto, que puede tomar cualquier forma que en este caso se le denomino valor.

Qué representa T y por qué permite utilizar la misma clase para temperatura y ocupación.
Es un valor generico se le podra dar cualquier valor o forma como antes dicho esto hace que a T se le pueda utilizar en diferentes aspectos es decir la clase es la misma pero los datos arrojados en consola son diferentes porque el uno es temperatura y el otro es Ocupacion casi como una funcion.

Qué agregaste en App.java.

en el main agrege un runLectura 
 private static void runlectura() {
        Lectura<Double> temperatura = new Lectura<>("S01", 22.5, "°C");
        Lectura<Integer> lectura1 = new Lectura<>("S02", 18, "Personas");

        System.out.println("Lecturas de CampusMonitor");
        System.out.println(temperatura.getIdSensor() + " | " + temperatura.getValor() + " " + temperatura.getUnidad());
        System.out.println(lectura1.getIdSensor() + " | " + lectura1.getValor() + " " + lectura1.getUnidad());

        System.out.println("Valores recuperados sin casting:");
        System.out.println("Temperatura: " + temperatura.getValor());
        System.out.println("Ocupación: " + lectura1.getValor());
luego Instancie dos objetos tipo lectura pero uno es temperatura y el otro es Lectura 1 con el valor t que se le dio dos tipos diferentes un Integer y un Double luego simplemente se mostro en consola los valores con los sout.
![alt text](image.png)


