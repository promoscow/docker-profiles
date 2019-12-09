# docker-profiles
Пример работы с разными профилями в docker-compose

Если Вы пользуетесь docker-compose, то в процессе разработки Вам, вероятно, будет необходимо, чтобы микросервисы общались между собой через localhost, в то время, как на проде они должны будут общаться по именам контейнеров. Здесь - пример того, как можно настроить профилирование проекта.

Пример docker-compose.yml:

    version: '3.7'
    
    services:
      back:
        image: xpendence/profiles:0.0.1
        environment:
          - env=prod
