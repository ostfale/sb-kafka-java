package de.ostfale.kafka.sbkafkajava.messages;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PracticalAdvice {
    private final String message;
    private final int identifier;

    public PracticalAdvice(@JsonProperty("message") final String message,
                           @JsonProperty("identifier") final int identifier) {
        this.message = message;
        this.identifier = identifier;
    }
}
