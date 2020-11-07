package com.elk.demo;

import com.fasterxml.jackson.databind.MappingJsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import lombok.extern.slf4j.Slf4j;
import net.logstash.logback.decorate.JsonFactoryDecorator;

public class ISO8601DateDecorator implements JsonFactoryDecorator {

    @Override
    public MappingJsonFactory decorate(MappingJsonFactory factory) {
        ObjectMapper codec = factory.getCodec();
        codec.setDateFormat(new StdDateFormat());

        return factory;
    }
}