package com.notification.service

import aws.sdk.kotlin.services.sns.model.PublishRequest
import com.notification.client.SMSNotificationClient
import com.notification.model.SMSMessage


class SMSNotificationService {

    private val smsNotificationClient = SMSNotificationClient();

    suspend fun pubTextSMS(smsMessage: SMSMessage) {

        val request = PublishRequest {
            message = smsMessage.value
            phoneNumber = smsMessage.mobileNumber
        }

        smsNotificationClient.send(request);
    }
}