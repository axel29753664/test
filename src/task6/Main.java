package task6;

import java.io.File;
import java.lang.management.MemoryManagerMXBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Axel_ on 07.09.2016.
 */
public class Main {
    public static final String FILE_NAME = "src/task6/numbers.txt";

    public static void main(String[] args) {
        NumberFileReader reader = new NumberFileReader();
        File file = new File(FILE_NAME);
        NumberDataParser parser = new NumberDataParser();
        List<Integer> numbers = new ArrayList<>();
        numbers = parser.parseNumbers(reader.readFromFile(file));
        Histogram histogram = new Histogram(numbers);
        histogram.printHistogram();
        System.out.println("hello number 2");

    }
}
