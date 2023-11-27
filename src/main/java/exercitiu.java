import java.io.*;
import java.nio.file.Path;

public class exercitiu {


    static String absolutePath = Path.of("").toAbsolutePath() + "\\resources\\data.txt";

    public static void scriere1() throws IOException {
        FileWriter fileWriter = new FileWriter(absolutePath);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print("Hello Java files");
        printWriter.close();
    }

    public static void citire1() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(absolutePath));
        String currentLine = reader.readLine();
        reader.close();
        System.out.print(currentLine);
    }
    public static void scriere2() throws IOException {

        try (FileWriter fw = new FileWriter(absolutePath, true);
             BufferedWriter writer = new BufferedWriter(fw);) {

            writer.write("\nHello World");
        }
    }
    public static void citire2() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(absolutePath));
        String currentLine = reader.readLine();

        while(currentLine != null)
        {
            System.out.print("\n"+currentLine);
            currentLine = reader.readLine();
        }
        reader.close();
    }

    public static void main(String[] args) throws IOException {

        scriere1();
        citire1();
        scriere2();
        citire2();
    }
}
