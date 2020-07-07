#! /bin/bash

flag=learn-0.0.1-SNAPSHOT.jar
echo $flag
pid=`ps -ef|grep $flag |grep jar|awk '{print $2}'`
echo "kill -9 $pid"
kill -9 $pid
git pull origin develop
mvn clean package -Dmaven.test.skip=true  
nohup  java -jar target/learn-0.0.1-SNAPSHOT.jar  --spring.profiles.active=product &>/dev/null &
echo "start $flag success!!!"