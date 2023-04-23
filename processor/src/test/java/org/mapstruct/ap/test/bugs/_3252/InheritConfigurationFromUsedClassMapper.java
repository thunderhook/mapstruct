package org.mapstruct.ap.test.bugs._3252;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(uses = UsedMapper.class)
public interface InheritConfigurationFromUsedClassMapper {

    @InheritConfiguration
    void carDtoIntoCar(CarDto carDto, @MappingTarget Car car);

}