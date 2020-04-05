package co.zemoga.portfolio.portfolio.rest;

import co.zemoga.portfolio.portfolio.service.GameOfThronesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1")
public class GameOfThronesREST {

    @Autowired
    private GameOfThronesService gameOfThronesService;

}
