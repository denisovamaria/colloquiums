package fibonachi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    private int n;

    public List<Integer> getFibonacciList() {
        return fibonacciList;
    }

    public void setFibonacciList(List<Integer> fibonacciList) {
        fibonacciList = fibonacciList;
    }

    private List<Integer> fibonacciList;

    public Fibonacci() {
        this.n = n;
        this.fibonacciList = new ArrayList<>();
    }

    public void readData(Scanner in) {
        if (in != null) {
            n = in.nextInt();
        }
    }

    public List<Integer> calculateFibonacci() {
        fibonacciList.add(0);
        if (n != 0)
            fibonacciList.add(1);
        for (int i = 2; i < n; i++) {
            fibonacciList.add(fibonacciList.get(i - 1) + fibonacciList.get(i - 2));
        }

        return fibonacciList;
    }
}