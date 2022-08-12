package A.Flowofprogram;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class LCMHCF {
    public static void main(String[] args) {
        lachct(48, 36);
    }

    static void lachct(int a, int b) {
        int gcf = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcf = i;
            }
        }
        System.out.println(("LCM = " + (a * b / gcf)));
        System.out.println("HCF = " + gcf);
    }
}
