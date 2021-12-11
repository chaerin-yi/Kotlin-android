package com.example.kotlin_andriod

open class Human (val name : String = "NONAME"){

    constructor(name: String, age:Int) : this(name){
        println("my name is ${name}, ${age}years old")
    }

    init {
        println("New human has been born")
    }

    fun eatingCake(){
        println("This is so YUMMMY~")
    }

    open fun singASong(){
        println("lalala")
    }
}
// class 상속 시 상속받을 클래스 앞에 open을 적어줌
class Korean : Human(){
    override  fun singASong(){
        super.singASong()
        println("라라라랄")
        println("my name is : ${name}")
    }
}



fun main(){
    //val human = Human("Minsu")
    //val stranger = Human()
    //human.eatingCake()

    //val mom = Human("YoonJeong", 47)

    val Korean = Korean()
    Korean.singASong()
    //println("This Human name is ${human.name}")
    //println("This Human name is ${stranger.name}")
}