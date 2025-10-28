package structural_patterns.facade.ex2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDeleter {
    public void deleteFile(String filePath) throws IOException {
        Files.deleteIfExists(Paths.get(filePath));
    }
}
