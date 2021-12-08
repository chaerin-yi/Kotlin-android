package com.example.kotlin_andriod

fun main(){
    helloworld()

    println(add(4, 5));

    hi()
}

//1. 함수
fun helloworld() : Unit{ //Unit은 return값이 없으면 안 써도 됨
    println("Hello World!")
}

fun add(a: Int, b: Int) : Int {
    return a + b
}
//2. val vs var
// val = value
fun hi(){ // 타입 생략 가능
    val a : Int = 10 // 변할 수 없음, 상수
    var b : Int = 9 // 변할 수 있음, 변수

    b = 100
    println(a)
    println(b)

    var e : String
    // var e (x)
    // var e : String (O)
    // 변수만 설정할 땐 뒤에 타입을 지정해야함

    val c = 100 //타입 생략
    var d = 100 //타입 생략

    var name : String = "Chaerin"
    println(name)
}