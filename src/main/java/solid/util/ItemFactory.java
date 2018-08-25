package solid.util;

import solid.exception.SolidException;
import solid.util.interfaz.ContentManager;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import solid.model.interfaz.Item;
import solid.dao.impl.ItemLoader;

public class ItemFactory {

    private ContentManager man;
    private ItemLoader loader;

    public ItemFactory(ContentManager man) throws Exception {
        this.man = man;
        this.loader = new ItemLoader(man.getContent());
    }

    public Item create(String id) throws SolidException {
        JsonElement rawEl;
        JsonObject rawObj;
        Item item;
        try {
            rawEl = loader.getObject(id);
            rawObj = rawEl.getAsJsonObject();
            Class clase = Class.forName(rawObj.get("class").getAsString());
            item = (Item)(new Gson().fromJson(rawEl, clase));
        } catch(NullPointerException npe) {
            if (loader == null) {
                throw new SolidException("Cargador de items nulo", 1);
            }
            throw new SolidException("Objeto nulo al crear item", 3);
        } catch (Exception e) {
            throw new SolidException("Error al crear item", 4);
        }
        return item;
    }
}