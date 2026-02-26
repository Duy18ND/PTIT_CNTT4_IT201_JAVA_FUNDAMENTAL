package SESSION13.SESSION13_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        List<Integer> khoaNoiIds = Arrays.asList(101, 102, 105);
        List<Integer> khoaNgoaiIds = Arrays.asList(102, 105, 108);

        List<Integer> commonIds = findCommonPatients(khoaNoiIds, khoaNgoaiIds);
        System.out.println("Th1: output: " + commonIds);

        List<String> khoaNoiBHYT = Arrays.asList("DN01", "DN02", "DN03");
        List<String> khoaNgoaiBHYT = Arrays.asList("DN02", "DN04");

        List<String> commonBHYT = findCommonPatients(khoaNoiBHYT, khoaNgoaiBHYT);
        System.out.println("Th2: output: " + commonBHYT);
    }

    public static <T> List<T> findCommonPatients(List<T> listA, List<T> listB) {
        List<T> resultList = new ArrayList<>();
        for (T patient : listA) {
            if (listB.contains(patient)) {
                resultList.add(patient);
            }
        }
        return resultList;
    }
}