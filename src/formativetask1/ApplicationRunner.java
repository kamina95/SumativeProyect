package formativetask1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import java.util.Scanner;

public class ApplicationRunner {

    public static void main(String[] args) {

        String dataFile = System.getProperty("user.dir") + File.separator + "datafile.txt";

        String opFile = System.getProperty("user.dir") + File.separator + "result.txt";

        File fileObj = new File(dataFile);

        Scanner input = null;

        PrintWriter pw = null;

        try {

            input = new Scanner(fileObj);

            pw = new PrintWriter(new File(opFile));

            while (input.hasNext()) {

                String line = input.nextLine().trim();

                //System.out.println(line);
                
                String[] items = line.split(" ");
                
                for(String s: items){
                
                    System.out.println(s);
                
                }
                
                //pw.println(line);

            }

        } catch (FileNotFoundException fne) {

            System.out.println("File not founded....");
            System.exit(0);

        } finally {

            System.out.println("Fin of the Block");

            input.close();

            pw.close();

        }

    }

}
