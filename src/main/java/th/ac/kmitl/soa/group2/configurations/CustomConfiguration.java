package th.ac.kmitl.soa.group2.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import th.ac.kmitl.soa.group2.utils.binders.Json;
import th.ac.kmitl.soa.group2.utils.binders.Xml;

import java.util.List;

@Configuration
@EnableWebMvc
public class CustomConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.add(new MappingJackson2HttpMessageConverter(Json.jsonMapper));
        converters.add(new MappingJackson2XmlHttpMessageConverter(Xml.xmlMapper));
    }

}
