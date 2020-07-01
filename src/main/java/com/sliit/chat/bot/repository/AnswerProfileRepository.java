package com.sliit.chat.bot.repository;

import com.sliit.chat.bot.entity.AnswerProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnswerProfileRepository extends MongoRepository<AnswerProfile, String> {
}
