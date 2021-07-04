package com.example.creational.factory.method;

import lombok.Builder;
import lombok.Data;

@Builder
@Data // <---- ini gunanya untuk membuat otomatis getter setter
public class FacebookSocialMedia implements SocialMedia {
    private final String name = "FACEBOOK";
    private final String link ="facebook.com";
    private final SocialMediaType type = SocialMediaType.FACEBOOK;
}
