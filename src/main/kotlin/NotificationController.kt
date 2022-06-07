
import com.notification.constants.Channel
import com.notification.model.SMSMessage
import com.notification.service.SMSNotificationService


suspend fun main() {

    val inputChannel = getChannel()
    val inputMessage = getNotificationMessage()


    when (inputChannel) {
        Channel.SMS.value ->  handlePublishSMS(inputMessage)
        else -> println("Invalid Channel")
    }

}

private suspend fun handlePublishSMS(inputMessage: String?) {
    val inputMobileNumber = getMobileNumber()
    val smsNotification = SMSNotificationService();
     smsNotification.pubTextSMS(SMSMessage(inputMobileNumber as String,inputMessage as String))

}

private fun getNotificationMessage(): String? {
    print("Enter Notification message: ")
    val inputMessage = readLine()
    return inputMessage
}

private fun getChannel(): String? {
    print("Enter Channel: ")
    val inputChannel = readLine()
    return inputChannel
}

private fun getMobileNumber(): String? {
    print("Enter Mobile Number: ")
    val inputMobileNumber = readLine()
    return inputMobileNumber
}





