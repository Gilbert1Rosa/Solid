package solid.dao.interfaz;

import com.google.gson.JsonElement;

public interface JsonLoader {
    JsonElement getObject(String id);
}