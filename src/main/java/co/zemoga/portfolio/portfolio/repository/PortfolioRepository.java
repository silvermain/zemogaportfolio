package co.zemoga.portfolio.portfolio.repository;

import co.zemoga.portfolio.portfolio.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortfolioRepository extends JpaRepository<Portfolio, Integer> {
}
