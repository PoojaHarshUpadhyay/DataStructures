import com.sun.tools.javac.util.Convert;

public class Main {

    public static void main(String[] args) {
        int result = numJewelsInStones("dec", "daaccedebababecbbeacebbdadbceacbacdbbadeaeccbecbac");
        System.out.println(result);
    }

    public static int  numJewelsInStones(String J, String S) {
        int count = 0;
        char[] stones = S.toCharArray();
        if(J.length() <= 50 && S.length() <= 50) {
            for (int i = 0; i < stones.length; i++) {
                if (J.contains(Character.toString(stones[i]))) {
                    count++;
                }
            }
        }
        return count;
    }
}
