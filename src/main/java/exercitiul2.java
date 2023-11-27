import java.io.*;
import java.nio.file.Path;

public class exercitiul2 {
    static String absolutePath = Path.of("").toAbsolutePath() + "\\resources\\data2.txt";

    public static void scriere(String text) throws IOException {
        FileWriter fileWriter = new FileWriter(absolutePath);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(text);
        printWriter.close();
    }

    public static void citire() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(absolutePath));
        String currentLine = reader.readLine();
        reader.close();
        System.out.print(currentLine);

    }

    public static void merelapere() throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(absolutePath));
        String currentLine = reader.readLine();

        FileWriter fileWriter = new FileWriter(absolutePath);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        currentLine=currentLine.replace("mere","pere");
        printWriter.print(currentLine);
        reader.close();
        printWriter.close();

    }
    public static void main(String[] args) throws IOException {

        scriere("Ana are mere");
        citire();
        merelapere();
    }
}
