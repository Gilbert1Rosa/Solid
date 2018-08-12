package solid.util;

import solid.util.interfaz.ContentManager;

import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ResourceManager implements ContentManager {
    private String url;

    public ResourceManager(String url) {
        this.url = url;
    }

    public String getContent() throws Exception {
        InputStream is = getClass().getResourceAsStream(url);
        return new String(IOUtils.toByteArray(is));
    }
}