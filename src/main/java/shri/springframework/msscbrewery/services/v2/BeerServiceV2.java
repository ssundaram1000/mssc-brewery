package shri.springframework.msscbrewery.services.v2;

import shri.springframework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

public interface BeerServiceV2 {
    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
