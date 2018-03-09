package th.ac.kmitl.soa.group2.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import th.ac.kmitl.soa.group2.utils.binders.option.OptionModule;

import java.util.List;

@Configuration
@EnableWebMvc
public class WebConfiguration extends WebMvcConfigurerAdapter {

    public static ObjectMapper xmlMapper =
        Jackson2ObjectMapperBuilder.xml()
            .build()
            .registerModule(new Jdk8Module())
            .registerModule(OptionModule.get);

    public static ObjectMapper jsonMapper =
        Jackson2ObjectMapperBuilder.json()
            .build()
            .registerModule(OptionModule.get);

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new MappingJackson2HttpMessageConverter(jsonMapper));
        converters.add(new MappingJackson2XmlHttpMessageConverter(xmlMapper));
    }

}
