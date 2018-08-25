package solid.dao.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonObject;

import solid.dao.interfaz.JsonLoader;
import solid.exception.SolidException;

public class ItemLoader implements JsonLoader {

    private String content;

    public ItemLoader(String content) {
        this.content = content;
    }

    public JsonElement getObject(String id) throws SolidException {
        JsonElement res = null;
        try {
            JsonArray items = new JsonParser().parse(content).getAsJsonArray();
            for (JsonElement item : items) {
                JsonObject obj = item.getAsJsonObject();
                String objId = obj.get("id").getAsString();
                if (id.equals(objId)) {
                    res = item;
                }
            }
        } catch(NullPointerException npe) {
            throw new SolidException("Objeto nulo al analizar JSON", 7);
        } catch(Exception e) {
            throw new SolidException("Error al analizar JSON", 8);
        }
        return res;
    }
}