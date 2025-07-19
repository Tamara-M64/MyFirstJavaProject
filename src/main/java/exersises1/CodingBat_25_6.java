package exersises1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CodingBat_25_6 {
    public static void main(String[] args) {
        Map<String, Integer> people = Map.of("Ivan", 28,
                "Maria", 34,
                "Petar", 22,
                "Anna", 30,
                "Georgi", 18
        );
        List<String> result = people.entrySet().stream().filter(entry -> entry.getValue() >= 30)
                .map(entry -> entry.getKey().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(result);
//List<String>input =List.of("ax","xbx","xxcx");
//List<String>output=removeX(input);
//        System.out.println(output);
//    }
//    public static List<String> removeX(List<String> strings){
//
//        return strings.stream()0,
//                .map(s->s.replace("x", ""))
//                .collect(Collectors.toList());
//    }
        List<Integer> numbers = List.of(1, -4, 3, 0, -2, 7);

        System.out.println(notNegative(numbers));
        List<Integer> numbers1 = List.of(9, 19, 29, 3);
        System.out.println(noEndingIn9(numbers1));
        List<Integer> numbers2 = List.of(12, 13, 19, 20);
        System.out.println(noTeen(numbers2));
    }

    public static List<Integer> notNegative(List<Integer> numbers) {
        List<Integer> notNegative = numbers.stream()
                .filter(n -> n >= 0)
                .collect(Collectors.toList());

return notNegative;
    }
    public static List<Integer>noEndingIn9(List<Integer>numbers1){
        return numbers1.stream()
                .filter(n->n % 10!=9)
                .collect(Collectors.toList());

    }
    public static List<Integer> noTeen(List<Integer>numbers2){
        return numbers2.stream()
                .filter(n->n<13||n>19)
                .collect((Collectors.toList()));

    }
}
