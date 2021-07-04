package com.example.creational.factory.method;

import lombok.Builder;
import lombok.Data;

@Builder
@Data // <---- ini gunanya untuk membuat otomatis getter setter
public class TiktokSocialMedia implements SocialMedia {
    private final String name = "TIKTOK";
    private final String link ="tiktok.com";
    private final SocialMediaType type = SocialMediaType.TIKTOK;
}
