package Servicio;


import controlador.PersonajeControlador;
import modelo.Personaje;
import vista.PersonajeVista;

public class RPGManager {
    public static void main(String[] args) {
        // Instanciamos las capas
        Personaje servicio = new Personaje();
        PersonajeVista vista = new PersonajeVista();
        
        // Inyectamos las capas en el controlador
        PersonajeControlador controlador = new PersonajeControlador(servicio, vista);
        
        // Iniciamos la aplicación
        controlador.ejecutar();
    }
}