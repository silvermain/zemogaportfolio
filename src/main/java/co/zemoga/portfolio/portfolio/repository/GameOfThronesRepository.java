package co.zemoga.portfolio.portfolio.repository;

import co.zemoga.portfolio.portfolio.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameOfThronesRepository extends JpaRepository<Actor, Integer> {
}
