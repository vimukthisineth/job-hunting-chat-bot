package com.sliit.chat.bot.controller;

import com.sliit.chat.bot.entity.AnswerProfile;
import com.sliit.chat.bot.entity.ChatQuestion;
import com.sliit.chat.bot.repository.AnswerProfileRepository;
import com.sliit.chat.bot.repository.ChatQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChatBotController {

    @Autowired
    ChatQuestionRepository chatQuestionRepository;

    @Autowired
    AnswerProfileRepository answerProfileRepository;

    @GetMapping("/getAllQuestions")
    public List<ChatQuestion> getAllQuestions(){
        return chatQuestionRepository.findAll();
    }

    @PostMapping("/newAnswerProfile")
    public AnswerProfile newAnswerProfile(@RequestBody AnswerProfile answerProfile){
        return answerProfileRepository.save(answerProfile);
    }

}
