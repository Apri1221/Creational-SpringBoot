package com.example.creational.factory.method;

import lombok.Builder;
import lombok.Data;

@Builder
@Data // <---- ini gunanya untuk membuat otomatis getter setter
public class TwitterSocialMedia implements SocialMedia {
    private final String name = "TWITTER";
    private final String link ="twitter.com";
    private final SocialMediaType type = SocialMediaType.TWITTER;
}
