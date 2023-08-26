# Spring Core 
•	Open source.
•	Lightweight.
•	Written in java.
•	Framework of frameworks.
•	Enterprise and internet support.
•	Provides pattern and structure for java.
•	It manages object instances (Application context).
•	Used to make java application loosely coupled (easy to change).
Life Cycle Method of Beans -------------- >>
•	Spring provide two important methods to every bean.
•	public void init (): for initialization code.
•	public void destroy(): for cleanup code.
•	Life Cycle
o	Bean object created with metadata of configuration XML file.
o	Set properties values.
o	Init() method called.
o	Read and use the beans.
o	Destroy() method called.
o	Bean object ended.
•	Configuration Technique
o	XML

•	    <bean class="com.beanlifecycle.springbean" name="lifecycle1" init-method="init" destroy-method="destroy">
•	        <property name="price" value="10" />
•	    </bean>

o	Spring interface
	Initializing Bean: for init() method
	Disposable Bean: for destroy() method

o	Annotation.
	@PostConstruct: for init() method
	@PreDestroy: for destroy() method.
	Note that both the @PostConstruct and @PreDestroy annotations are part of Java EE. If you are using java 9 and above, add an additional dependency in “pom.xml” to use these annotations:

•	    <dependency>
•	      <groupId>javax.annotation</groupId>
•	      <artifactId>javax.annotation-api</artifactId>
•	      <version>1.3.2</version>
•	  </dependency>

	Annotations are disabled by default, to enable annotations
o	All annotations: “<context:annotation-config>”
o	Only @PostConstruct and @PreDestroy :
“<bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor"/>”

