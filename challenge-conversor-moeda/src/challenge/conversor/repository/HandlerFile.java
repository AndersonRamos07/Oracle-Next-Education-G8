package challenge.conversor.repository;

import java.io.*;

public class HandlerFile {

    public static File arquivo = new File(System.getProperty("user.dir") + "\\bd\\logs.txt");

    public static boolean appendLog (String conversion) {
        try(BufferedWriter handler = new BufferedWriter(new FileWriter(arquivo, true))){
            handler.write(conversion);
        } catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static boolean showLog () {
        System.out.println("Mostrar log:\n");
        try {
            FileReader fileReader = new FileReader(arquivo); // A stream that connects to the text file
            BufferedReader bufferedReader = new BufferedReader(fileReader); // Connect the FileReader to the BufferedReader

            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line); // Display the file's contents on the screen, one line at a time
            }

            bufferedReader.close(); // Close the stream
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

}
