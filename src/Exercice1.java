import java.util.Arrays;
import java.util.stream.Stream;

public class Exercice1 {

    //Use the distinct() method of Stream class to filter duplicates in Collection.

    public static void execute() {
        int[] datas = {9, 10, 3, 4, 7, 3, 4};
        Stream.of(datas).distinct().forEach(System.out::println);
    }
}
