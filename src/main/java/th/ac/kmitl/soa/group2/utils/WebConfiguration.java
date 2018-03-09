package th.ac.kmitl.soa.group2.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;
import th.ac.kmitl.soa.group2.utils.binders.option.OptionModule;

import java.util.List;

@Configuration
@EnableWebMvc
public class WebConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        ObjectMapper jsonMapper = Jackson2ObjectMapperBuilder.json().build();
        ObjectMapper xmlMapper = Jackson2ObjectMapperBuilder.xml().build();
        converters.add(new MappingJackson2HttpMessageConverter(
            jsonMapper.registerModule(OptionModule.get)
        ));
        converters.add(new MappingJackson2XmlHttpMessageConverter(xmlMapper));
    }

}
