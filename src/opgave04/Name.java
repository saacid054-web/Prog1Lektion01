package opgave04;

public class Name {
    public static void main(String[] args) {
        String[] S = {
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };

        String[] A = {
                "   *   ",
                "  * *  ",
                " *   * ",
                " ***** ",
                "*     *",
                "*     *",
                "*     *"
        };

        String[] C = {
                " ***** ",
                "*     *",
                "*      ",
                "*      ",
                "*      ",
                "*     *",
                " ***** "
        };

        String[] I = {
                " ***** ",
                "   *   ",
                "   *   ",
                "   *   ",
                "   *   ",
                "   *   ",
                " ***** "
        };

        String[] D = {
                " ****  ",
                "*    * ",
                "*     *",
                "*     *",
                "*     *",
                "*    * ",
                " ****  "
        };

        // Print bogstaverne side om side
        for (int i = 0; i < S.length; i++) {
            System.out.println(S[i] + "   " + A[i] + "   " + A[i] + "   " + C[i] + "   " + I[i] + "   " + D[i]);
        }
    }
}
