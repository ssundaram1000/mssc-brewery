package shri.springframework.msscbrewery.web.mappers;

import org.mapstruct.Mapper;
import shri.springframework.msscbrewery.domain.Beer;
import shri.springframework.msscbrewery.web.model.BeerDto;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto beerDto);
}
