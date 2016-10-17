package task6;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Created by Axel_ on 07.09.2016.
 */
public class NumberDataParser {
    public List<Integer> parseNumbers(List<String> list) {
        List<Integer> numbers = new ArrayList<>();
        try {
            for (String s : list) {
                numbers.add(Integer.parseInt(s));
            }
        }catch (NumberFormatException e){
            System.err.println("WRONG DATA FORMAT !");
        }
        return numbers;
    }
}
