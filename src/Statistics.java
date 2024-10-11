import java.util.ArrayList;
import java.util.List;
public class Statistics {
    private final List<LogEntry> entries;

    public Statistics() {
        this.entries = new ArrayList<>();
    }

    public void addEntry(LogEntry entry) {
        entries.add(entry);
    }

    public double getTrafficRate() {

        return 0.0;
    }

    public int getTotalEntries() {
        return entries.size();
    }

}