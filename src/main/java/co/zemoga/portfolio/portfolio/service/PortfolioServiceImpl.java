package co.zemoga.portfolio.portfolio.service;

import co.zemoga.portfolio.portfolio.model.Portfolio;
import co.zemoga.portfolio.portfolio.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Portfolio> getById(int id) {
        if ( portfolioRepository.existsById(id)) {
            return Optional.of(portfolioRepository.getOne(id));
        }
        return Optional.empty();
    }

}
