## SpringbootWithHazelcastCashing
- This is an example of Spring boot with Hazelcast in memory caching. For all CRUD operations, JPA has been integrated and an in meory H2 data base has been used.used with JPA.

## Steps to test the application
- Start the application which will run on Post: 8000
- Then hit the below URL through Postman,

   ***http://localhost:8000/country/detail/91***
   ![image](https://user-images.githubusercontent.com/64692097/84578155-3ca5cd80-ade0-11ea-9c3f-7718901a2eb8.png)
   
- And you can see in the first attempt, the request fetched data from database.


- Now if you hit the URL again, it will fetch from Cache and not from Database as you can see second time it didn't print the message.


- When you update the details, it will update the cache and the next time you hit the URL to fetch details, it will retrieve the details from Cache and not from DB.

