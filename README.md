# micronaut-crud-demo

### How to start this application :
1. Start mysql server internally
2. Create a db named ```micronaut-crud-demo```
3. Update credentials in application.yml (datasource section)
4. Test curl
```curl
curl --location 'http://localhost:8080/student-api/v1/student' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Supriya",
    "studentId": "100CSR90"
}'
```

### Points to remember : 

1. ```lombok``` is not supported else, it may fail for multiple scenario
2. 