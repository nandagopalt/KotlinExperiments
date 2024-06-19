# Kotlin Learnings by Examples
***
**1. Suspending Function**


![Suspending function workflow](https://www.google.com/imgres?imgurl=https%3A%2F%2Fi.stack.imgur.com%2F371XX.png&imgrefurl=https%3A%2F%2Fstackoverflow.com%2Fquestions%2F47871868%2Fwhat-does-the-suspend-function-mean-in-a-kotlin-coroutine&tbnid=qgt_cm6SFtWsPM&vet=12ahUKEwjui9i6mtH0AhXil-YKHSzNBhEQMygBegUIARCpAQ..i&docid=BDt7bRhzXKw6iM&w=1620&h=850&q=Suspend%20function%20kotlin&ved=2ahUKEwjui9i6mtH0AhXil-YKHSzNBhEQMygBegUIARCpAQ)

- Suspending function is a kind of normal method that labels the specific method as execution of long running task and usually gets executed in the background thread unblocking the current thread.
> In simple, a function that could be started, paused and resumed.  
- In general, the suspending functions doesn't block the thread but it suspends the coroutines itself. 
- What happens when the coroutines gets suspended ?
    * The thread associated to the coroutines will return to the pool of threads. 
    * The current stack frame of the function is copied and saved in the memory. 
- What happens when the suspended coroutines gets resumed ?
    * As the coroutines(the function) has resumed back from the suspention point, the makes use of the free thread from pool of threads to execute its tasks
    * The current stack frame of the function is copied from the memory and starts running again. 
	
	To be continued...
