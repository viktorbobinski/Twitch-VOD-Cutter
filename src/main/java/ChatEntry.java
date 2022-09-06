public class ChatEntry {

    String timeStamp;
    String nickname;
    String text;

    public ChatEntry(String chatEntryString) {
        String[] chatEntry = chatEntryString.split(" ", 3);
        timeStamp = chatEntry[0];
        nickname = chatEntry[1];
        text = chatEntry[2];
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
