package th.ac.kmitl.soa.group2.utils.binders.option;

import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class OptionModule {

    public static Module get =
        new SimpleModule()
            .addSerializer(new OptionSerializer());

}
