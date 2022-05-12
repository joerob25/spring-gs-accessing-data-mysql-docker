command used to start mysql container:
docker run --name {container-name} -e MYSQL_ROOT_PASSWORD={password} -d mysql

command used for getting docker ip:
docker inspect {container-name} | grep "IPAddress"

command used to query inside container:
docker exec -it {container-name} mysql -uroot -p<password>
