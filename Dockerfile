FROM java:7
COPY . /var/www/java
WORKDIR /var/www/java/src/ice/cream
RUN javac icecream.java	
CMD ["java","icecream"]

