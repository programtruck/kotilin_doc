kotlin 

 
// var is mutable and can be initialized later



val name = "kotlin"   // val is read only variable and it is immutable

var name: String       // var is mutable and can be initialized later
name = "kotlin"

Basic types
One of the big changes in Kotlin from Java is that in Kotlin everything is an object.

val int = 123
val long = 123456L   //long value requires the suffix L 
val double = 12.34
val float = 12.34F   //  float, the suffix F.
val hexadecimal = 0xAB
val binary = 0b01010101

Kotlin does not support automatic widening of numbers, so conversion must be invoked
explicitly.
val int = 123
val long = int.toLong()
val float = 12.34F
val double = float.toDouble()


//----------------------------------
val leftShift = 1 shl 2
val rightShift = 1 shr 2
val unsignedRightShift = 1 ushr 2
val and = 1 and 0x00001111
val or = 1 or0x00001111
val xor = 1 xor0x00001111
val inv = 1.inv()    //Notice that inverse is not a binary unary operator and so is invoked using the dot syntax on a number.

// Booleans
// Booleans are rather standard, and support the usual negation, conjunction, and disjunction
// operations. Conjunction and disjunction are lazily evaluated, so if the left-hand side satisfies
// the clause, then the right-hand side will not be evaluated:
val x = 1
val y = 2
val z = 2
val isTrue = x < y && x < z
val alsoTrue = x == y || y == z






