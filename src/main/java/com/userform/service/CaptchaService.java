package com.userform.service;

public interface CaptchaService {
    
    void processResponse(String response);

    String getReCaptchaSite();

    String getReCaptchaSecret();
}
