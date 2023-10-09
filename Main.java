import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestXSequence {
    public static void main(String[] args) {
        String fileName = "file.txt"; 

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int currentLength = 0;
            int maxLength = 0;

            while ((line = reader.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == 'X') {
                        currentLength++;
                        maxLength = Math.max(maxLength, currentLength);
                    } else {
                        currentLength = 0;
                    }
                }
            }

            System.out.println("Самая длинная последовательность символов 'X': " + maxLength);
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
