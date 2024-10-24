package in.kgCoding.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        String FileName="example.txt";
        try(FileWriter file=new FileWriter(FileName)){
            file.write("Hello Rahul !\n");
            for(int i=2;i<50;i++) {
                for (int j = 1; j < 11; j++) {
                    file.write(i+" x " + j + " = " + i * j+ "\n");
                }
                file.write("\n\n");
            }
            file.flush();
            System.out.print("Successfully written to the file");
        }
        catch (IOException e){
            System.out.print("An error occurred.");
            e.printStackTrace();
        }
    }
}
