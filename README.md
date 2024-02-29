# Project Request-Scoped-Cache

Project request-scoped-cache is project that uses SpringBoot and RequestScoped Cache manager to cache the
data from any sources to the particular request processing.

For example:
EmployeeService.getEmployee is being called many times on same request processing 
but services get employee info from repo only one time and uses same data for remaining processing.
This implies 
- Same data has to be fetched from repo only once for the request processing cycle
- No request processing data is asked to cache for future requests

<b> Just similar to how hibernate first level cache works </b>


## JAVA 17
## Maven 3.8.6


# Browse API via
http://localhost:8080/swagger-ui/index.html



