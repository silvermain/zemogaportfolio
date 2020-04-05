package co.zemoga.portfolio.portfolio.service;


import co.zemoga.portfolio.portfolio.mocks.ResponseListMock;
import co.zemoga.portfolio.portfolio.mocks.StatusMockImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TwitterServiceImplTest {

    private TwitterService twitterService;

    @Before
    public void setup() throws TwitterException {

        ConnectionService connectionService = mock(ConnectionService.class);
        Twitter twitter = mock(Twitter.class);
        when(connectionService.getConnection()).thenReturn(twitter);

        ResponseListMock<Status> responseListMock = new ResponseListMock<>();
        responseListMock.add(new StatusMockImpl(5L));
        responseListMock.add(new StatusMockImpl(10L));

        when(twitter.getHomeTimeline()).thenReturn(responseListMock);

        twitterService = new TwitterServiceImpl(connectionService);
    }

    @Test
    public void testStatuses() {
        Assert.assertEquals(2, twitterService.getStatus().size());
        Assert.assertEquals(5L, twitterService.getStatus().get(0).getId());
        Assert.assertEquals(10L, twitterService.getStatus().get(1).getId());
    }




}
