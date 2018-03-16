package th.ac.kmitl.soa.group2.utils;

import io.vavr.Function1;
import io.vavr.Tuple;
import io.vavr.collection.List;
import io.vavr.collection.Map;
import io.vavr.collection.Traversable;

public class EnumMapper {

    public static <T extends Enum<T>, U> Map<U, T> getMapper(Class<T> targetEnum, Function1<T, U> resolver) {
        return mapBy(resolver, getValues(targetEnum));
    }

    public static <T extends Enum<T>> List<T> getValues(Class<T> targetEnum) {
        return List.of(targetEnum.getEnumConstants());
    }

    public static <T, U> Map<U, T> mapBy(Function1<T, U> resolver, Traversable<T> tarversable) {
        return tarversable.toMap($ -> Tuple.of(resolver.apply($), $));
    }

}
