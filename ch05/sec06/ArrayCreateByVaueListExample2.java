package e_java.ch05.sec06;

public class ArrayCreateByVaueListExample2 {
    public static void main(String[] args) {
        int[] scores;

        scores = new int[] {83, 90, 87};
        int sum = 0;
        for(int i=0; i<scores.length; i++) {
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);

        printItem(scores);
    }

    public static void printItem(int[] scores) {
        for(int i=0; i<scores.length; i++) {
            System.out.println("scores[" + i + "]: " + scores[i]);
        }
    }
}
