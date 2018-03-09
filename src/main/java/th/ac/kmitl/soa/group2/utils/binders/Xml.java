package th.ac.kmitl.soa.group2.utils.binders;

import io.vavr.CheckedFunction1;
import io.vavr.Function1;
import io.vavr.control.Option;

import static th.ac.kmitl.soa.group2.utils.WebConfiguration.xmlMapper;

public class Xml {

    private static Function1<Object, Option<String>> serialize =
        CheckedFunction1.lift(xmlMapper::writeValueAsString);

    public static Option<String> serialize(Object model) {
        return serialize.apply(model);
    }

}
