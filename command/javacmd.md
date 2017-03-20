# 通过Java命令运行Spring Boot Application

1 运行config-client

	java -Dspring.profiles.active=service1 -jar config-client-1.0-SNAPSHOT.jar com.glodon.eidea.config.client.ConfigClientApplication

运行日志

2017-03-20 16:34:29.816  INFO 78400 --- [main] s.c.a.AnnotationConfig
ApplicationContext : Refreshing org.springframework.context.annotation.Annotatio
nConfigApplicationContext@4c98385c: startup date [Mon Mar 20 16:34:29 CST 2017];
 root of context hierarchy
2017-03-20 16:34:30.928  INFO 78400 --- [main] trationDelegate$BeanPo
stProcessorChecker : Bean 'configurationPropertiesRebinderAutoConfiguration' of
type [class org.springframework.cloud.autoconfigure.ConfigurationPropertiesRebin
derAutoConfiguration$$EnhancerBySpringCGLIB$$29087db4] is not eligible for getti
ng processed by all BeanPostProcessors (for example: not eligible for auto-proxy
ing)
...
 :: Spring Boot ::        (v1.5.1.RELEASE)
2017-03-20 16:34:32.372  INFO 78400 --- [           main] c.c.c.ConfigServicePro
pertySourceLocator : Fetching config from server at: http://localhost:8888
2017-03-20 16:34:35.294  INFO 78400 --- [           main] c.c.c.ConfigServicePro
pertySourceLocator : Located environment: name=helloword, profiles=[test], label
=master, version=1835106aa0b7d6806b6cc736fa23d11e013513b1, state=null
2017-03-20 16:34:35.304  INFO 78400 --- [           main] b.c.PropertySourceBoot
strapConfiguration : Located property source: CompositePropertySource [name='con
figService', propertySources=[MapPropertySource [name='configClient'], MapProper
tySource [name='https://github.com/eiDear/config-repo/application-test.propertie
s'], MapPropertySource [name='https://github.com/eiDear/config-repo/application.
properties']]]
2017-03-20 16:34:35.317  INFO 78400 --- [           main] c.g.e.c.client.ConfigC
lientApplication   : The following profiles are active: service1
2017-03-20 16:34:35.363  INFO 78400 --- [           main] ationConfigEmbeddedWeb
ApplicationContext : Refreshing org.springframework.boot.context.embedded.Annota
tionConfigEmbeddedWebApplicationContext@4b1c1ea0: startup date [Mon Mar 20 16:34
:35 CST 2017]; parent: org.springframework.context.annotation.AnnotationConfigAp
plicationContext@4c98385c

    在运行的命令中可以不指定spring.profiles.active，则使用默认的profile。

2
