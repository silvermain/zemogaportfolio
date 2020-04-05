package co.zemoga.portfolio.portfolio.service;

import co.zemoga.portfolio.portfolio.vo.TwittDetail;
import twitter4j.Status;

import java.util.List;

public interface TwitterService {

    List<Status> getStatus();
    List<TwittDetail> getDetails();
}
