package task6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Axel_ on 07.09.2016.
 */
public class NumberFileReader {
    public List<String> readFromFile(File fileName) {
        BufferedReader reader = null;
        List<String> list = new ArrayList<>();
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File : " + fileName + " not found !!! ");
//            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;

    }
}
