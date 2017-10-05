# CouchbaseExample
Example project to demonstrate usage of Couchbase

##Steps to setup and run this project in local:

1) Import as maven project in IDE of your choice
2) Run as a spring boot application
**`Note`** Assumption here is that Couchbase is running in **_localhost_** and Bucket being used is **_default_**. If other Couchbase server and Bucket is to be used, then change **_application.properties_** accordingly.
3) This application will start a web container with swagger plugin enabled which can be accessed at http://localhost:8080/swagger-ui.html
4) Use **_Item Controller_** REST endpoint to create and get **_Item_** which is a sample model used in this project


