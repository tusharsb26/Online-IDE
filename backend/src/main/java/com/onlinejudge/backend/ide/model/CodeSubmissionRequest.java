package com.onlinejudge.backend.ide.model;

import java.sql.Timestamp;
import java.time.Instant;

import com.onlinejudge.backend.ide.model.enums.ProgrammingLanguage;

/**
 * Class for representing the code submission request from client
 */
public class CodeSubmissionRequest {

    private final String codeString;
    private final String userId;

    private final ProgrammingLanguage programmingLanguage;

    private final Timestamp timestamp;

    public CodeSubmissionRequest(String codeString,
                                 String userId,
                                 ProgrammingLanguage programmingLanguage) {
        this.codeString = codeString;
        this.userId = userId;
        this.programmingLanguage = programmingLanguage;
        this.timestamp = Timestamp.from(Instant.now());
    }

    public String getCodeString() {
        return codeString;
    }

    public String getUserId() {
        return userId;
    }

    public ProgrammingLanguage getProgrammingLanguage() {
        return programmingLanguage;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
