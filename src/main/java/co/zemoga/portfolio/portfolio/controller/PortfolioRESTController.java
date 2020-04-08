package co.zemoga.portfolio.portfolio.controller;


import co.zemoga.portfolio.portfolio.model.Portfolio;
import co.zemoga.portfolio.portfolio.service.PortfolioService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class PortfolioRESTController {

    private PortfolioService portfolioService;

    @Autowired
    public PortfolioRESTController(PortfolioService portfolioService){
        this.portfolioService = portfolioService;
    }

    @ApiOperation(value = "Retrieve all portfiles from database", notes = "This endpoint retrieves all portfiles within a JSON message", produces = "JSON")
    @RequestMapping(value = "/portfolio", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Portfolio> getPortfolios(){
        return portfolioService.getRecords();
    }

}
