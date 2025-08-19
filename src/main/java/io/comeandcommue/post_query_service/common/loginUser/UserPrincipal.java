package io.comeandcommue.post_query_service.common.loginUser;


import io.comeandcommue.post_query_service.common.enums.DeviceType;

public record UserPrincipal(
        String id,
        String nickname,
        String ipAddr,
        DeviceType deviceType,
        String userAgent
) { }
