import java.io.*;
import java.util.*;

public class App {

    public static void main(String[] args) throws IOException {
        File file = new File(
                "C:\\Users\\shiva\\Desktop\\test.txt");
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        String chatEntryString;
        List<ChatEntry> chatEntries = new ArrayList<>();
        while ((chatEntryString = br.readLine()) != null) {
            chatEntries.add(new ChatEntry(chatEntryString));
        }

        Segmenter segmenter = new Segmenter();
        SegmentHelper helper = new SegmentHelper();
        List<Segment> segments = segmenter.segmentChat(chatEntries);

        segments.sort(helper.comparator());

        Printer printer = new Printer();
        printer.printToFile(segments);
    }
}
