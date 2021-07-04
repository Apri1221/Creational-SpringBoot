package com.example.creational.factory;

import com.example.creational.factory.method.FactoryMethodApplication;
import com.example.creational.factory.method.SocialMedia;
import com.example.creational.factory.method.SocialMediaType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest(classes = FactoryMethodApplication.class)
class FactoryMethodApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testFactoryMethod() {
        SocialMedia facebook = applicationContext.getBean(SocialMedia.class, SocialMediaType.FACEBOOK);
        SocialMedia twitter = applicationContext.getBean(SocialMedia.class, SocialMediaType.TWITTER);
        SocialMedia instagram = applicationContext.getBean(SocialMedia.class, SocialMediaType.INSTAGRAM);
        SocialMedia tiktok = applicationContext.getBean(SocialMedia.class, SocialMediaType.TIKTOK);

        System.out.println(facebook);
        System.out.println(twitter);
        System.out.println(instagram);
        System.out.println(tiktok);

    }
}