There are six types of scopes: singleton, prototype, request, session, application, and websocket.


The singleton and prototype scopes can be used in any application while the last four scopes are only available for a web application. In this lesson, we will focus on singleton and prototype bean scopes only.


## Singleton Scope

The default scope of a bean is singleton, in which only one instance of the bean is created and cached in memory. Multiple requests for the bean return a shared reference to the same bean. In contrast, prototype scope results in the creation of new beans whenever a request for the bean is made to the application context.


Singleton bean scope is the default scope. It is used to minimize the number of objects created. Beans are created when the context is loaded and cached in memory. All requests for a bean are returned with the same memory address. This type of scope is best suited for cases where stateless beans are required. On the contrary, prototype bean scope is used when we need to maintain the state of the beans.


## Prototype scope

Now we will change the scope of the CollaborativeFilter bean from singleton to prototype. For this, we will use the @Scope annotation and import org.springframework.context.annotation.Scope. We can specify the scope in the two ways shown below. Option 2 is the preferred approach.

``` java
//Option 1
@Scope("Prototype")

/*Option 2*/ @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

```


## Spring vs. Gang of Four singleton#
It is important to note that there is a difference between the Spring singleton and the Gang of Four (GoF) singleton design patterns. The singleton design pattern as specified by the GoF means one bean per JVM. However, in Spring it means one bean per application context. By the GoF definition, even if there were more than one application contexts running on the same JVM, there would still be only one instance of the singleton class.
