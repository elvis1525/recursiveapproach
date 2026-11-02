public class FibonacciIterative {
    public static long[] generateSeries(int n) {
        if (n < 0) return new long[0];
        
        long[] series = new long[n + 1];
        if (n >= 0) series[0] = 0;
        if (n >= 1) series[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        return series;
    }

    public static void main(String[] args) {
        int n = 10;
        long[] result = generateSeries(n);
        
        System.out.println("=== Fibonacci Series (n = " + n + ") ===");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Year " + i + ": " + result[i] + " points");
        }
    }
}