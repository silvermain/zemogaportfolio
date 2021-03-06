package co.zemoga.portfolio.portfolio.web;

import co.zemoga.portfolio.portfolio.service.PortfolioServiceImpl;
import co.zemoga.portfolio.portfolio.service.TwitterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @Autowired
    TwitterServiceImpl tweeterService;

    @Autowired
    PortfolioServiceImpl portfolioService;


    @GetMapping("/")
    public ModelAndView getIndex(ModelAndView mav){
        mav = new ModelAndView("index");
        mav.addObject("tweets", tweeterService.getDetails());
        mav.addObject("portfolio", portfolioService.getRecords().get(0));
        return mav;
    }

}
