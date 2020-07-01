package com.sliit.chat.bot;

import com.sliit.chat.bot.entity.ChatQuestion;
import com.sliit.chat.bot.enums.AnswerDataType;
import com.sliit.chat.bot.repository.ChatQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@SpringBootApplication
public class ChatBotApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ChatBotApplication.class, args);
	}

	@Autowired
	ChatQuestionRepository chatQuestionRepository;

	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("OPTIONS");
		config.addAllowedMethod("GET");
		config.addAllowedMethod("POST");
		config.addAllowedMethod("PUT");
		config.addAllowedMethod("DELETE");
		source.registerCorsConfiguration("/**", config);
		return new CorsFilter(source);
	}

	@Override
	public void run(String... args) throws Exception {
		chatQuestionRepository.save(new ChatQuestion("What is your name", "", AnswerDataType.STRING));
		chatQuestionRepository.save(new ChatQuestion("What is your email address", "", AnswerDataType.STRING));
		chatQuestionRepository.save(new ChatQuestion("What is your phone number", "", AnswerDataType.STRING));
		chatQuestionRepository.save(new ChatQuestion("Are you currently working", "", AnswerDataType.BOOLEAN));
		chatQuestionRepository.save(new ChatQuestion("There are open positions for the following roles. Which one do you want to apply? SE, QA or BA", "", AnswerDataType.STRING));
		chatQuestionRepository.save(new ChatQuestion("Could you briefly describe your experience", "", AnswerDataType.BOOLEAN));
	}
}
