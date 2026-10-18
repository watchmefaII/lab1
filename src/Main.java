public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Vistula");

        int sumRakhimzhanov = 0;
        for (int iRakhimzhanov = 1; iRakhimzhanov <= 5; iRakhimzhanov++) {
            sumRakhimzhanov += iRakhimzhanov;
            System.out.println("Step " + iRakhimzhanov + ": Current sum = " + sumRakhimzhanov);
        }

        System.out.println("Debugging test completed. Final sum: " + sumRakhimzhanov);
    }
}