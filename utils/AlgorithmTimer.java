public class AlgorithmTimer {

    private static long startTime;
    private static long endTime;

    /**
     * Marks the starting time.
     */
    public static void start() {
        startTime = System.nanoTime();
    }

    /**
     * Marks the ending time and prints the duration.
     */
    public static void end() {
        endTime = System.nanoTime();
        long durationNano = endTime - startTime;
        double durationMilli = durationNano / 1_000_000.0; // Convert to milliseconds
        System.out.printf("\n--- Algorithm finished in: %.4f ms ---\n", durationMilli);
    }

    /*
     * // How to use it in your main method:
     * * public static void main(String[] args) {
     * int[] array = {5, 2, 8, 1, 9};
     * * AlgorithmTimer.start(); // Start the timer
     * * Arrays.sort(array); // Run the algorithm you want to test
     * * AlgorithmTimer.end(); // Stop the timer and print the time
     * }
     */
}