



```
# Just run tests
mvn test

# runs test and check
mvn verify

# run test, run check, build jar, build site
mvn site

# start the container with cassandra in it
docker compose up -d


```





Validation Cassandra

```
docker-compose exec cassandra cqlsh
```

