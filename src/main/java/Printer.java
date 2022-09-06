import java.io.*;
import java.util.List;

public class Printer {
    File outputFile;

    public Printer() {
        outputFile = new File(
                "C:\\Users\\shiva\\Desktop\\output.txt");
    }

    public void printToFile(List<Segment> segments) throws IOException {
        BufferedWriter br
                = new BufferedWriter(new FileWriter(outputFile));
        for (Segment segment : segments) {
            br.write(segment.toString());
            br.write("\n\n");
        }
    }
}
