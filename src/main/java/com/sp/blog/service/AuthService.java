package com.sp.blog.service;

import com.sp.blog.payload.LoginDto;
import com.sp.blog.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
