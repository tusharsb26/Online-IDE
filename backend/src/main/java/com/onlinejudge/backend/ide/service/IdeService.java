package com.onlinejudge.backend.ide.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.onlinejudge.backend.ide.model.CodeSubmissionRequest;

/**
 * Service class for all API logic
 */
@Component
public class IdeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(IdeService.class);

    public String hello() {
        return "Hello";
    }

    public String submit(CodeSubmissionRequest request) {
        LOGGER.info("Submitting code for user: {}, programming language: {}",
                request.getUserId(),
                request.getProgrammingLanguage().getDisplayName());

        return "Success";
    }
}
