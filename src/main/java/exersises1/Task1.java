package exersises1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {


        Map<String, Integer> people = Map.of(
                "Ivan", 28,
                "Maria", 34,
                "Petar", 22,
                "Anna", 30,
                "Georgi", 22,
                "Elena", 30
        );
        Map<Integer,List<String> > result = people.entrySet().stream()
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(e->e.getKey().toUpperCase(),
                                Collectors.toList())
                ));
//        Map<Integer, List<String>> grouped = people.entrySet().stream()
//                .collect(Collectors.groupingBy(
//                        Map.Entry::getValue,
//                        Collectors.mapping(Map.Entry::getKey,
//                                Collectors.toList())));
//        System.out.println(grouped);
    }

}