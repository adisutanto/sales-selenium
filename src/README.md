## Running tests

First, start the [sales](https://github.com/adisutanto/sales) back-end application (assuming JDK 11 is installed):
```
git clone https://github.com/adisutanto/sales.git
cd sales
./mvnw spring-boot:run
```
And start the [sales-client]() front-end application (assuming Angular CLI is installed):
```
git clone https://github.com/adisutanto/sales-client.git
cd sales-client
ng serve
```
Next, run Selenium tests (assuming Chrome is installed):
```
./mvnw test
```
