import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * ComparingObject
 *
 * @author meme
 * @since 2019-06-23 22:40
 */
@Getter
@Setter
@ToString
@AllArgsConstructor(staticName = "of")
public class ComparingObject {
    private int value;
}
