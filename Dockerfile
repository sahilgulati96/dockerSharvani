FROM maven as firstStep
WORKDIR /opt
COPY . . 
RUN mvn compile
RUN mvn test
RUN mvn package

FROM java
WORKDIR /opt
COPY --from=firstStep /opt/target/* /opt/




