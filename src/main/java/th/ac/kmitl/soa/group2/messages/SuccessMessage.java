package th.ac.kmitl.soa.group2.messages;

import lombok.Value;

@Value
public class SuccessMessage<T> {

    T data;

}
