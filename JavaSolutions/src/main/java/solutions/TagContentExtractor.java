package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Solution for: https://www.hackerrank.com/challenges/tag-content-extractor/problem
 */
public class TagContentExtractor {

    private static final Pattern NUMBER_PATTERN = Pattern.compile("^\\d+$");
    private static final Pattern TAG_PATTERN = Pattern.compile("<([^<>].*)>([^<>]+?)</\\1>");

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNext()) {
            String content = input.nextLine();

            if (!NUMBER_PATTERN.matcher(content).matches()) {
                List<String> extracted = extractTagContent(content);
                extracted.forEach(System.out::println);
            }
        }
    }

    public static List<String> extractTagContent(String content) {
        List<String> extractedContent = new ArrayList<>();
        Matcher matcher = TAG_PATTERN.matcher(content);
        MatchResult[] results = matcher.results().toArray(MatchResult[]::new);

        if (results.length > 0) {
            for (MatchResult result : results) {
                extractedContent.add(result.group(2));
            }
        } else {
            extractedContent.add("None");
        }

        return extractedContent;
    }

}
