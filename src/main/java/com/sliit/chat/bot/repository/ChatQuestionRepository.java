package com.sliit.chat.bot.repository;

import com.sliit.chat.bot.entity.ChatQuestion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatQuestionRepository extends MongoRepository<ChatQuestion, String> {
}
