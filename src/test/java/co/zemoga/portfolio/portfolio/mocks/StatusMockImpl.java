package co.zemoga.portfolio.portfolio.mocks;

import twitter4j.*;

import java.util.Date;

public class StatusMockImpl implements Status {

    private long id;

    public StatusMockImpl(long id) {
        this.id = id;
    }

    @Override
    public Date getCreatedAt() {
        return null;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public int getDisplayTextRangeStart() {
        return 0;
    }

    @Override
    public int getDisplayTextRangeEnd() {
        return 0;
    }

    @Override
    public String getSource() {
        return null;
    }

    @Override
    public boolean isTruncated() {
        return false;
    }

    @Override
    public long getInReplyToStatusId() {
        return 0;
    }

    @Override
    public long getInReplyToUserId() {
        return 0;
    }

    @Override
    public String getInReplyToScreenName() {
        return null;
    }

    @Override
    public GeoLocation getGeoLocation() {
        return null;
    }

    @Override
    public Place getPlace() {
        return null;
    }

    @Override
    public boolean isFavorited() {
        return false;
    }

    @Override
    public boolean isRetweeted() {
        return false;
    }

    @Override
    public int getFavoriteCount() {
        return 0;
    }

    @Override
    public User getUser() {
        return null;
    }

    @Override
    public boolean isRetweet() {
        return false;
    }

    @Override
    public Status getRetweetedStatus() {
        return null;
    }

    @Override
    public long[] getContributors() {
        return new long[0];
    }

    @Override
    public int getRetweetCount() {
        return 0;
    }

    @Override
    public boolean isRetweetedByMe() {
        return false;
    }

    @Override
    public long getCurrentUserRetweetId() {
        return 0;
    }

    @Override
    public boolean isPossiblySensitive() {
        return false;
    }

    @Override
    public String getLang() {
        return null;
    }

    @Override
    public Scopes getScopes() {
        return null;
    }

    @Override
    public String[] getWithheldInCountries() {
        return new String[0];
    }

    @Override
    public long getQuotedStatusId() {
        return 0;
    }

    @Override
    public Status getQuotedStatus() {
        return null;
    }

    @Override
    public URLEntity getQuotedStatusPermalink() {
        return null;
    }

    @Override
    public int compareTo(Status o) {
        return 0;
    }

    @Override
    public UserMentionEntity[] getUserMentionEntities() {
        return new UserMentionEntity[0];
    }

    @Override
    public URLEntity[] getURLEntities() {
        return new URLEntity[0];
    }

    @Override
    public HashtagEntity[] getHashtagEntities() {
        return new HashtagEntity[0];
    }

    @Override
    public MediaEntity[] getMediaEntities() {
        return new MediaEntity[0];
    }

    @Override
    public SymbolEntity[] getSymbolEntities() {
        return new SymbolEntity[0];
    }

    @Override
    public RateLimitStatus getRateLimitStatus() {
        return null;
    }

    @Override
    public int getAccessLevel() {
        return 0;
    }
}
