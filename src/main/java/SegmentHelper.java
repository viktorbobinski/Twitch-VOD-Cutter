import java.util.Comparator;

public class SegmentHelper {


    public Comparator<Segment> amazingComparator() {
        return Comparator.comparingLong(Segment::getAmazingReactions).reversed();
    }

    public Comparator<Segment> comparator() {
        return Comparator.comparingLong(Segment::getReactions).reversed();
    }
}
