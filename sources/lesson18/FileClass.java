package lesson18;

import java.io.*;

public class FileClass {
    public static void main(String[] args) throws IOException {
        char[] in = new char[50];
        int size = 0;
        File file = new File("java-core\\src\\io\\file.txt");
        try (BufferedWriter fw = new BufferedWriter(new FileWriter("cf.txt"));
             BufferedReader fr = new BufferedReader(new FileReader("java-core\\src\\io\\file.txt"))) {

                 size =fr.read(in); // читаем !
            System.out.println("Количество прочитанных символов: "+size +" ");
                 String str;
        while((str =fr.readLine())!=null)

                 {
                     fw.write(str);
                     System.out.println(str);
                 }
             } catch(IOException e) {
            System.out.print(e.getMessage());
        }
    }
}

