package structural_patterns.facade.ex2;

import java.io.IOException;

public class FileSystemFacade {
    private FileReader fileReader;
    private FileWriter fileWriter;
    private FileDeleter fileDeleter;

    public FileSystemFacade() {
        fileReader = new FileReader();
        fileWriter = new FileWriter();
        fileDeleter = new FileDeleter();
    }

    public String readFile(String filePath) {
        try {
            return fileReader.readFile(filePath);
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return null;
        }
    }

    public boolean writeFile(String filePath, String content) {
        try {
            fileWriter.writeFile(filePath, content);
            return true;
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public boolean delete(String filePath) {
        try {
            fileDeleter.deleteFile(filePath);
            return true;
        } catch (IOException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }
}
