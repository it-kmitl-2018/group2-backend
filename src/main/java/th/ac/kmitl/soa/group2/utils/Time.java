package th.ac.kmitl.soa.group2.utils;

import java.sql.Timestamp;

public class Time {

    public static Timestamp now() {
        return new Timestamp(System.currentTimeMillis());
    }

}
