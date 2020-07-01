package com.sliit.chat.bot.entity;

import com.sliit.chat.bot.enums.AnswerDataType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "questions")
public class ChatQuestion {

    @Id
    public String id;

    public String question;
    public String answer;
    public AnswerDataType answerDataType;

    public ChatQuestion() {
    }

    public ChatQuestion(String question, String answer, AnswerDataType answerDataType) {
        this.question = question;
        this.answer = answer;
        this.answerDataType = answerDataType;
    }
}
