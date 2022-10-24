package com.example.blog

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BlogConfiguration {

    @Bean
    fun databaseInitializer(userRepository: UserRepository,
                            articleRepository: ArticleRepository) =
            ApplicationRunner {
                val juan = userRepository.save(User("juan", "peres", "juarez"))
                articleRepository.save(Article(
                        title = "Reactor Bismut is out",
                        headline = "testing text",
                        content = "dolor sit amet",
                        author = juan
                ))
                articleRepository.save(Article(
                        title = "Reactor Aluminium has loaded",
                        headline = "Lorem ipsum",
                        content = "dolor sit amet",
                        author = juan
                ))
            }
}