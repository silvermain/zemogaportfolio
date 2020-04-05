package co.zemoga.portfolio.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="table_name")
public class Actor {

    @Id
    Integer id;

}
