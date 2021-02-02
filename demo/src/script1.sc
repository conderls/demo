import $file.script2

val x = s"Hello ${script2.x}"
// println(s"loaded global x in script1: ${script2.global_x}.") // can not access script2.global_x
println(s"  $x from script1.")
