package com.squeed.improvements.optionallist;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalList {

    public List<String> optionalList() {
        List<Person> persons = List.of(Person.from("Alpha"), Person.from(null), Person.from("Beta"), Person.from("Charlie"), Person.from(null));
        List<Optional<String>> optionalNames = persons.stream().map(p -> Optional.ofNullable(p.getName())).collect(Collectors.toList());

        optionalNames.stream().flatMap(Optional::stream).forEach(System.out::println);
        optionalNames.forEach(o -> o.ifPresentOrElse(System.out::println, () -> System.out.println("Non existing")));

        return optionalNames.stream().map(o -> o.or(() -> Optional.of("default"))).map(Optional::get).collect(Collectors.toList());

    }

}


