package com.notification.client

import aws.sdk.kotlin.runtime.auth.credentials.ProfileCredentialsProvider
import aws.sdk.kotlin.services.sns.SnsClient
import aws.sdk.kotlin.services.sns.model.PublishRequest
import aws.smithy.kotlin.runtime.io.use
import com.notification.constants.Constants.PROFILE

class SMSNotificationClient {

    val snsClient: SnsClient = SnsClient {
        region = "ap-south-1"
        credentialsProvider = ProfileCredentialsProvider(PROFILE)
    };

     suspend fun send(request: PublishRequest) {
        snsClient.use { snsClient ->
            val result = snsClient.publish(request)
            println("${result} message sent.")
        }
    }


}