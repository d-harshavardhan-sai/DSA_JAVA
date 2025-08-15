package javaPractise;

public class ToerOfHanoiIterative {
	public static void solveHanoiIterative(int n, char from, char to, char aux) {
        int totalMoves = (int) Math.pow(2, n) - 1;
        for (int i = 1; i <= totalMoves; i++) {
            int disk = Integer.numberOfTrailingZeros(i) + 1;
            if (disk % 3 == 1) {
                System.out.println("Move disk " + disk + " from " + from + " to " + to);
            } else if (disk % 3 == 2) {
                System.out.println("Move disk " + disk + " from " + from + " to " + aux);
            } else {
                System.out.println("Move disk " + disk + " from " + aux + " to " + to);
            }
        }
    }
    public static void main(String[] args) {
        solveHanoiIterative(3, 'A', 'C', 'B'); 
    }
}
