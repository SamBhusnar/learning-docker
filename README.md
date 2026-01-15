I dockerized the spring boot application and pused this image to docker this image available on docker hub : samadhan21/dockerdemo-app:1.0 , you can run it with docker compose up with docker-compose.yml file by making mysql 
service (warning: don't run this image using docker run , b'z this is only spring boot application it need mysql container to store data, first create mysql container , spring boot application depends on mysql . That's why i recomendaded )
to use docker-compose.yml file where you can handle multiple containers.
