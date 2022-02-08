package Pattern.CodingBlocks;

public class Pattern1 {
    public static void main(String[] args) {
        pattern10(5);
    }

    //
//              *****
//                 *
//                *
//               *
//              *****
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == n - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //
//          * * * * *
//          * * * *
//          * * *
//          * *
//          *
    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //
//    				          *
//                            *	    *
//                            *	    *	    *
//                            *	    *	    *	    *
//                            *	    *	    *	    *	    *
    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("\t");
            }
            for (int j = 0; j < n; j++) {

                if (j < n - i) {
                    System.out.print("*\t");
                }

            }
            System.out.println();
        }
    }

    //
//          *
//      *   *   *
//    * *   *   *   *
//      *   *   *
//          *
    static void pattern5(int n) {
        int space = n / 2;
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }
            System.out.println();

        }
    }

    //
//            *	*	*		*	*	*
//            *	*				*	*
//            *						*
//            *	*				*	*
//            *	*	*		*	*	*
    static void pattern6(int n) {
        int space = n / 2 + 1;
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("*\t");
            }
            for (int k = 1; k <= star; k++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                space--;
                star += 2;
            } else {
                space++;
                star -= 2;
            }
            System.out.println();

        }
    }

    //
//    *
//     *
//      *
//       *
//        *
    static void pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    //
//                 *
//                *
//               *
//              *
//             *
    static void pattern8(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == (n - 1 - j)) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }
//
    //*				*
    //	*		*
    //		*
    //	*		*
    //*				*

    static void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == (n - 1 - j) || i == j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();

        }
    }

    static void pattern10(int n) {
        int outer = n / 2;
        int inner = -1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= outer; j++) {
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j = 1; j <= inner; j++) {
                System.out.print("\t");
            }
            if (i > 1 && i < n) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                outer--;
                inner += 2;
            } else {
                outer++;
                inner -= 2;
            }
            System.out.println();
        }
    }
}
