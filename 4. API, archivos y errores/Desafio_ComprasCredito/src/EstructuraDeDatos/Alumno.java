package EstructuraDeDatos;

public class Alumno {
    private String nombre;

    public Alumno(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public boolean equals(Object obj){
        Alumno otro = (Alumno) obj;
        return otro.getNombre().equals(this.nombre);
    }

    @Override
    public String toString(){
        return nombre;
    }
}
/*
* Al hacer esto, la primera estructura de datos que veremos es el almacenamiento secuencial. La idea de esta
* estructura es almacenar un alumno tras otro. Tendremos un conjunto de espacios (Array), donde: el primer alumno
* está en el primer espacio, el segundo alumno en el segundo espacio, y así sucesivamente
*
* 2. Sabiendo esto, creemos una nueva Clase, llamada "Vector", en la que necesitamos implementar la
* estructura de almacenamiento secuencial
*
* */
