package solid;

import com.google.gson.JsonObject;

import solid.dao.impl.ItemLoader;
import solid.model.Arma;
import solid.model.interfaz.Item;
import solid.util.ItemFactory;
import solid.util.ResourceManager;

public class SolidMain {
    public static void main(String[] args) {
        try {
            ResourceManager man = new ResourceManager("/Items.json");
            ItemFactory factory = new ItemFactory(man);
            Item item = factory.get("1");
            Arma arma = (Arma) item;
            arma.disparar(6.0f, 5.0f);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}