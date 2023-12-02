<<<<<<< HEAD
## Prerequisites
- JDK 1.8 or later
- Maven 3 or later
- MySQL 5.6 or later
######
## Technologies 
=======
# Prerequisites
###
- JDK 11 
- Maven 3 
- MySQL 8

# Technologies 
>>>>>>> f95b762d12759fb580e677a155c7a068e20387ad
- Spring MVC
- Spring Security
- Spring Data JPA
- Maven
- JSP
<<<<<<< HEAD
- MySQL
## Database
Here,we used Mysql DB 
MSQL DB Installation Steps for Linux ubuntu 14.04:
- $ sudo apt-get update
- $ sudo apt-get install mysql-server

Then look for the file :
- /src/main/resources/accountsdb
- accountsdb.sql file is a mysql dump file.we have to import this dump to mysql db server
- > mysql -u <user_name> -p accounts < accountsdb.sql
=======
- Tomcat
- MySQL
- Memcached
- Rabbitmq
- ElasticSearch
# Database
Here,we used Mysql DB 
sql dump file:
- /src/main/resources/db_backup.sql
- db_backup.sql file is a mysql dump file.we have to import this dump to mysql db server
- > mysql -u <user_name> -p accounts < db_backup.sql
>>>>>>> f95b762d12759fb580e677a155c7a068e20387ad


