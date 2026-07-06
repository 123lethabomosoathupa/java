package com.mycompany.chapter16.snippet;

import java.nio.file.*;
import java.io.IOException;

public class ReadAFileStreams {

    public static void main(String[] args) throws IOException {
        Files.lines(Path.of("MyText.txt"))
                .forEach(line -> System.out.println(line));
    }
}
