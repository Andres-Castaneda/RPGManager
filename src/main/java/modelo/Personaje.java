package modelo;

public class Personaje {
    private int id;
    private String nombre;
    private int nivel;
    private int puntosSalud;

    public Personaje() {
    }

    public Personaje(int id, String nombre, int nivel, int puntosSalud) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosSalud = puntosSalud;
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }

    public int getPuntosSalud() { return puntosSalud; }
    public void setPuntosSalud(int puntosSalud) { this.puntosSalud = puntosSalud; }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", puntosSalud=" + puntosSalud +
                '}';
    }
}
