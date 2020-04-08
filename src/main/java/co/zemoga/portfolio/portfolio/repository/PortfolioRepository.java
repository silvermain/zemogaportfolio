package co.zemoga.portfolio.portfolio.repository;

import co.zemoga.portfolio.portfolio.model.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA Repository pattern for Portfolio model
 */
public interface PortfolioRepository extends JpaRepository<Portfolio, Integer> {
}
