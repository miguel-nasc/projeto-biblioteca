package com.biblioteca.livros.mapper;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import java.util.ArrayList;
import java.util.List;

public class ObjectMapper {

    private final static Mapper mapper = DozerBeanMapperBuilder.buildDefault();

    public static <X, Y> Y parseObject(X origin, Class<Y> destination) {
        return mapper.map(origin, destination);
    }
    public static <X, Y> List<Y> parseListObjects(List<X> listOrigin, Class<Y> destination) {
        List<Y> listDestination = new ArrayList<>();
        for (Object x: listOrigin){
            listDestination.add(mapper.map(x, destination));
        }
        return listDestination;
    }
}
