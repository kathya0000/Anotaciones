package S107Anotaciones.S107N2Ex1;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class JsonSerializer {
    public static void serializeToJson(Object object, String directory) {
        Gson gson = new Gson();
        String json = gson.toJson(object);

        String className = object.getClass().getSimpleName();
        String fileName = directory + className + ".json";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}