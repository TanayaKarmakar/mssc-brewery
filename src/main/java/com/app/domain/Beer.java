package com.app.domain;

import com.app.common.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

/**
 * @author t0k02w6 on 09/05/21
 * @project mssc-brewery
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
    private UUID uuid;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private long upc;

    private Timestamp createdDate;
    private Timestamp lastUpdatedDate;

}
