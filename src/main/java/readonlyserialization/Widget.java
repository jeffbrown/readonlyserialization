package readonlyserialization;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import jakarta.persistence.Entity;

@Entity
public class Widget {

    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Widget() {
    }

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
