package co.zemoga.portfolio.portfolio.integration;


import co.zemoga.portfolio.portfolio.controller.PortfolioRESTController;
import co.zemoga.portfolio.portfolio.model.Portfolio;
import co.zemoga.portfolio.portfolio.repository.PortfolioRepository;
import co.zemoga.portfolio.portfolio.service.PortfolioServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DBTest {

    PortfolioRESTController portfolioRESTController;

    @Before
    public void setup(){

        Portfolio portfolio = new Portfolio();
        portfolio.setIdPortfolio(0);
        portfolio.setDescription("Description");
        portfolio.setImageUrl("URL");
        portfolio.setTwitterUserName("twitter");

        PortfolioRepository portfolioRepository = mock(PortfolioRepository.class);
        when(portfolioRepository.findAll()).thenReturn(Collections.singletonList(portfolio));

        portfolioRESTController = new PortfolioRESTController(new PortfolioServiceImpl(portfolioRepository));



    }

    @Test
    public void testDB(){
        Assert.assertEquals(1, portfolioRESTController.getPortfolios().size());
        Assert.assertEquals("Description", portfolioRESTController.getPortfolios().get(0).getDescription());

    }

}
