# MongoExample

## Add Record

curl --location --request POST 'http://127.0.0.1:5000/addrecord' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username": "abc019",
    "password": "pwd001",
    "role": 1,
    "active": true,
    "riskprofile": {
        "a": "1",
        "b": 20
    }
}'

## Search Record

curl --location --request GET 'http://127.0.0.1:5000/findbyuser?username=abc018' \
--data-raw ''

