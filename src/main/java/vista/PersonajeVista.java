/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Personaje;
import java.util.List;
import java.util.Scanner;

public class PersonajeVista {
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarMenuPrincipal() {
        System.out.println("\n--- RPG MANAGER MENU ---");
        System.out.println("1. Crear Personaje");
        System.out.println("2. Listar Personajes");
        System.out.println("3. Buscar Personaje por ID");
        System.out.println("4. Salir"); // Opción actualizada
        System.out.print("Seleccione una opción: ");
    }

    public void mostrarPersonaje(Personaje p) {
        if (p != null) {
            System.out.println("Detalles: " + p.toString());
        } else {
            System.out.println("Error: Personaje no encontrado.");
        }
    }

    public String pedirNombrePersonaje() {
        return leerTextoNoVacio("Ingrese el nombre del nuevo personaje: ");
    }

    public void mostrarLista(List<Personaje> personajes) {
        System.out.println("--- LISTA DE PERSONAJES ---");
        if (personajes == null || personajes.isEmpty()) {
            System.out.println("No hay personajes registrados.");
        } else {
            for (Personaje p : personajes) {
                System.out.println(p);
            }
        }
    }
    
    public int pedirOpcion() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
    
    public int leerEnteroValido(String msg, int min, int max) {
        int numero = -1;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(msg);
                numero = Integer.parseInt(scanner.nextLine());
                if (numero >= min && numero <= max) {
                    valido = true;
                } else {
                    System.out.println("Error: El número debe estar entre " + min + " y " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Por favor, ingrese un número entero válido.");
            }
        }
        return numero;
    }

    /**
     * Solicita una cadena de texto al usuario y asegura que no esté vacía 
     * ni contenga solo espacios en blanco.
     * @param msg
     */
    public String leerTextoNoVacio(String msg) {
        String texto = "";
        while (texto.trim().isEmpty()) {
            System.out.print(msg);
            texto = scanner.nextLine();
            if (texto.trim().isEmpty()) {
                System.out.println("Error: El campo no puede estar vacío.");
            }
        }
        return texto;
    }

    
}
