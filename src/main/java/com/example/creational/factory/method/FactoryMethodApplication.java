package com.example.creational.factory.method;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class FactoryMethodApplication {

    @Bean // <--- jangan lupa, dia akan cari bean yg social media
    @Scope("prototype") // <--- perlu dibuat agar ketika generate objek baru dari Bean, itu bukan objek yang sama
    public SocialMedia socialMedia(SocialMediaType type) {
        if (type == SocialMediaType.FACEBOOK) {
            return new FacebookSocialMedia();
        } else if (type == SocialMediaType.TIKTOK) {
            return new TiktokSocialMedia();
        } else if (type == SocialMediaType.INSTAGRAM) {
            return new InstagramSocialMedia();
        } else if (type == SocialMediaType.TWITTER) {
            return new TwitterSocialMedia();
        } else {
            throw  new IllegalArgumentException("Unsupported Social Media Type");
        }
    }
}
