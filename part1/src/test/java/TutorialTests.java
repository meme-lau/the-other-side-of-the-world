import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * TutorialTests
 *
 * @author meme
 * @since 2019-06-23 22:32
 */
class TutorialTests {

    @Test
    void doComparingInOOP() {
        List<ComparingObject> comparingObjects =
                Arrays.asList(ComparingObject.of(1), ComparingObject.of(3), ComparingObject.of(2));
        comparingObjects.sort(new Comparator<ComparingObject>() {
            @Override
            public int compare(ComparingObject o1, ComparingObject o2) {
                return o1.getValue() - o2.getValue();
            }
        });
        System.out.println(comparingObjects);
    }

    @Test
    void doComparingInFP() {
        List<ComparingObject> comparingObjects =
                Stream.of(ComparingObject.of(1), ComparingObject.of(2), ComparingObject.of(3))
                      .sorted(comparing(ComparingObject::getValue))
                      .collect(toList());
        System.out.println(comparingObjects);
    }

}
