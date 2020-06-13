## SpringbootWithHazelcastCashing
- This is an example of Spring boot with Hazelcast in memory caching. For all CRUD operations, JPA has been integrated and an in meory H2 data base has been used.used with JPA.

## Steps to test the application
- Start the application which will run on Post: 8000
- Then hit the below URL through Postman,

   ***http://localhost:8000/country/detail/91***
   ![image](https://user-images.githubusercontent.com/64692097/84578155-3ca5cd80-ade0-11ea-9c3f-7718901a2eb8.png)
   
- And you can see in the first attempt, the request fetched data from database.

  ![image](https://user-images.githubusercontent.com/64692097/84578236-264c4180-ade1-11ea-82f9-3e314c00a35f.png)

- Now if you hit the URL again, it will fetch from Cache and not from Database as you can see, second time it didn't print the message.

  ![image](https://user-images.githubusercontent.com/64692097/84578305-affc0f00-ade1-11ea-9e48-8d6894ef7636.png)

- When you update the details, it will update the Database as well as the cache.

  ![image](https://user-images.githubusercontent.com/64692097/84578366-1a14b400-ade2-11ea-980a-7148fb44bf02.png)
  
- Next time, when you hit the URL to fetch details, it will retrieve the updated details from Cache and not from DB as update request has already refreshed the cache with changed capital details.

  ![image](https://user-images.githubusercontent.com/64692097/84578383-5c3df580-ade2-11ea-95c0-87af157bd02a.png)






