# Etapa 1: Imaginea de bază cu Maven și JDK 17
FROM maven:3.8.5-openjdk-17

# Etapa 2: Directorul de lucru în container
WORKDIR /app

# Etapa 3: Optimizare cache - descarcă dependențele doar dacă pom.xml s-a schimbat
COPY pom.xml .
RUN mvn dependency:go-offline

# Etapa 4: Copiază restul proiectului
COPY src ./src
COPY config ./config

# Etapa 5: Comanda de start - execută testele
CMD ["mvn", "test"]
