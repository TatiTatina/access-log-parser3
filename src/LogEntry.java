import java.time.LocalDateTime;

public class LogEntry {
    private final String ipAddress;
    private final LocalDateTime dateTime;
    private final HttpMethod method;
    private final String path;
    private final int responseCode;
    private final int dataSize;
    private final String referer;
    private final UserAgent userAgent;

    public LogEntry(String logLine) {
        this.ipAddress = "defaultIpAddress";
        this.dateTime = LocalDateTime.now();
        this.method = HttpMethod.GET;
        this.path = "";
        this.responseCode = 200;
        this.dataSize = 0;
        this.referer = "";
        this.userAgent = new UserAgent("defaultUserAgent");
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }



    public enum HttpMethod {
        GET, POST, PUT, DELETE
    }
}