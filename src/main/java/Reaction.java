import java.util.Arrays;

public abstract class Reaction {

    String[] vocabulary;
    long reactionCounter;

    public void filterWords(String[] words) {
        for (String word : words) {
            if (Arrays.asList(vocabulary).contains(word.toLowerCase())) {
                reactionCounter += 1;
            }
        }
    }

    public long getCount() {
        return reactionCounter;
    }

    @Override
    public String toString() {
        return "Reaction{" +
                "reactionCounter=" + reactionCounter +
                '}';
    }
}
