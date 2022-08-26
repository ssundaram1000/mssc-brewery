package shri.springframework.msscbrewery.services;

import shri.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(BeerDto beerDto);

    void deleteById(UUID beerId);
}
