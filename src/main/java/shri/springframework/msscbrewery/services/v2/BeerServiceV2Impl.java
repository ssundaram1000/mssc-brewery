package shri.springframework.msscbrewery.services.v2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import shri.springframework.msscbrewery.web.model.BeerDto;
import shri.springframework.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

import static shri.springframework.msscbrewery.web.model.v2.BeerStyleEnum.PILSNER;

@Slf4j
@Service
public class BeerServiceV2Impl implements BeerServiceV2 {
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle(PILSNER)
                .upc(123124)
                .build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("Deleting beer...");
    }
}
