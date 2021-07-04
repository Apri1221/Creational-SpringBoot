package com.example.creational.factory.method;

import lombok.Builder;
import lombok.Data;

@Builder
@Data // <---- ini gunanya untuk membuat otomatis getter setter
public class InstagramSocialMedia implements SocialMedia {
    private final String name = "INSTAGRAM";
    private final String link ="instagram.com";
    private final SocialMediaType type = SocialMediaType.INSTAGRAM;
}
