import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SquareNumbers {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(-2, 0, 5);

        System.out.println(square(numbers1));
        System.out.println(square(numbers2));
        List<String> input1=Arrays.asList("a", "bb", "ccc");
        List<String> input2 = Arrays.asList("hello", "there");
        System.out.println(addStar(input1));
        System.out.println(addStar(input2));
        System.out.println(tripleStrings(input1));
        System.out.println(tripleStrings(input2));
        System.out.println(addY(input1));
        System.out.println(addY(input2));
    }
    public static List<Integer> square(List<Integer> nums){
        return nums.stream()
                .map(n->n*n)
                .collect(Collectors.toList());
    }
    public static List<String> addStar(List<String> strings){
        return strings.stream()
                .map(s->s+"*")
                .collect(Collectors.toList());
    }
    public static List<String> tripleStrings(List<String> strings){
        return strings.stream()
                .map(s->s+s+s)
                .collect(Collectors.toList());
    }
    public static List<String> addY(List<String> strings){
        return strings.stream()
                .map(s->"y" + s + "y")
                .collect(Collectors.toList());
    }
}
