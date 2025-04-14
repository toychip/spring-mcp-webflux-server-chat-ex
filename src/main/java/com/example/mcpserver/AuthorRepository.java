package com.example.mcpserver;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;

@Component
public class AuthorRepository {
    @Tool(description = "Get author details by article title")
    public Author getAuthorByArticleTitle(String articleTitle) {
        return new Author("John Doe", "john.doe@example.com");
    }

    public record Author(String name, String email) {}
}
