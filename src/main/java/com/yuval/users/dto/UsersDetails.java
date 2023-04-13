package com.yuval.users.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
public class UsersDetails {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String profileImageUrl;
    private boolean isVerified;
    private LocalDate createdAt;
    private LocalDate updatedAt;
    private NotificationSettings notificationSettings;
    private PrivacySettings privacySettings;
    private Set<UsersDetails> friends;
}
