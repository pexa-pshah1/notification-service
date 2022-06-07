# notification-service
Notification Service is a standalone console application. This is a spike for the notification to the end users using channels like SMS and email.


#Language used
Kotlin

#Build Tool 
Gradle

#Technology
AWS SNS

#Setup AWS account creds to authenticate the SNS request
1. Have aws profiles (aws-vault) configured as mentioned in the developer onboarding documents: 
   https://pexa.atlassian.net/wiki/spaces/International/pages/438992897/Developer+Onboarding#Configure-AWS-CLI-and-aws-vault
2. Store the temporary creds associated with any developer profile lets say "pexa-uk-product1-np-developer" and role in ~/.aws/credentials file 
   using below steps:
        1. aws-vault exec pexa-uk-product1-np-developer -- env | grep AWS
        2. Provide the access_key_id , access_secret_access_key, aws_session_token in ~/.aws/credentials
        3. Use the same profile tp create AWS SDK client like done for eg in SMSNotificationClient class.    

#Steps to run project
1. git clone <projecct url>
2. Build project: gradle build
3. Run project in plain console : gradle run -q --console=plain

#User interaction
1. Provide the channel name: SMS or Email
2. Enter notification Message
3. Enter mobile number for SMS notification and email for mail notificaiton