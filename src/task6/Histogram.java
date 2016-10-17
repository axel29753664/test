package task6;

import java.util.List;

/**
 * Created by Axel_ on 07.09.2016.
 */
public class Histogram {
    private char[][] histogram;

    public Histogram(List<Integer> numbers) {
        fillHistogram(numbers, getMaxNumber(numbers));
    }

    public void printHistogram() {
        if (histogram.length != 0) {
            for (int i = 0; i < histogram[0].length; i++) {
                for (int j = 0; j < histogram.length; j++) {
                    System.out.print(histogram[j][i] + " ");
                }
                System.out.println();
            }
        }
    }

    private void fillHistogram(List<Integer> numbers, int maxNumber) {
        if (!numbers.isEmpty()) {
            histogram = new char[numbers.size()][maxNumber + 1];
            for (int i = 0; i < histogram.length; i++) {
                for (int j = 0; j < histogram[i].length; j++) {
                    if (maxNumber - numbers.get(i) <= j) {
                        histogram[i][j] = '*';
                    } else {
                        histogram[i][j] = ' ';
                    }
                }
                histogram[i][histogram[i].length - 1] = numbers.get(i).toString().charAt(0);
            }
        }else histogram = new char[0][0];
    }

    private int getMaxNumber(List<Integer> numbers) {
        int maxNumber = Integer.MIN_VALUE;
        for (int i : numbers) {
            if (i > maxNumber) {
                maxNumber = i;
            }
        }
        return maxNumber;
    }

}
