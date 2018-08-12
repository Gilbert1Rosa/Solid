package solid.model;

import solid.model.interfaz.Disparable;
import solid.model.interfaz.Item;

public class Arma implements Item, Disparable {

    private int id;
    private String nombre;
    private float alcance;
    private int perjuicio;
    private boolean destructible;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getAlcance() {
        return alcance;
    }

    public void setAlcance(float alcance) {
        this.alcance = alcance;
    }

    public int getPerjuicio() {
        return perjuicio;
    }

    public void setPerjuicio(int perjuicio) {
        this.perjuicio = perjuicio;
    }

    public void setDestructible(boolean destructible) {
        this.destructible = destructible;
    }

    public boolean isDestructible() {
        return destructible;
    }

    public void disparar(float x, float y) {
        System.out.println(String.format("Arma %s, disparo en (%f,%f)", nombre, x, y));
    }
}