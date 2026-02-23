package utilities;

import java.io.FileReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonUtils {

    private static final Logger log = LogManager.getLogger(JsonUtils.class);
    private static JSONObject jsonObject;

    // ================= LOAD JSON =================

    public static void loadJson(String filePath) {

        try {
            log.info("Loading JSON file: " + filePath);

            FileReader reader = new FileReader(filePath);
            JSONTokener tokener = new JSONTokener(reader);
            jsonObject = new JSONObject(tokener);

        } catch (Exception e) {
            log.error("Failed to load JSON file", e);
            throw new RuntimeException(e);
        }
    }
    
    public static String getString(String parentKey, String childKey) {

        try {
            return jsonObject
                    .getJSONObject(parentKey)
                    .getString(childKey);

        } catch (Exception e) {
            log.error("Unable to fetch value from JSON", e);
            throw new RuntimeException(e);
        }
    }
    public static String getString(String key) {

        try {
            return jsonObject.getString(key);

        } catch (Exception e) {
            log.error("Unable to fetch value from JSON", e);
            throw new RuntimeException(e);
        }
    }
}
