FROM eclipse-temurin:25-jre-alpine

# avoid using root user
ARG USER=norootuser
ARG HOME=/home/$USER
# add new user
RUN adduser -D $USER
USER $USER
WORKDIR $HOME

COPY --chown=$USER:$USER target/formationcicd_2026*.jar formationcicd_2026.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "formationcicd_2026.jar"]
