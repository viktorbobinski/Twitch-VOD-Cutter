import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ChatEntry {

    String timeStamp;
    String nickname;
    String text;

    public ChatEntry(String chatEntryString) {
        String[] chatEntry = chatEntryString.split(" ", 3);
        timeStamp = chatEntry[0].substring(1, chatEntry[0].length() - 1);
        if (timeStamp.length() == 7) {
            timeStamp = "0" + timeStamp;
        }
        nickname = chatEntry[1].substring(0, chatEntry[1].length() - 1);
        text = chatEntry[2];
    }

    public LocalTime getChatEntryTime() {
        return LocalTime.parse(this.timeStamp, DateTimeFormatter.ISO_LOCAL_TIME);
    }

    public String getText() {
        return text;
    }

    public String[] getWords() {
        return text.split(" ");
    }

    @Override
    public String toString() {
        return "ChatEntry{" +
                "timeStamp='" + timeStamp + '\'' +
                ", nickname='" + nickname + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
