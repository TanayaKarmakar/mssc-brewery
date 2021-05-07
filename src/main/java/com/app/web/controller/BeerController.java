package com.app.web.controller;

import com.app.services.BeerService;
import com.app.web.model.BeerDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
    @Autowired
    private BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId) {
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDto> createBeer(@RequestBody BeerDto beerDto) {
        BeerDto savedBeerDto = beerService.createBeer(beerDto);
        return new ResponseEntity<>(savedBeerDto, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<BeerDto> updateBeer(@RequestBody BeerDto beerDto) {
        BeerDto updatedBeerDto = beerService.updateBeer(beerDto);
        return new ResponseEntity<>(updatedBeerDto, HttpStatus.OK);
    }

    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId) {
        beerService.deleteById(beerId);
    }
}
