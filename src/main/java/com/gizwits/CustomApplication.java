package com.gizwits;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jsonp.JsonProcessingFeature;
import org.glassfish.jersey.server.ResourceConfig;

import javax.json.stream.JsonGenerator;

public class CustomApplication extends ResourceConfig {
    public CustomApplication() {
        register(JsonProcessingFeature.class);
        packages("com.gizwits.controller");
        packages("org.glassfish.jersey.server.JSONP");
        register(LoggingFilter.class);
        property(JsonGenerator.PRETTY_PRINTING, true);



    }
}