package shri.springframework.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.UUID;
import shri.springframework.msscbrewery.web.model.v2.BeerStyleEnum;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private long upc;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastUpdatedDate;
}
