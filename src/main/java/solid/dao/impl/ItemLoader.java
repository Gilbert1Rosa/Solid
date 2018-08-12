package solid.dao.impl;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.JsonObject;

import solid.dao.interfaz.JsonLoader;

public class ItemLoader implements JsonLoader {

    private String content;

    public ItemLoader(String content) {
        this.content = content;
    }

    public JsonElement getObject(String id) {
        JsonArray items = new JsonParser().parse(content).getAsJsonArray();
        JsonElement res = null;
        for (JsonElement item : items) {
            JsonObject obj = item.getAsJsonObject();
            String objId = obj.get("id").getAsString();
            if (id.equals(objId)) {
                res = item;
            }
        }
        return res;
    }
}