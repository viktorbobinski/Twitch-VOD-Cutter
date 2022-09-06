import java.io.*;
import java.util.ArrayList;
import java.util.List;

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

        chatEntries.forEach(System.out::println);
    }
}
