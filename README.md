# Java-Instance-Using-Singleton

In this code, the Auth class is a singleton class that only allows one instance to be created. The <i>getInstance()</i> method returns the existing instance if it has already been created, or creates a new instance if it hasn't.

In the <i>Userlogin class, the Auth object is retrieved using the <i>getInstance()</i> method and the username is set. In the <i>UserProfile</i> class, the same <i>Auth</i> object is retrieved and the username is retrieved from it.

### Note that this approach can make it difficult to manage the state of the Auth object, since it is a global singleton that can be accessed from anywhere in the application. It's generally better to pass objects explicitly between classes when possible to avoid creating these kinds of implicit dependencies.
