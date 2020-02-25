package algorithm;

import java.util.*;
import java.util.stream.Collectors;

public class RandomElement {

    /**
     * Returns a {@link Set <T>} containing a {@code numberOfElements}
     * unique elements from a given collection.
     *
     * @param collection - any {@link Collection <T>}
     * @param numberOfElements - how many unique elements you wish to retrieve
     * @param <T> - collection type
     * @return - {@link Set<T>} of random unique elements
     */
    public static <T> Set<T> getRandomElements(Collection<T> collection, int numberOfElements) {
        List<T> returnList = new ArrayList<>(collection);
        Collections.shuffle(returnList);
        Set<T> typeSet = new HashSet<>(returnList);

        if (numberOfElements > typeSet.size()) {
            System.out.println("You are trying to fetch way too many unique elements. " +
                    "Only the maximum amount of unique elements will be returned.");
        }

        return typeSet.stream()
                .limit(numberOfElements)
                .collect(Collectors.toSet());
    }

}
