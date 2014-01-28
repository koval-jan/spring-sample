package com.sample.app.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Greeting {

	@JsonProperty 
    private long id;
	@JsonProperty
    private String content;

	Greeting() {
	}
	
    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
