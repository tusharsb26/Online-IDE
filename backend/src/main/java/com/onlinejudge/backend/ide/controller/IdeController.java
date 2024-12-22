package com.onlinejudge.backend.ide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinejudge.backend.ide.model.CodeSubmissionRequest;
import com.onlinejudge.backend.ide.service.IdeService;

import static com.onlinejudge.backend.common.RequestMappings.IDE_API_PATH;

/**
 * Controller class for all IDE related APIs
 */
@RestController
@RequestMapping(IDE_API_PATH)
public class IdeController {

    @Autowired
    private IdeService ideService;

    @GetMapping("/hello")
    public String hello() {
        return ideService.hello();
    }

    @PostMapping("/submit")
    public String submit(@RequestBody CodeSubmissionRequest codeSubmissionRequest) {
        return ideService.submit(codeSubmissionRequest);
    }
}
