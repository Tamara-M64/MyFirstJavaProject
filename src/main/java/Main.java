
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<String> names = Arrays.asList("Ivan", "Maria", "Petar");
        System.out.println(names);
        List<String> upperNames = (List<String>) names.stream()
                .map(name->name.toUpperCase())
                //превращает елементы с большой буквы
                .filter(name->name.length()>4)
                .sorted()
                .toList();

        upperNames.forEach(name -> System.out.println("Здравей, " + name + "!"));
        List<Integer> numbers1 = Arrays.asList(1, 2, 3);
        List<Integer> numbers2 = Arrays.asList(6, 8, 6, 8, -1);
        List<Integer> numbers3 = Arrays.asList();
        System.out.println("Результат 1: " + doublin(numbers1)); // [2, 4, 6]
        System.out.println("Результат 2: " + doublin(numbers2)); // [12, 16, 12, 16, -2]
        System.out.println("Результат 3: " + doublin(numbers3));
        List<String> input1 = Arrays.asList("ax", "bb", "xcx");
        List<String> input2 = Arrays.asList("xxax", "xbxbx", "xxcx");

        System.out.println(removeX(input1));  
        System.out.println(removeX(input2));
    }
public static List<Integer>doublin(List<Integer> nums){   //nums.replaceAll(n -> n * 2);return nums;

        return nums.stream()
                .map(n->n*2)
                .collect(Collectors.toList());
}
public static List<String> removeX(List<String> strings){
        return strings.stream()
                .map(s->s.replace("x", ""))
                .collect(Collectors.toList());
}

}
