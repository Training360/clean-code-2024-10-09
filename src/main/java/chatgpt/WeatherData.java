package chatgpt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WeatherData {

    public static final String FOOTER_PREFIX = "mo";
    public static final String HEADER_PREFIX = "Dy";

    // ----------------------------------- metódusok -------------------------------------
    // -o-o-o-o-o-o-o-o-o-

    public static void main(String[] args) {
        String fileName = "weather.dat";
        int dayWithSmallestTempSpread = -1;
        int smallestTempSpread = Integer.MAX_VALUE;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Skip lines that don't contain day data
                if (line.startsWith(HEADER_PREFIX) || line.startsWith(FOOTER_PREFIX)) {
                    continue;
                }

                // Extract the day, max temperature, and min temperature
                String[] columns = line.trim().split("\\s+");
                int day = Integer.parseInt(columns[0]);
                int maxTemp = Integer.parseInt(columns[1].replace("*", ""));
                int minTemp = Integer.parseInt(columns[2].replace("*", ""));

                // Calculate the temperature spread
                int tempSpread = maxTemp - minTemp;

                // Update the day with the smallest temperature spread
                if (tempSpread < smallestTempSpread) {
                    smallestTempSpread = tempSpread;
                    dayWithSmallestTempSpread = day;
                } // end of if
            }
        } catch (IOException e) {
            e.printStackTrace();
        } // end of try

        System.out.println("Day with the smallest temperature spread: " + dayWithSmallestTempSpread);
    }
}
