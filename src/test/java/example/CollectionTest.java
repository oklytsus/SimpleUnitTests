package example;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import s4.Collection;
import static org.junit.jupiter.api.Assertions.*;

public class CollectionTest {
    private Collection collection = new Collection();
    @Test
    void testCollectionSize() {
        List<String> actualCollection = collection.getStringCollection();
        assertEquals(3, actualCollection.size(), "Collection should have size 3");
    }

    @Test
    void testCollectionsMatch() {
        List<String> expectedCollection = Arrays.asList("Alex", "Anna", "Natalya");
        List<String> actualCollection = collection.getStringCollection();

        assertEquals(expectedCollection, actualCollection, "Collections should match");
    }

    @Test
    void testCollectionContainsAnna() {
        List<String> actualCollection = collection.getStringCollection();
        assertTrue(actualCollection.contains("Anna"), "Collection should contain 'Anna'");
    }
}
