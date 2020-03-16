import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Creation : 16 Mar 2020
 */

public class TestParallelSort {
    public static void main(String[] args) {
        int numbers[] = { 22, 89, 1, 32, 19, 5 };
        /*
         * Specifying the start and end index. The start index is 1 here and the end index is 5. which means the the elements starting from index 1
         * till index 5 would be sorted.
         */
        Arrays.parallelSort(numbers, 1, 5);
        
        
        // converting the array to stream and displaying using forEach
        Arrays.stream(numbers).forEach(n -> System.out.print(n + " "));

        List<String> se = new ArrayList<>();
        se.add("rth ");
        se.add("rtrgh ");

        se.add("rergfth ");

        se.add("rtgerh ");

        se.add("rtrrh ");

        se.forEach(i -> System.out.println(i));
        se.stream().filter(i -> i.length() < 3).collect(Collectors.toList());
        se.stream().filter(i -> i.length() < 3).forEach(i -> i+ 1);
        System.out.println(se.stream().collect(Collectors.toList()));
        ;

    }
}
