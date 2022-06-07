package com.notification.model

data class EmailMessage(val emailAddress: String, override val value: String): Message()