package com.onlinejudge.backend.ide.model.enums;

/**
 * Enum for representing code submission programming language
 */
public enum ProgrammingLanguage {
    CPP("C++");

    private final String displayName;

    ProgrammingLanguage(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
