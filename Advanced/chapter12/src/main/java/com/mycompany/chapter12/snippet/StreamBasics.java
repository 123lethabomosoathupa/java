
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class StreamBasics {

    public static void main(String[] args) {
        List<String> strings = List.of("I", "am", "a", "list", "of", "Strings");

        Stream<String> stream = strings.stream();
        Stream<String> limit = stream.limit(4);
        System.out.println("limit = " + limit); // object reference, not data — nothing ran yet

        long result = strings.stream().limit(4).count();
        System.out.println("result = " + result); // 4

        List<String> collected = strings.stream()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("result = " + collected); // [I, am, a, list]

        List<String> sortedLimited = strings.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("result = " + sortedLimited); // [I, Strings, a, am]

        List<String> ignoreCaseSorted = strings.stream()
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("result = " + ignoreCaseSorted); // [a, am, I, list]

        List<String> skippedThenLimited = strings.stream()
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .skip(2)
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("result = " + skippedThenLimited); // [I, list, of, Strings]

        System.out.println("strings = " + strings); // unchanged
    }
}
