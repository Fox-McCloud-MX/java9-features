package com.mx.java9.features.collection.api.updates;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableCollections {

    public static void main(String[] args) {
        List<String> namesList = List.of("Lokesh", "Amit", "John");

        Set<String> namesSet = Set.of("Lokesh", "Amit", "John");

        Map<String, String> namesMap = Map.ofEntries(
            Map.entry("1", "Lokesh"),
            Map.entry("2", "Amit"),
            Map.entry("3", "Brian")
        );
    }
}
