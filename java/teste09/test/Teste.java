package teste09.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        System.out.println(minChanges("1001"));

    }

    public static int minChanges(String s) {
        int st1 = -1;
        int st2 = -1;
        int iteration = 0;
        for (int i = 0; i < s.length(); i++) {
            if (st1 ==  -1) {
                st1 = s.charAt(i);
            } else {
                st2 = s.charAt(i);

                if (st1 == st2) {
                    st1 = -1;
                    st2 = -1;
                } else {
                    st2 = st1;
                    iteration += 1;
                    st1 = -1;
                    st2 = -1;
                }
            }
        }
        return iteration;

    }

}