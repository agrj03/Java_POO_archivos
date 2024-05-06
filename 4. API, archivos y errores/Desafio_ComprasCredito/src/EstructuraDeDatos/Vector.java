package EstructuraDeDatos;

import java.util.Arrays;

public class Vector {
    private Alumno[] alumnos = new Alumno[100];

    public void adicionar(Alumno alumno) {
        //recibe un alumno
    }

    public Alumno obtener(int posicion) {
        //recibe una posición y devuelve el alumno
        return null;
    }

    public void remove(int posicion) {
        //elimina por la posición
    }

    public boolean contiene(Alumno alumno) {
        //Sabremos si está el alumno o no en la lista
        return false;
    }

    public int tamanio() {
        //Devuelve la cantidad de alumnos
        return 0;
    }

    public String toString() {
        //Facilitará la impresión
        return Arrays.toString(alumnos);
    }

}
