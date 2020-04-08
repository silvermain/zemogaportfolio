package co.zemoga.portfolio.portfolio.service;

import co.zemoga.portfolio.portfolio.model.Portfolio;

import java.util.List;

public interface PortfolioService {

    public List<Portfolio> getRecords();
    public Portfolio addRecord(Portfolio p);
}
