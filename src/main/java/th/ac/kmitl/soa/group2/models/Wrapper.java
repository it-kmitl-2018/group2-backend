package th.ac.kmitl.soa.group2.models;

import java.util.LinkedList;

public class Wrapper<T> extends LinkedList<T> {

    private Wrapper(T value) {
        super();

        add(value);
    }

    public static <T> Wrapper<T> of(T value) {
        return new Wrapper<>(value);
    }

}
