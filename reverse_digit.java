import com.sun.tools.javac.util.Convert;

public class Main {

    public static void main(String[] args) {
        int result = reverse(120);
        System.out.println(result);
    }

    public static int reverse(int x) {
        int remainder = 0;
        long result = 0;
        while(x != 0)
        {
            remainder = x %10;
            x = x/10;
            result = result*10 + remainder;
        }
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE)
        {
            return  0;
        }
        else {
            return (int)result;
        }
    }
}
