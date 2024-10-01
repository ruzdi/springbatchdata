# Spring batch example code with postgres, jpa, spring batch


For Database 

docker-compose up

For pgAdmin browse
http://localhost:8000/

Steps to Run SQL Queries Using pgAdmin:

1. Access pgAdmin Web Interface
   If you have added pgAdmin to your docker-compose.yml file as outlined earlier, you can access it by going to:
   arduino
   Copy code
   http://localhost:8080
   Log in with the credentials you set up in your docker-compose.yml. For example:
   Email: admin@admin.com
   Password: admin
2. Create a New Server in pgAdmin
   Once logged in to pgAdmin, you'll need to connect to your running PostgreSQL database.

To add a connection to your running PostgreSQL instance:

In the left panel, right-click on "Servers" and select "Create" → "Server".
In the General tab, give your server a name, e.g., postgres-db.
In the Connection tab, enter the following details:
Host: postgres-db (This is the service name you specified in Docker Compose, or use localhost if you are connecting from your host)
Port: 5432
Username: myuser
Password: mypassword
Database: mydatabase
Click Save.

3. Open the Query Tool
   After connecting to your PostgreSQL server:
   Expand the Servers list, and expand the Databases list under your postgres-db server.
   Right-click on your mydatabase (or whatever you named your database), and choose "Query Tool" from the context menu.
4. Run the SQL Script (schema-postgresql.sql)
   Once the Query Tool is open:
   You can either copy and paste the contents of schema-postgresql.sql into the Query Editor, or
   Use the "Open File" button (folder icon) to browse to your schema-postgresql.sql file and load it.
   Example path to your SQL file:
   src/main/resources/schema-postgresql.sql
5. Execute the SQL Queries
   After loading the SQL script in the Query Tool, click the "Execute" button (lightning bolt icon) to run the SQL commands.
   This will execute all the queries in your schema-postgresql.sql file and create the necessary Spring Batch tables.
6. Verify the Tables
   After the queries are executed successfully, you can expand the Schemas → public → Tables section under your mydatabase in pgAdmin to verify that the Spring Batch tables (such as BATCH_JOB_INSTANCE, BATCH_STEP_EXECUTION, etc.) have been created.


Now run the application and see person table. You should see all thedata from src/main/resources/input.csv file 