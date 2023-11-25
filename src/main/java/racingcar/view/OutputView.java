package racingcar.view;

public class OutputView {
    static final String HYPHEN = "-";
    static final String EXECUTION_RESULT_MESSAGE = "실행 결과";
    static final String FINAL_WINNER_MESSAGE = "최종 우승자 : ";
    public static void executionResultInfoMessage() {
        System.out.println(EXECUTION_RESULT_MESSAGE);
    }
    public static void finalWinnerInfoMessage() {
        System.out.print(FINAL_WINNER_MESSAGE);
    }
    public static void printHyphen() {
        System.out.print(HYPHEN);
    }
}
