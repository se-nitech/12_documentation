/**
 * Main.java
 *
 * コマンドライン引数を受け取り，計算を実行するメインクラス
 */
public class Main {

    /**
     * メイン関数
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Usage: java Main <int> <int> <add|mult>");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String c = args[2];

        int result = mycompute(a, b, c);
        System.out.println(result);

        AddOrMult instance = new AddOrMult(Compute::myadd, Compute::mymult);
        Integer result2 = instance.doOperation(a, b, c);
        System.out.println(result2);
    }

    /**
     * aとbの和もしくは積を計算する
     *
     * @param a 1つ目の引数
     * @param b 2つ目の引数
     * @param c "add"または"mult"
     * @return a + b または a * b
     */
    public static int mycompute(int a, int b, String c) {
        if ("add".equals(c))
            return Compute.myadd(a, b);
        if ("mult".equals(c))
            return Compute.mymult(a, b);
        return 0;
    }
}
