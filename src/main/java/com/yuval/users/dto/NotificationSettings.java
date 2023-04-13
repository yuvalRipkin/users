package com.yuval.users.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NotificationSettings {
    private boolean enableEmailNotifications;
    private boolean enablePushNotifications;
    private boolean enableSMSNotifications;
    private boolean enableInAppNotifications;
}
