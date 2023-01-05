package e_java.ch05.verify;

import java.util.Scanner;

public class StudentScoresProgram {
    public static void main(String[] args) {
        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        int max = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("-----------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("-----------------------------------------------");
            System.out.print("선택> ");

            int selectNum = scanner.nextInt();

            if (selectNum == 1) {
                System.out.print("학생수> ");
                studentNum = scanner.nextInt();
                scores = new int[studentNum];
            } else if (selectNum == 2) {
                for (int i = 0; i < studentNum; i++) {
                    System.out.print("scores[" + i + "]> ");
                    int studentScores = scanner.nextInt();
                    scores[i] = studentScores;
                }
            } else if (selectNum == 3) {
                for (int i = 0; i < studentNum; i++) {
                    System.out.println("scores[" + i + "]: " + scores[i]);
                }
            } else if (selectNum == 4) {
                for (int i = 0; i < studentNum; i++) {
                    if (max < scores[i]) {
                        max = scores[i];
                    }
                }
                for (int i = 0; i < studentNum; i++) {
                    sum += scores[i];
                }
                double avg = (double) sum / studentNum;
                System.out.println("최고 점수: " + max);
                System.out.println("평균 점수: " + avg);
            } else if (selectNum == 5) {
                System.out.println("프로그램 종료");
                run = false;
            }
        }
    }
}
