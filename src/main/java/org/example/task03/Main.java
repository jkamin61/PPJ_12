package org.example.task03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] tab = createRandomMatrix();
        try {
            checkArray(tab);
            List<String> errors = checkArray(tab);
            if (errors.isEmpty()) {
                System.out.println("Array is correct");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static int[][] createRandomMatrix() {
        Random random = new Random();
        int[][] tab = new int[3][3];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = random.nextInt(6);
            }
        }
        for (int[] ints : tab) {
            System.out.println(Arrays.toString(ints));
        }
        return tab;
    }

    public static List<String> checkArray(int[][] tab) throws Exception {
        List<String> errors = new ArrayList<>();
        int n = tab.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (tab[i][j] != 0) {
                    errors.add("[" + i + ", " + j + "]");
                }
            }
        }
        if (!errors.isEmpty()) {
            throw new Exception("Array does not match requirements, errors at: " + errors);
        }
        return errors;
    }
}
