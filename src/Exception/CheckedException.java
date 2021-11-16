package Exception;

import java.io.*;
import java.util.Scanner;

public class CheckedException {
    public static void main(String[] args) {
        doSomething();
    }

    /**
     * Using either handle-or-declare with checked exception
     */
    public static void readFile_CheckedException_Case1() {
        String expected_value = "Hello, world!";
        String file = "src/test/resources/fileTest.txt";

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String currentLine = reader.readLine();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * A method can add as many exceptions as needed in it 'throws'.
     * @throws IOException
     * @throws FileNotFoundException
     */
    public static void readFile_CheckedException_Case2() throws IOException, FileNotFoundException {
        String expected_value = "Hello, world!";
        String file = "src/test/resources/fileTest.txt";

        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        String currentLine = reader.readLine();
        reader.close();
    }

    public static File getFile(String url) throws FileNotFoundException {
        // some code
        throw new FileNotFoundException();
    }

    public String readFirstLine(String url) throws FileNotFoundException {
        try {
            Scanner scanner = new Scanner(new File(url));
            return scanner.nextLine();
        } catch(FileNotFoundException ex) {
            throw ex;
        }
    }

    public static String doSomething() {
        String name = "David";
        try {
            throw new IOException();
        } finally {
            return name;
        }
    }
}
