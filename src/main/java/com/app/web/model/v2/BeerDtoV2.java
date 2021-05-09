package com.app.web.model.v2;

import com.app.common.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {
    private UUID uuid;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private long upc;
}
