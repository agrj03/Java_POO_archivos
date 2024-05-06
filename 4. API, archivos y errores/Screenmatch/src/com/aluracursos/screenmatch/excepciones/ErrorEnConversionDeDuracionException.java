package com.aluracursos.screenmatch.excepciones;
//Forma de crear excepciones personalizadas. Se hace uso de RuntimeException ya que es
public class ErrorEnConversionDeDuracionException extends RuntimeException {
    private String mensaje;

    public ErrorEnConversionDeDuracionException(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
