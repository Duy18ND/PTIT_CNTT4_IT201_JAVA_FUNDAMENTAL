package SESSION15.SESSION15_03;

public class Main {
    public static void main(String[] args) {
        MedicationProcessChecker checker = new MedicationProcessChecker();

        String[] caTruc1 = {"PUSH", "POP", "PUSH", "POP"};
        checker.checkProcess(caTruc1);

        checker.reset();

        String[] caTruc2 = {"PUSH", "POP", "POP"};
        checker.checkProcess(caTruc2);

        checker.reset();

        String[] caTruc3 = {"PUSH", "POP", "PUSH"};
        checker.checkProcess(caTruc3);
    }
}