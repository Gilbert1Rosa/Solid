package solid.dao.interfaz;

import com.google.gson.JsonElement;

import solid.exception.SolidException;

public interface JsonLoader {
    JsonElement getObject(String id) throws SolidException;
}