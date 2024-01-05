package fibonachi;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class FibonacciTest {

    @Test
    public void readData1() {
        Fibonacci fib = new Fibonacci();
        String input = "10";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());

        try (Scanner scanner = new Scanner(inputStream)) {
            fib.readData(scanner);
        }

        assertEquals(10, fib.getN());
    }

    @Test
    public void readData2() {
        Fibonacci fib = new Fibonacci();
        String input = "20";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());

        try (Scanner scanner = new Scanner(inputStream)) {
            fib.readData(scanner);
        }

        assertEquals(20, fib.getN());
    }

    @Test
    public void readData3() {
        Fibonacci fib = new Fibonacci();
        String input = "1000";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());

        try (Scanner scanner = new Scanner(inputStream)) {
            fib.readData(scanner);
        }

        assertEquals(1000, fib.getN());
    }

    @Test
    public void readData4() {
        Fibonacci fib = new Fibonacci();
        String input = "0";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());

        try (Scanner scanner = new Scanner(inputStream)) {
            fib.readData(scanner);
        }

        assertEquals(0, fib.getN());
    }

    @Test
    public void testCalculateFibonacci1() {
        Fibonacci fib = new Fibonacci();
        fib.readData(new Scanner("10"));

        fib.calculateFibonacci();
        List<Integer> expectedFibonacci = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
        assertEquals(expectedFibonacci, fib.getFibonacciList());
    }

    @Test
    public void testCalculateFibonacci2() {
        Fibonacci fib = new Fibonacci();
        fib.readData(new Scanner("0"));

        fib.calculateFibonacci();
        List<Integer> expectedFibonacci = Arrays.asList(0);
        assertEquals(expectedFibonacci, fib.getFibonacciList());
    }

    @Test
    public void testCalculateFibonacci3() {
        Fibonacci fib = new Fibonacci();
        fib.readData(new Scanner("1"));

        fib.calculateFibonacci();
        List<Integer> expectedFibonacci = Arrays.asList(0, 1);
        assertEquals(expectedFibonacci, fib.getFibonacciList());
    }
    @Test
    public void testCalculateFibonacci4() {
        Fibonacci fib = new Fibonacci();
        fib.readData(new Scanner("20"));

        fib.calculateFibonacci();
        List<Integer> expectedFibonacci = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181);
        assertEquals(expectedFibonacci, fib.getFibonacciList());
    }
}