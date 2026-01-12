package com.challengeproblem;

public class StringComparison {

    public static void main(String[] args) {

        int iterations = 1000000;
        String word = "hello";

        // StringBuilder test
        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < iterations; i++) {
            sb.append(word);
        }

        long endBuilder = System.nanoTime();

        // StringBuffer test
        long startBuffer = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();

        for (int i = 0; i < iterations; i++) {
            sbuf.append(word);
        }

        long endBuffer = System.nanoTime();

        System.out.println("StringBuilder Time (ms): " +
                (endBuilder - startBuilder) / 1_000_000);

        System.out.println("StringBuffer Time (ms): " +
                (endBuffer - startBuffer) / 1_000_000);
    }
}