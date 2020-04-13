package co.zemoga.portfolio.portfolio.service;

import org.springframework.stereotype.Service;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@Service
public class ConnectionService {

    public Twitter getConnection(){
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("Onrd6WBgpwsMxYiqy7Pz7aAkR")
                .setOAuthConsumerSecret("s9KULYKHywkSBk7WSNQLyN9Vza4bysPrQlKbCxxpiNkHDU7wUX")
                .setOAuthAccessToken("1189300377310642177-EvUz6uudp0go0L77BxyIXH9KdHBL3k")
                .setOAuthAccessTokenSecret("SjJlTSnCcaxQHjS4hZsdAPLOxGamZzOnPvN7o7Fs5xngR");
        TwitterFactory tf = new TwitterFactory(cb.build());
        return tf.getInstance();
    }

}
