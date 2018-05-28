package br.com.s2it.ex9;

/**
 *
 * @author Paulo
 */
public class NumberGenerator {

    public int buildNumber(int a, int b) {

        char[] arrayA = Integer.toString(a).toCharArray();
        char[] arrayB = Integer.toString(b).toCharArray();

        int largerSize = arrayA.length >= arrayB.length ? arrayA.length : arrayB.length;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < largerSize; i++) {

            if (arrayA.length > i) {
                builder.append(arrayA[i]);
            }

            if (arrayB.length > i) {
                builder.append(arrayB[i]);
            }
        }

        Integer newNumber = Integer.valueOf(builder.toString());

        if (newNumber > 1000000) {
            return -1;
        }

        return newNumber;
    }
}
