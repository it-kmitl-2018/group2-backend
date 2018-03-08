package th.ac.kmitl.soa.group2.controllers.responses;

public class Success<T> {

    public final T data;

    public Success(T data) {
        this.data = data;
    }

}
