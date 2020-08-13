package com.sandesh;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        final List<String> names = Arrays.asList("James", "John", "Harry");
        names.stream().map(name -> name.concat(" dummy added")).forEach(System.out::println);
    }
}
