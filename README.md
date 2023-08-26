# Spring Core 
+ 	Open source 
+ 	Lightweight.
+ 	Written in java.
+ 	Framework of frameworks.
+ 	Enterprise and internet support.
+ 	Provides pattern and structure for java.
+ 	It manages object instances (Application context).
+ 	Used to make java application loosely coupled (easy to change).
## Life Cycle Method of Beans -------------- >>
+ 	Spring provide two important methods to every bean.
+ 	public void init (): for initialization code.
+ 	public void destroy(): for cleanup code.
### •	Life Cycle
+ 	Bean object created with metadata of configuration XML file.
+ 	Set properties values.
+ 	Init() method called.
+ 	Read and use the beans.
+ 	Destroy() method called.
+ 	Bean object ended.
### Configuration Technique
#### o	XML
#### o	Spring interface
+ 	Initializing Bean: for init() method
+ 	Disposable Bean: for destroy() method 

#### o	Annotation.
 + 	@PostConstruct: for init() method
 + 	@PreDestroy: for destroy() method.
 + 	Note that both the @PostConstruct and @PreDestroy annotations are part of Java EE. If you are using java 9 and above, add an additional dependency in “pom.xml” to use these annotations.
* 	Annotations are disabled by default, to enable annotations
+  All annotations:“<context:annotation-config>”
+  	Only @PostConstruct and @PreDestroy:<bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor"/>” 

