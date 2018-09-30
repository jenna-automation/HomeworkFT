import java.io.File;
import java.io.IOException;
import java.util.Random;

public class main {

    private static final String name = "File.txt";
    private static final Random random = new Random();
    private static final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdfghijklmnopqrstuvwxyz1234567890";

    public static void main(String args[]) throws IOException {
        String DirectoryName = "";
        for (int i = 0; i < 20; i++){
            DirectoryName += (char)(characters.charAt(random.nextInt(characters.length())));
        }

        new File(DirectoryName).mkdirs();
        new File(DirectoryName + "/" + name).createNewFile();
    }
}