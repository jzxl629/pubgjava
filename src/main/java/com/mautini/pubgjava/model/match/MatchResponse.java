package com.mautini.pubgjava.model.match;

import com.mautini.pubgjava.model.generic.Entity;
import com.mautini.pubgjava.model.generic.response.ResponseDataHolder;

import java.util.List;

public class MatchResponse extends ResponseDataHolder<Match> {

    private List<Entity> included;

    public List<Entity> getIncluded() {
        return included;
    }

    public void setIncluded(List<Entity> included) {
        this.included = included;
    }
}
