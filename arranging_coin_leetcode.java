public static void main(String[] args) {
    int n = 3;
    int res = arrangeCoins(n);

    System.out.println(res);

  }

  private static int arrangeCoins(int n) {

    return (int) ((Math.sqrt(1 + 8.0 * n) - 1) / 2);
  }
