public class Problem2 {
    public static void main(String [] args){
        int x = 150;
        int n = 2;
        double shifted = x << n;
        String binary1 = Integer.toBinaryString(x);

        System.out.println(shifted + " in binary is: " + binary1);

        int a = 225;

        double shifted2 = a << n;
        String binary2 = Integer.toBinaryString(a);

        System.out.println(shifted2 + " in binary is: " + binary2);

        int b = 1555;

        double shifted3 = b << n;
        String binary3 = Integer.toBinaryString(b);

        System.out.println(shifted3 + " in binary is: " + binary3);

        int c = 32456;

        double shifted4 = c << n;
        String binary4 = Integer.toBinaryString(c);

        System.out.println(shifted4 + " in binary is: " + binary4);
    }
}
