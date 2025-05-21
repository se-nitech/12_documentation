/**
 * Compute.java
 *
 * 和と積を計算するユーティリティ関数群
 */
public class Compute {

    /**
     * aとbの和を計算する
     *
     * @param a 1つ目の引数
     * @param b 2つ目の引数
     * @return aとbの和
     */
    public static int myadd(int a, int b) {
        if (a > 0 && b > 0)
            return a + b;
        if (a < 0 && b < 0)
            return a + b;
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a > 0 && b < 0 || a < 0 && b > 0) {
            if (Math.abs(a) >= Math.abs(b))
                return a + b;
        }
        return 0;
    }

    /**
     * aとbの積を計算する
     *
     * @param a 1つ目の引数
     * @param b 2つ目の引数
     * @return aとbの積
     */
    public static int mymult(int a, int b) {
        if (a == 0 || b == 0)
            return 0;
        return a * b;
    }
}
