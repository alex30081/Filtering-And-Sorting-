package app;

import java.util.Arrays;
import java.util.List;

public class DataRepository {


    public List<Person> getData() {
        return Arrays.asList(
                new Person("Karen", 34, "female"),
                new Person("Patrik", 19, "male"),
                new Person("Den", 21, "male"),
                new Person("Mat", 16, "male"),
                new Person("Any", 25, "female"),
                new Person("Olga", 17, "female"),
                new Person("Alex", 43, "male")
        );
    }

}


