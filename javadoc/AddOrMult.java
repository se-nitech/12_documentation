/**
 * AddOrMult.java
 *
 */
interface BinaryOperation {
    int apply(int a, int b);
}

/**
 * AddOrMult
 *
 * myaddもしくはmymultを計算するクラス
 */
public class AddOrMult {
    private BinaryOperation add;
    private BinaryOperation mult;

    /**
     * コンストラクタ
     *
     * @param add_func  加算関数
     * @param mult_func 乗算関数
     */
    public AddOrMult(BinaryOperation add_func, BinaryOperation mult_func) {
        this.add = add_func;
        this.mult = mult_func;
    }

    /**
     * aとbの和もしくは積を計算する
     *
     * @param a 1つ目の引数
     * @param b 2つ目の引数
     * @param c "add"もしくは"mult"
     * @return a+b または a*b
     */
    public Integer doOperation(int a, int b, String c) {
        if ("add".equals(c))
            return add.apply(a, b);
        if ("mult".equals(c))
            return mult.apply(a, b);
        return null;
    }
}
