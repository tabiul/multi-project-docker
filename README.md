# Sample Multi Project Docker Example

## Requirements

* Docker
* Docker Compose
* Java 8

## Build Images and Start Docker

`./gradlew dockerCompose`

This task will build the images and start the container

## Application Dependencies

There are two applications **App1** and **App2**. **App1** depends on **App2**

## Testing

Run the command `docker ps` to determine the container id. Using that do `docker inspect <container-id>`
Extract the **Ip Address** from the value provided. A sample output is shown below

     "Networks": {
                    "multiprojectdocker_default": {
                        "IPAMConfig": null,
                        "Links": [
                            "multiprojectdocker_app2_1:app2",
                            "multiprojectdocker_app2_1:app2_1",
                            "multiprojectdocker_app2_1:multiprojectdocker_app2_1"
                        ],
                        "Aliases": [
                            "53da8403e9a8",
                            "app1"
                        ],
                        "NetworkID": "10e9dd5b79e937699066a722f9223fb9a64fd71ebed15ff8be04532760427ee1",
                        "EndpointID": "06f060d15d4bc7f5f64704b8d6a5b5c2df7d9a3006cfcdd2f0f260f404a8dee8",
                        "Gateway": "172.18.0.1",
                        "IPAddress": "172.18.0.3", // IP Address
                        "IPPrefixLen": 16,
                        "IPv6Gateway": "",
                        "GlobalIPv6Address": "",
                        "GlobalIPv6PrefixLen": 0,
                        "MacAddress": "02:42:ac:12:00:03"
                    }
                }

The port exposed for **App1** is **8080**  and **8090** for **App2**
Once you have the IP address for **App1** do the below in your favourite browser
* type `http://<IP Address>:8080/hello?name=<your name>`. You should see **Hello <your name> from app1**. 
* type `http://<IP Address>:8080/helloApp2?name=<your name>`. You should see **Hello <your name> from app1** (here App1 is sending the request to App2 and this is the response of App2)
