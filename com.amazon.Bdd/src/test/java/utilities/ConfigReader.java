package utilities;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfigReader {

    private static final Logger log = LogManager.getLogger(ConfigReader.class);
    private static Properties prop = new Properties();
    private static final String CONFIG_PATH =
            System.getProperty("user.dir") + "/src/test/resources/config/config.properties";

    // ================= STATIC BLOCK =================

    static {
        loadProperties();
    }

    // ================= LOAD =================

    private static void loadProperties() {

        try (InputStream input = new FileInputStream(CONFIG_PATH)) {

            prop.load(input);
            log.info("Config file loaded successfully");

        } catch (Exception e) {
            log.error("Failed to load config.properties", e);
            throw new RuntimeException("Unable to load config.properties");
        }
    }

    // ================= GET VALUE =================

    public static String get(String key) {

        String value = prop.getProperty(key);

        if (value == null) {
            log.error("Key not found in config: " + key);
            throw new RuntimeException("Key not found: " + key);
        }

        return value.trim();
    }

    // ================= GET INT =================

    public static int getInt(String key) {

        return Integer.parseInt(get(key));
    }

    // ================= GET BOOLEAN =================

    public static boolean getBoolean(String key) {

        return Boolean.parseBoolean(get(key));
    }
}