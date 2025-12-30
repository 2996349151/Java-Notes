package myapp.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Paths;

public class JsonConfigLoader {
    public static <T> T load(String path, Class <T> clazz) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(Paths.get(path).toFile(), clazz);
    }
}
