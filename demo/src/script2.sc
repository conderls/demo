import $exec.global

val x = "World!"
println(s" $x from script2.")
println(s" ${global_x} from global in script2.") // directly access var `global_x`