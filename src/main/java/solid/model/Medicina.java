package solid.model;

import solid.model.interfaz.Item;

public class Medicina implements Item {

    private int id;
    private String nombre;
    private int curacion;
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

    public int getCuracion() {
        return curacion;
    }

    public void setCuracion() {
        this.curacion = curacion;
    }

    public void setDestructible(boolean destructible) {
        this.destructible = destructible;
    }

    public boolean isDestructible() {
        return destructible;
    }
}