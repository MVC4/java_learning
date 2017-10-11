import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data public class Person {
   @Setter @Getter private String name;
   @Setter @Getter private int age;
}
