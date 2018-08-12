package solid.util;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import solid.model.interfaz.Item;
import solid.dao.impl.ItemLoader;

public class ItemFactory {

    private ResourceManager man;
    private ItemLoader loader;

    public ItemFactory(ResourceManager man) throws Exception {
        this.man = man;
        this.loader = new ItemLoader(man.getContent());
    }

    public Item get(String id) throws Exception {
        JsonElement rawEl = loader.getObject(id);
        JsonObject rawObj = rawEl.getAsJsonObject();
        Class clase = Class.forName(rawObj.get("class").getAsString());
        return (Item)(new Gson().fromJson(rawEl, clase));
    }
}