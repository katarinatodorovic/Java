public class MinOf2MinOf3Numbers {
    public static void main(String[] args) {


        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);


      System.out.println(minOfTwo(a,b));
      System.out.println(minOfThree(a,b,c));

    }

    public static int minOfTwo(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }

    }

    public static int minOfThree(int a, int b, int c) {
        return minOfTwo(minOfTwo(a, b), c);
    }
}
