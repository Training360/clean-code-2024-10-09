package eagerweather;

import java.io.BufferedReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class WeatherFile {

    public static final int NUMBER_OF_HEADER_LINES = 2;

    private List<DayTemperatures> dayTemperatures;

    public static WeatherFile read(Reader reader) {
        var weather = new WeatherFile();
        weather.dayTemperatures = new BufferedReader(reader)
                .lines()
                .skip(NUMBER_OF_HEADER_LINES)
                .filter(onlyDayLines())
                .map(DayTemperatures::parse)
                .toList();
        return weather;
    }

    public int findDayWithMinimumTemperatureDifference() {
                    return dayTemperatures
                            .stream()
                    .min(Comparator.comparing(DayTemperatures::getDifference))
                    .map(DayTemperatures::day)
                    .orElseThrow(WeatherFile::illegalArgumentException);
    }

    private static Predicate<String> onlyDayLines() {
        return line -> !line.contains("mo");
    }

    private static IllegalArgumentException illegalArgumentException() {
        return new IllegalArgumentException("Can not find lines for days in file.");
    }
}
