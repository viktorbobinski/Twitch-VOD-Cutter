import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Segmenter {
    long segmentDuration = 30;
    List<Segment> segments;

    public Segmenter() {
        segments = new ArrayList<>();
    }

    public List<Segment> segmentChat(List<ChatEntry> chatEntries) {
        LocalTime endOfSegment = LocalTime.of(0, 0, 0).plusSeconds(segmentDuration);

        Segment currentSegment = new Segment(LocalTime.of(0, 0, 0), segmentDuration);

        for (ChatEntry chatEntry : chatEntries) {
            if (chatEntry.getChatEntryTime().compareTo(endOfSegment) < 0) {
                currentSegment.addChatEntry(chatEntry);

            } else {
                segments.add(currentSegment);

                currentSegment = new Segment(endOfSegment, segmentDuration);
                currentSegment.addChatEntry(chatEntry);

                endOfSegment = endOfSegment.plusSeconds(segmentDuration);
            }
        }
        segments.add(currentSegment);

        return segments;
    }
}
