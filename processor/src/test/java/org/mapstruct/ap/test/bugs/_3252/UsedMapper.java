package org.mapstruct.ap.test.bugs._3252;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UsedMapper {

    UsedMapper INSTANCE = Mappers.getMapper( UsedMapper.class);

    @Mapping(target = "manufacturingDate", source = "manufacturingYear")
    @Mapping(target = "numberOfSeats", source = "seatCount")
    Car carDtoToCar(CarDto car);

}