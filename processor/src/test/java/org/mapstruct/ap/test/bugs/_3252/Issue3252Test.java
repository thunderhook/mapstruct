/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.bugs._3252;

import org.mapstruct.ap.testutil.IssueKey;
import org.mapstruct.ap.testutil.ProcessorTest;
import org.mapstruct.ap.testutil.WithClasses;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author Oliver Erhart
 */
@IssueKey("3252")
@WithClasses({
    UsedMapper.class,
    InheritConfigurationFromUsedClassMapper.class,
    Car.class,
    CarDto.class,
})
class Issue3252Test {

    @ProcessorTest
    void shouldRespectInheritConfigurationFromUsedMapper () {

        CarDto carDto = new CarDto();
        carDto.setSeatCount( 10 );

        Car target = UsedMapper.INSTANCE.carDtoToCar( carDto );

        assertThat( target.getNumberOfSeats() ).isEqualTo( 10 );
    }
}
