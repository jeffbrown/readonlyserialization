package readonlyserialization;
import io.micronaut.core.annotation.Creator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Widget {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Widget() {
    }

    @Creator
    public Widget(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
}
