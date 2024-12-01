package com.SpringLock.SpringLock.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VerifyUserDto {
    public String username;
    public String verificationCode;
}
