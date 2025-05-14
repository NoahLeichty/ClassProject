import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

// Will deal with file handling
public class FileHandling {

    // Constructor
    public FileHandling(){

    }
    // Makes file handling easier
    private List<String> loadAnyFile(String filename) {
        try {
            return new ArrayList<>(Files.readAllLines(Paths.get(
                    "Data/" + filename)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
