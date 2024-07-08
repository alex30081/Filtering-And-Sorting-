package app;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DataHandler {

    public String handleData(List<Person> list) {

        AtomicInteger count = new AtomicInteger(1);
        StringBuilder sb = new StringBuilder();

        Stream<Person> allData = list.stream();

        Stream<Person> filteredData = allData.filter(person ->
                person.getAge() >= 25);



            Stream.Builder<String> builder = Stream.builder();


            Stream<Person> stream = filteredData;

            List<String> list1 = stream.map(String::toLowerCase)
                    .collect(Collectors.toList());

            System.out.println(list1);



        filteredData.forEach(persons ->
                sb.append(count.getAndIncrement())
                        .append(") ").append(persons)
                        .append("\n"));

        return sb.toString();
    }
}
