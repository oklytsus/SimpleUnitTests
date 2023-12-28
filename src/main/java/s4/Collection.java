package s4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection {
    public List<String> getStringCollection() {
        List<String> collection = new ArrayList<>();
        collection.add("Alex");
        collection.add("Anna");
        collection.add("Natalya");
        return collection;
        //return Arrays.asList("Alex", "Anna", "Natalya");
    }
}
