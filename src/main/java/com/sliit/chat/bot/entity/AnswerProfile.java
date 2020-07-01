package com.sliit.chat.bot.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collation = "answerProfiles")
public class AnswerProfile {

    @Id
    public String id;

    public List<ChatQuestion> chatQuestions;

    public AnswerProfile() {
    }

    public AnswerProfile(List<ChatQuestion> chatQuestions) {
        this.chatQuestions = chatQuestions;
    }
}
