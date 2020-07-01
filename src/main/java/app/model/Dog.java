package app.model;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Primary
@Component("dog")
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
