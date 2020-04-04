package co.zemoga.portfolio.portfolio.service;

import co.zemoga.portfolio.portfolio.vo.TweetDetail;
import twitter4j.Status;

import java.util.List;

public interface TweeterService {

    List<Status> getStatus();
    List<TweetDetail> getDetails();
}
