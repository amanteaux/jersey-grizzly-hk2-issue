Jersey minimal error reproduction project
=========================================

From: https://github.com/eclipse-ee4j/jersey/tree/3.1.9/examples/helloworld

Using multiple bindFactory in `App` results in error in both endpoints.

To start the server: run the `App` class.

Curl requests to reproduce the nullpointer issue:
```
curl -X GET --location "http://localhost:8080/base/helloworld/sample-response" \
    -H "Accept: */*" \
    -H "Custom-Code: custom-code-value"
```

```
curl -X POST --location "http://localhost:8080/base/helloworld/no-answer" \
-H "Accept: */*" \
-H "Custom-Code: custom-code-value"
```
