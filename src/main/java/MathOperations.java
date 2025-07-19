import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MathOperations {
    public static void main(String[] args) {
        List<Integer> input1 = Arrays.asList(1, 2, 3);
        List<Integer> input2 = Arrays.asList(16, 8, 886, 8, 1);

        System.out.println(addOneAndMultiplyByTen(input1));
        System.out.println(addOneAndMultiplyByTen(input2));
        System.out.println(rightDigit(input1));  // [1, 2, 3]
        System.out.println(rightDigit(input2));
    }
    public static List<Integer> addOneAndMultiplyByTen(List<Integer> nums){
        return nums.stream()
                .map(n->(n+1)*10)
                .collect(Collectors.toList());
    }
    public static List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream()
                .map(n -> n % 10)
                .collect(Collectors.toList());
}
}
