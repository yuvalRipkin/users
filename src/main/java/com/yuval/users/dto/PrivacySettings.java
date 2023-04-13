package com.yuval.users.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PrivacySettings {
    private boolean hideEmail;
    private boolean hidePhoneNumber;
    private boolean hideLocation;
    private boolean hideFriendsList;
    private boolean hidePosts;
}
