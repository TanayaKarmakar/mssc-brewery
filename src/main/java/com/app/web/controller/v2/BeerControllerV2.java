package com.app.web.controller.v2;

import com.app.services.BeerService;
import com.app.services.v2.BeerServiceV2;
import com.app.web.model.BeerDto;
import com.app.web.model.v2.BeerDtoV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.UUID;

@Validated
@RequestMapping("/api/v2/beer")
@RestController
public class BeerControllerV2 {
    @Autowired
    private BeerServiceV2 beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDtoV2> getBeer(@NotNull @PathVariable UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDtoV2> createBeer(@RequestBody BeerDtoV2 beerDto) {
        BeerDtoV2 savedBeerDto = beerService.createBeer(beerDto);
        return new ResponseEntity<>(savedBeerDto, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<BeerDtoV2> updateBeer(@RequestBody BeerDtoV2 beerDto) {
        BeerDtoV2 updatedBeerDto = beerService.updateBeer(beerDto);
        return new ResponseEntity<>(updatedBeerDto, HttpStatus.OK);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId) {
        beerService.deleteById(beerId);
    }
}
