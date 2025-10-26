package solutions;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TagContentExtractorTests {

    @Test
    public void sampleTestZero() {
        String[] expected = new String[] {
            "Nayeem loves counseling",
            "Sanjay has no watch",
            "So wait for a while",
            "None",
            "Imtiaz has a secret crush"
        };

        String input =
            """
            4
            <h1>Nayeem loves counseling</h1>
            <h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
            <Amee>safat codes like a ninja</amee>
            <SA premium>Imtiaz has a secret crush</SA premium>
            """;

        ByteArrayOutputStream bArrOs = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(bArrOs);
        System.setOut(out);

        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);

        TagContentExtractor.main(new String[0]);
        String[] actual = bArrOs.toString().split("\n");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void sampleTestOne() {
        String[] expected = new String[] {
            "some", "public", "None", "None", "None", "None", "None", "None", "dim", "dim"
        };

        String input =
            """
            10
            <h1>some</h1>
            <h1>had<h1>public</h1></h1>
            <h1>had<h1>public</h1515></h1>
            <h1><h1></h1></h1>
            <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
            >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
            <<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>
            <>hello</>
            <>hello</><h>dim</h>
            <>hello</><h>dim</h>>>>>
            """;
        ByteArrayOutputStream bArrOs = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(bArrOs);
        System.setOut(out);

        InputStream is = new ByteArrayInputStream(input.getBytes());
        System.setIn(is);

        TagContentExtractor.main(new String[0]);
        String[] actual = bArrOs.toString().split("\n");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sampleTestTwo() throws Exception {
        List<String> expected = new ArrayList<>();
        File expectedFile = new File("src/test/resources/TagContentExtractor/sampleTestTwoExpected.txt");
        try (FileInputStream fis = new FileInputStream(expectedFile)) {
            Scanner s = new Scanner(fis);
            while (s.hasNextLine()) {
                expected.add(s.nextLine());
            }
        }

        ByteArrayOutputStream bArrOs = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(bArrOs);
        System.setOut(out);

        File testSampleFile = new File("src/test/resources/TagContentExtractor/sampleTestTwo.txt");
        FileInputStream fis = new FileInputStream(testSampleFile);
        System.setIn(fis);

        TagContentExtractor.main(new String[0]);
        String[] actual = bArrOs.toString().split("\n");

        Assertions.assertArrayEquals(expected.toArray(), actual);
    }


}
