webapp-demo
===========

Overview
--------
This project is a sample Web application created for an introduction presentation about Git.

Usage
-----
You can build the project using Maven.

`mvn clean package`

You can also use the embedded Jetty to quickly run the Web application.

`mvn jetty:run`

And then, point your browser to [http://localhost:8080/hello](http://localhost:8080/hello).

Branches
--------
A feature branch is available to show how it differs from the master branch.

The *feature/root-resource* branch has an additional resource that handles the root context of the Web application.
