public class Main {
    public static void main(String[] args) {
        LogEntry logEntry = new LogEntry("example log line");
        UserAgent userAgent = new UserAgent("example user agent");
        Statistics statistics = new Statistics();


        statistics.addEntry(logEntry);
        double trafficRate = statistics.getTrafficRate();
        System.out.println("Traffic rate: " + trafficRate);
    }
}