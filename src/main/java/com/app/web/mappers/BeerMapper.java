package com.app.web.mappers;

import com.app.domain.Beer;
import com.app.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * @author t0k02w6 on 09/05/21
 * @project mssc-brewery
 */
@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto beerDto);
}
