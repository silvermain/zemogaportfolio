package co.zemoga.portfolio.portfolio.service;

import co.zemoga.portfolio.portfolio.vo.TwittDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Service
public class TwitterServiceImpl implements TwitterService {

    public static final int TWEET_LIMIT = 5;

    private ConnectionService connectionService;

    @Autowired
    public TwitterServiceImpl(ConnectionService connectionService){
        this.connectionService = connectionService;
    }

    @Override
    public List<Status> getStatus() {

        Twitter twitter = connectionService.getConnection();

        try {
            List<Status> statuses = twitter.getHomeTimeline();
            return statuses;
        } catch (
                TwitterException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    @Override
    public List<TwittDetail> getDetails() {
        List<TwittDetail> details = new ArrayList<>();
        int countTweet = 0;
        if (getStatus().size() > 0) {
            ListIterator<Status> statusListIterator = getStatus().listIterator();
            while (statusListIterator.hasNext()) {
                Status s = statusListIterator.next();
                if (countTweet < TWEET_LIMIT) {
                    details.add(new TwittDetail(s.getUser().getName(), s.getUser().getDescription()));
                }
                countTweet++;
            }
        }
        return details;
    }

}
