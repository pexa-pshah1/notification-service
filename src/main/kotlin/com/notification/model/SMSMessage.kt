package com.notification.model

data class SMSMessage(val mobileNumber: String, override val value: String): Message()