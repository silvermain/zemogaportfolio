package co.zemoga.portfolio.portfolio.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
    Portfolio model mapping daatabase table using annotations, including Lombok to make shorter code
 */
@Entity
@Table
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Portfolio {

    @Id
    @Column(name="idportfolio")
    int idPortfolio;

    @Column(name="description")
    String description;

    @Column(name="image_url")
    String imageUrl;

    @Column(name="twitter_user_name")
    String twitterUserName;







}
