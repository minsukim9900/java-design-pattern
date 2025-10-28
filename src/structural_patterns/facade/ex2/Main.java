package structural_patterns.facade.ex2;

public class Main {
    public static void main(String[] args) {
        FileSystemFacade fs = new FileSystemFacade();

        boolean writeSuccess = fs.writeFile(
                "text.txt", "Hello, Facade Patterns!"
        );

        System.out.println("File written successfully" + writeSuccess);

        String content = fs.readFile("text.txt");
        System.out.println("File content: " + content);

        boolean deleteSuccess = fs.delete("text.txt");
        System.out.println("File deleted successfully" + deleteSuccess);
    }
}
