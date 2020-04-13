package co.zemoga.portfolio.portfolio.service;

import co.zemoga.portfolio.portfolio.model.Portfolio;

import java.util.List;
import java.util.Optional;

public interface PortfolioService {

    List<Portfolio> getRecords();
    Optional<Portfolio> getById(int id);
}
