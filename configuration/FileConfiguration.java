package com.astro.astrostats.configuration;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.Properties;

public class FileConfiguration {

    private final File file;
    private final Properties properties;

    public FileConfiguration(String resource, String from) {
        properties = new Properties();

        file = new File(resource);

        try {
            if(!file.exists()) {
                file.createNewFile();

                FileUtils.copyInputStreamToFile(getClass().getClassLoader().getResourceAsStream(from), file);
            }

            properties.load(FileUtils.openInputStream(file));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public <T> T get(String key) {
        return (T) properties.getProperty(key);
    }

    public <T> T getOrDefault(String key, String def) {
        return (T) properties.getProperty(key, def);
    }

    public File getFile() {
        return file;
    }

    public Properties getProperties() {
        return properties;
    }
}
