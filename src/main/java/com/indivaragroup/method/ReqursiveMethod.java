package com.indivaragroup.method;

public class ReqursiveMethod {

    public void runRecursive() {

        System.out.println("=== RECURSIVE METHOD ===");

        int n = 5;

        System.out.println("Faktorial dari " + n + " = " + faktorial(n));

        System.out.println();

        System.out.println("Fibonacci sampai " + n + " angka:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        System.out.println();
    }

    // RECURSIVE FACTORIAL
    public int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * faktorial(n - 1);
    }

    // RECURSIVE FIBONACCI
    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
