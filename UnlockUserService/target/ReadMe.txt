--To Execute Jar use following command
java -jar UnlockUserService.jar --spring.config.location=application.properties

--End Point
localhost:9093/corporateUser/private/unlockCorpUser

--Request
{
    "filters":[
        {
            "displayName":"Corporate Id",
            "name" : "XYZ",
            "value" : "10090",
            "type":"string"
        }
    ]
}
