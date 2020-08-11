import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//converte arquivo para binario e descoverte para arquivo
public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Desktop\\teste.JPG");
        //init array with file length
        byte[] bytesArray = new byte[(int) file.length()];

        FileInputStream fis = new FileInputStream(file);
        fis.read(bytesArray); //read file into bytes[]
        fis.close();
        for(byte i : bytesArray)
            System.out.println(i);
        file = new File("C:\\Desktop\\newfile.JPG");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(bytesArray, 0, bytesArray.length);
        fos.flush();
        fos.close();
    }
}
