package shri.springframework.msscbrewery.web.mappers;

import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import shri.springframework.msscbrewery.domain.Beer;
import shri.springframework.msscbrewery.web.model.BeerDto;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-28T17:01:06-0400",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 14.0.2 (AdoptOpenJDK)"
)
@Component
public class BeerMapperImpl implements BeerMapper {

    @Autowired
    private DateMapper dateMapper;

    @Override
    public BeerDto beerToBeerDto(Beer beer) {
        if ( beer == null ) {
            return null;
        }

        BeerDto.BeerDtoBuilder beerDto = BeerDto.builder();

        beerDto.id( beer.getId() );
        beerDto.beerName( beer.getBeerName() );
        beerDto.beerStyle( beer.getBeerStyle() );
        beerDto.upc( beer.getUpc() );
        beerDto.createdDate( dateMapper.asOffsetDateTime( beer.getCreatedDate() ) );
        beerDto.lastUpdatedDate( dateMapper.asOffsetDateTime( beer.getLastUpdatedDate() ) );

        return beerDto.build();
    }

    @Override
    public Beer BeerDtoToBeer(BeerDto beerDto) {
        if ( beerDto == null ) {
            return null;
        }

        Beer.BeerBuilder beer = Beer.builder();

        beer.id( beerDto.getId() );
        beer.beerName( beerDto.getBeerName() );
        beer.beerStyle( beerDto.getBeerStyle() );
        beer.upc( beerDto.getUpc() );
        beer.createdDate( dateMapper.asTimeStamp( beerDto.getCreatedDate() ) );
        beer.lastUpdatedDate( dateMapper.asTimeStamp( beerDto.getLastUpdatedDate() ) );

        return beer.build();
    }
}
