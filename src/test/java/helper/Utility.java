package helper;

import java.io.File;

public class Utility {
    public static File getJsonFile(String JSONFile){
        return new File("src/test/java/helper/jsonSchemaData/" + JSONFile);
    }
}
