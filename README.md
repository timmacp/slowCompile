# slowCompile
## modular-webapp archetype with domino-ui-starter  

  
mvn gwt:codeserver -pl *-client -am  
  
mvn jetty:run -pl *-server -am -Denv=dev  

  ----------  
## Tests:  
on an i7 with 16 GB & Windows 11
### mvn gwt:codeserver -pl *-client -am
69s, 21s
### GET /recompile/app
72s, 44s
### single file change recompile
32s, 19s, 31s, 22s, 31s
  
  
