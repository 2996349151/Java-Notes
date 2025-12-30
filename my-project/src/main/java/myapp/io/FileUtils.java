package myapp.io;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;


public class FileUtils {
    public static void write(String file, String text){
        try {
            Files.writeString(Paths.get(file), text + System.lineSeparator(),
                            Files.exists(Paths.get(file)) ? 
                            java.nio.file.StandardOpenOption.APPEND : 
                            java.nio.file.StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
