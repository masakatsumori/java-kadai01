import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

class TestResults01 {

    public static void main(String[] args) {

        try (BufferedReader reader = Files.newBufferedReader(
                Paths.get(".", "scores.csv"),
                StandardCharsets.UTF_8)) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        }

        catch (IOException e) {
            e.printStackTrace();
        }

    }

}
