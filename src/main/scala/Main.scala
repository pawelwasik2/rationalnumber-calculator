object Main extends App{
  implicit def intToRational(x: Int) = new Rational(x)
  //implicit conversion, more about to give it in scope in Chapter 21
  //this implicit is need to make
  //2 * r
  //working, now its not, it works in REPL idk why (prob its not in scope), more in chapter 21


  val x = new Rational(1, 2)
  val y = new Rational(2, 3)

  x + y
  x + y * x

  x * 2

}

/**Immutable objects offer several advantages over mutable objects, and one potential disadvantage. First,
immutable objects are often easier to reason about than mutable ones, because they do not have
complex state spaces that change over time. Second, you can pass immutable objects around quite
freely, whereas you may need to make defensive copies of mutable objects before passing them to other
code. Third, there is no way for two threads concurrently accessing an immutable to corrupt its state
once it has been properly constructed, because no thread can change the state of an immutable. Fourth,
immutable objects make safe hash table keys. If a mutable object is mutated after it is placed into
a HashSet, for example, that object may not be found the next time you look into the HashSet.

  //scala classes can takes parameters directly

  //we shouldnt use $ in identifier's names even if program will compile
  //name for constants values is camel-case with first letter upper like: XOffset, CCase

  //camel-case = sthNameSth

  //val even is created it's still a variable, constant is more permanent

  // use `..` for reserved scala's words
