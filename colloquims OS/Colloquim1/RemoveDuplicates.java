package fibonachi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

    public static <T> List<T> removeDuplicates(List<T> inputList) {
        if (inputList == null) {
            throw new IllegalArgumentException("Input list cannot be null");
        }

        Set<T> setWithoutDuplicates = new LinkedHashSet<>(inputList);
        return new ArrayList<>(setWithoutDuplicates);
    }

    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");
            List<Integer> numbersWithDuplicates = readInputFromFile(inputFile);

            List<Integer> numbersWithoutDuplicates = removeDuplicates(numbersWithDuplicates);

            System.out.println("Original List: " + numbersWithDuplicates);
            System.out.println("List without Duplicates: " + numbersWithoutDuplicates);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static List<Integer> readInputFromFile(File file) throws FileNotFoundException {
        List<Integer> numbers = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }
        }
        return numbers;
    }
}
