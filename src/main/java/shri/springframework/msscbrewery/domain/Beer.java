package shri.springframework.msscbrewery.domain;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import shri.springframework.msscbrewery.web.model.v2.BeerStyleEnum;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private long upc;

    // Timestamp data type is good for databases
    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;
}
