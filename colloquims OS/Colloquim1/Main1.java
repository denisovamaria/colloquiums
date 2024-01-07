package fibonachi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        try (Scanner in = new Scanner(new File("Input1.txt"))) {
            fib.readData(in);
            fib.calculateFibonacci();
            System.out.print(fib.getFibonacciList());
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
