package co.zemoga.portfolio.portfolio.service;

import co.zemoga.portfolio.portfolio.vo.TweetDetail;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@Service
public class TweeterServiceImpl implements TweeterService{

    public static final int TWEET_LIMIT = 5;

    @Override
    public List<Status> getStatus() {
    ConfigurationBuilder cb = new ConfigurationBuilder();
    cb.setDebugEnabled(true)
            .setOAuthConsumerKey("Onrd6WBgpwsMxYiqy7Pz7aAkR")
            .setOAuthConsumerSecret("s9KULYKHywkSBk7WSNQLyN9Vza4bysPrQlKbCxxpiNkHDU7wUX")
            .setOAuthAccessToken("1189300377310642177-EvUz6uudp0go0L77BxyIXH9KdHBL3k")
            .setOAuthAccessTokenSecret("SjJlTSnCcaxQHjS4hZsdAPLOxGamZzOnPvN7o7Fs5xngR");
    TwitterFactory tf = new TwitterFactory(cb.build());
    Twitter twitter = tf.getInstance();

    try {
        List<Status> statuses = twitter.getHomeTimeline();
        return statuses;
    } catch (
            TwitterException e) {
        e.printStackTrace();
    }
    return null;
}

    @Override
    public List<TweetDetail> getDetails() {
        List<TweetDetail> details = new ArrayList<>();
        int countTweet = 0;
        if(getStatus().size( ) > 0){
            ListIterator<Status> statusListIterator = getStatus().listIterator();
            while (statusListIterator.hasNext()){
                Status s = statusListIterator.next();
                if (countTweet < TWEET_LIMIT){
                    details.add(new TweetDetail(s.getUser().getName(), s.getUser().getDescription()));
                }
                countTweet++;
            }
        }
        return details;
    }

}
