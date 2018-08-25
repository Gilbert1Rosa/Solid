package solid.util;

import solid.exception.SolidException;
import solid.util.interfaz.ContentManager;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ResourceManager implements ContentManager {
    private String url;

    public ResourceManager(String url) {
        this.url = url;
    }

    public String getContent() throws SolidException {
        InputStream is;
        String res = "";
        try {
            is = getClass().getResourceAsStream(url);
            res = new String(IOUtils.toByteArray(is));
        } catch(NullPointerException npe) {
            throw new SolidException("Objeto nulo al obtener contenido del archivo", 5);
        } catch (IOException ioe) {
            throw new SolidException(String.format("Error de I/O al obtener recurso: %s", url), 7);
        }
        return res;
    }
}