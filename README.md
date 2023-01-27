This application is a simple springboot application.
You can run this application by importing this project from the github and once the application starts-
you can use the following curl command  :
Import this curl command onto your postman and hit the endpoint



`curl --location --request POST 'http://localhost:8080/api/rewards/points' \
--header 'Content-Type: application/json' \
--header 'Accept: application/json' \
--data-raw '[
{
"customerId": "67890",
"amount": 1220
},
{
"customerId": "67890",``
"amount": 321
}
]'`







The response would look something like this:


{
"totalRewardPoint": 2782.0
}

