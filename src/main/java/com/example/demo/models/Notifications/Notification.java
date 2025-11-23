package com.example.demo.models.Notifications;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class Notification {
    @Id
    @GeneratedValue
    @UuidGenerator
    private UUID id;

    @Column(name = "user_id", nullable = false)
    private UUID userId;

    @Column(columnDefinition = "text")
    private String message;

    @Enumerated(EnumType.STRING)
    private NotificationType type;

    @Column(name = "created_at")
    private LocalDateTime createdAt;
}
