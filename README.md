# 我的入门案例

[![Build Status](https://travis-ci.org/alibaba/druid.svg?branch=master)](https://travis-ci.org/alibaba/druid)
[![Coverage Status](https://img.shields.io/codecov/c/github/alibaba/druid/master.svg)](https://codecov.io/github/alibaba/druid?branch=master&view=all#sort=coverage&dir=asc)  
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.alibaba/druid/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.alibaba/druid/)
[![GitHub release](https://img.shields.io/github/release/alibaba/druid.svg)](https://github.com/alibaba/druid/releases)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg)](https://www.apache.org/licenses/LICENSE-2.0.html)

## 简单说明
---

- maven
- git
- jdk12

## 说明文档
---

- 中文 https://github.com/alibaba/druid/wiki/%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98
- English https://github.com/alibaba/druid/wiki/FAQ
- Druid Spring Boot Starter https://github.com/alibaba/druid/tree/master/druid-spring-boot-starter

## 参数说明
---
姓名|技能|排行
--|:--:|--:
刘备|哭|大哥
关羽|打|二哥
张飞|骂|三弟


## POM.xml
---
```xml
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>cn.webrx</groupId>
    <artifactId>mywebmm</artifactId>
    <version>1.0</version>
    <packaging>war</packaging>


    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
            <scope>test</scope>
        </dependency>
        <!-- web JSTL -->
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jstl</artifactId>
            <version>1.2</version>
        </dependency>
        <!-- web servlet4.0.1 -->
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>javax.servlet-api</artifactId>
            <version>4.0.1</version>
            <scope>provided</scope>
        </dependency>
        <!-- web jsp-api  -->
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>jsp-api</artifactId>
            <version>2.0</version>
            <scope>provided</scope>
        </dependency>

        <!-- JDBC MySQL 8.0.17 -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.17</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.json/json -->
        <dependency>
            <groupId>org.json</groupId>
            <artifactId>json</artifactId>
            <version>20180813</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/commons-fileupload/commons-fileupload -->
        <dependency>
            <groupId>commons-fileupload</groupId>
            <artifactId>commons-fileupload</artifactId>
            <version>1.4</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
        <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>2.6</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/commons-codec/commons-codec -->
        <dependency>
            <groupId>commons-codec</groupId>
            <artifactId>commons-codec</artifactId>
            <version>1.13</version>
        </dependency>

        <dependency>
            <groupId>cn.webrx</groupId>
            <artifactId>myi</artifactId>
            <version>1.0</version>
        </dependency>

        <dependency>
            <groupId>com.google.zxing</groupId>
            <artifactId>javase</artifactId>
            <version>3.4.0</version>
        </dependency>

        <dependency>
            <groupId>com.baidu</groupId>
            <artifactId>ueditor</artifactId>
            <version>1.1.3</version>
        </dependency>
    </dependencies>

    <build>
        <finalName>${project.artifactId}</finalName>
        <testSourceDirectory>src/test/java</testSourceDirectory>
        <sourceDirectory>src/main/java</sourceDirectory>
        <!-- 处理无法加载资源配置文件 -->
        <resources>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.xml</include>
                    <include>**/*.properties</include>
                </includes>
            </resource>
            <resource>
                <directory>src/main/resources</directory>
                <includes>
                    <include>**/*.xml</include>
                    <include>**/*.properties</include>
                </includes>
            </resource>
        </resources>
        <plugins>
            <!-- 配置编译插件 -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                    <encoding>UTF-8</encoding>
                </configuration>
            </plugin>
            <!-- tomcat 服务器插件 -->
            <plugin>
                <groupId>org.apache.tomcat.maven</groupId>
                <artifactId>tomcat7-maven-plugin</artifactId>
                <version>2.2</version>
                <configuration>
                    <url>http://localhost:8088/manager/text</url> <!-- tomcat管理路径 -->
                    <server>tomcat7</server> <!-- 与settings.xml文件中Server的id相同 -->
                    <uriEncoding>utf-8</uriEncoding>
                    <port>8088</port><!--服务器端口号80可以省去-->
                    <path>/</path> <!-- 应用的部署位置 -->
                    <contextReloadable>true</contextReloadable>
                </configuration>
            </plugin>

            <!-- jetty 服务器插件   -->
            <plugin>
                <groupId>org.eclipse.jetty</groupId>
                <artifactId>jetty-maven-plugin</artifactId>
                <version>9.4.19.v20190610</version>
                <configuration>
                    <httpConnector>
                        <!-- port。jetty服务器的端口号。 -->
                        <port>8080</port>
                        <!-- host。jetty服务器监听的地址。 -->
                        <host>localhost</host>
                    </httpConnector>
                    <stopKey>exit</stopKey>
                    <stopPort>8989</stopPort>
                    <reload>manual</reload>

                    <webAppConfig>
                        <!-- <contextPath>/${project.artifactId}</contextPath>-->
                        <contextPath>/</contextPath>
                    </webAppConfig>
                    <!-- scanIntervalSeconds。扫描进行热部署的间隔时间。-->
                    <scanIntervalSeconds>1</scanIntervalSeconds>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>

```
## java code
---
```java
package cn;

import cn.webrx.MyQrTools;

/**
 * <p>功能描述: </p>
 *
 * @author webrx
 * @version 1.0
 * @date 2019-07-31 17:04
 */
public class User {
    public static void main(String[] args) throws Exception {
        String i = "c:/g66.jpg";
        MyQrTools mt = new MyQrTools();
        if(mt.exists(i)){
            System.out.println("有二维码");
        }else{
            System.out.println("没有二维码");
        }
    }
}

```