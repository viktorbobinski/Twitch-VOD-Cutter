import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Segment implements Comparable<Segment> {
    LocalTime startTime;
    long duration;
    List<ChatEntry> chatEntries;
    FunnyReaction funnyReaction;
    AmazingReaction amazingReaction;

    public Segment(LocalTime startTime, long duration) {
        this.startTime = startTime;
        this.duration = duration;
        funnyReaction = new FunnyReaction();
        amazingReaction = new AmazingReaction();
        chatEntries = new ArrayList<>();
    }

    public void addChatEntry(ChatEntry chatEntry) {
        funnyReaction.filterWords(chatEntry.getWords());
        amazingReaction.filterWords(chatEntry.getWords());
        chatEntries.add(chatEntry);
    }

    @Override
    public String toString() {
        return "Segment{" +
                "startTime=" + startTime +
                ", duration=" + duration +
                ", chatEntries=" + chatEntries +
                ", funnyReaction=" + funnyReaction +
                ", amazingReaction=" + amazingReaction +
                '}';
    }

    public long getReactions() {
        return funnyReaction.getCount() + amazingReaction.getCount();
    }

    public long getAmazingReactions() {
        return amazingReaction.getCount();
    }


    @Override
    public int compareTo(Segment o) {
        return -Long.compare(getReactions(), o.getReactions());
    }
}
