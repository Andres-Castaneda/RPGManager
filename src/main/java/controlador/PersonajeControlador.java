/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Personaje;
import vista.PersonajeVista;

public class PersonajeControlador {
    private final Personaje servicio;
    private PersonajeVista vista;

    public PersonajeControlador(Personaje servicio, PersonajeVista vista) {
        this.servicio = servicio;
        this.vista = vista;
    }

    public void ejecutar() {
        int opcion;
        do {
            vista.mostrarMenuPrincipal();
            opcion = vista.pedirOpcion();

            switch (opcion) {
                case 1:
                    // TODO: conectar con servicio para crearPersonaje
                    break;
                case 2:
                    // TODO: conectar con servicio para listarPersonajes
                    break;
                case 3:
                    // TODO: conectar con servicio para buscarPorId
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }
}
