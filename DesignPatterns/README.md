SOLID
-
S 

	Single Responsiblity Principal
O

	Open - Closed Principal (Open for extension and closed for modification) 
L

	Liskov Substituion Principal
	We should be able to substitue base class object with child class object and this should not alter 
	behaviour/ characteristics of program.

	Shape(Interface) compute() -> Rectangle
									  -> Square	
I

	Interface Segregation Principal
	Clients should not be forced to depend upon methods inside interface that they do not use.
	
D

	Dependency Inversion Principal

Creational DP
-
	**Builder**
	**Singleton**
	**Prototype**
	**Simple Factory**
	**Factory Method**
	**Abstract Factory**
	  
Structural DP
-
	**Adapter**
	**Decorator**

Behavioural DP
-
	**Iterator**
	**Observer**
	**Strategy**


Creational DP
------------------

**Builder**
	-> If the objects of the class should be immutable then we use builder DP.

**Singleton**

**Prototype** (Cloneable)
	-> We have a complex object that is costly to create. To create more instances of such class, we use an exisiting 
	instances as our prototype.

**Simple Factory**

**Factory Method**   
	-> When we want to move object creation logic from our code to another seperate class.
	-> We let subclasses decide which object to instantiate by overriding factory method. 
	-> The most defining characteristics of factory method DP is "subclasses providing the actual instance"
	-> Ex: Iterator() of Collection 
	
	Message(Interface) -> JsonMessage 
							-> TextMessage
	MessageCreator(Abstract) -> JsonMessageCreator
									-> TextMessageCreator
**Abstract Factory**
	-> It is used when two or more class work together forming a kit or set.
	-> You can think abstract factory as an object with multiple factory method.
	
	Instance(Interface) -> Ec2Instance
							 -> GoogleInstance
	Storage(Interface)  -> S3Storage
							 -> GoogleCloudStorage
	ResourceFactory(I) -> AWSResourceFactory
							-> GoogleResourceFactory
							
Structural DP
-------------------
**Adapter**
	-> We have a existing object which provides functionality required by client object, but client can not use it as its expecting an object from different interface. Adapter solves this problem.
	
	Employee (id, name, addree)
	CustomerInterface(id, fullName, Location) -> CustomerImpl
	GreetingCard 
 
**Decorator**
	-> When we want to enhance the behaviour of our existing object dynamically as and when required then we can use decorator design pattern.
	
	MessageInterface -> TextMessage
						|_> HtmlEncodedMesssage(Message msg) DECORATOR
						|_> Base64EncodedMessage(Message msg)DECORATOR
	

Behavioural DP
-------------------
**Iterator**
	-> It iterates over the elements in sequence from a aggregated object while hiding underlying data structure used.
	-> Iterators are stateful, meaning an iterator object remembers its position while iterating.
	-> It can become out of sync if the underlying collection is changed while a code is using a iterator.
	
	1) Iterator<T>
	2) Enum ThemeColor -> static class ThemeColorIterator implements Iterator<ThemeColor> 	

**Observer**
	-> Its a pub-sub modle. Its a one to many mapping between objects where one class will be observable and others will be observer.Whenever there is a state change notification will be sent to all observer object.

**Strategy**
	-> When a class has multiple algorithms for a specific tasks and class decides which to use at run time.
	
	 
