package co.zemoga.portfolio.portfolio.service;

import co.zemoga.portfolio.portfolio.model.Portfolio;
import co.zemoga.portfolio.portfolio.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PortfolioServiceImpl implements PortfolioService {

    private PortfolioRepository portfolioRepository;

    @Autowired
    public PortfolioServiceImpl(PortfolioRepository portfolioRepository) {
        this.portfolioRepository = portfolioRepository;
    }

    @Override
    public List<Portfolio> getRecords() {
        return portfolioRepository.findAll();
    }

    @Override
    public Portfolio addRecord(Portfolio p) {
        return  portfolioRepository.save(p);
    }

    @Override
    public Portfolio getFirst() {
        return portfolioRepository.getOne(0);
    }
}
