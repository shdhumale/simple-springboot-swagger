# simple-springboot-swagger
This example show the integration of swagger ui and OpenAPI 3.0 doc creation

java -jar swagger-codegen-cli-3.0.27.jar generate -i C:/Swagger_API/Employee.yaml -l spring  -o C:/Swagger_API/generated-sources/server/swagger

or 

java -jar swagger-codegen-cli-2.3.1.jar generate \
  -i swagger.yaml \
  --api-package com.siddhu.api \
  --model-package com.siddhu.employee.model \
  --group-id com.siddhu \
  --artifact-id spring-swagger-codegen-employee \
  --artifact-version 0.0.1-SNAPSHOT \
  -l spring \  
  -o C:/Swagger_API/generated-sources/server/swagger
