FROM registry.cn-hangzhou.aliyuncs.com/jiabinli/jre

MAINTAINER lijiabin@qq.com

EXPOSE 9099

ADD yuan-core/build/libs/yuan-core.jar  yuan-core.jar

ENTRYPOINT ["java", "-jar", "yuan-core.jar"]

