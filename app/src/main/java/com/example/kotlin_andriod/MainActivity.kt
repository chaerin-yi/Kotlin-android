package com.example.kotlin_andriod


fun main(){
    helloworld()

    println(add(4, 5));

    hi()

    checkNum(95)

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

// 3. String Template
//val name = "Chaerin"
//val lastname = "Yi"
//println("my name is ${name + lastname} I'm 19") // 출력할 내용은 ${여기에} 작성
//
//println("is this true? ${1==0}")
//println("this is 2\$") // 달러 표시를 출력하고 싶을 땐 '\$' 이렇게 사용"


//4. 조건식
fun maxBy(a:Int, b:Int) : Int{

    if(a > b) {
        return a
    } else {
        return b
    }
}
fun maxBy2(a:Int, b:Int) = if(a>b) a else b

fun checkNum(score:Int):Unit{
    when(score){ // 실행을 하도록 만드는 문장 (Statement)
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know") //함수에서 사용할 때는 없어도 됨
    }

    var b = when(score){ // 값을 만들어냄 (Expression)
        1 -> 1
        2 -> 2
        else -> 3 // 이런식으로 사용할 땐 else가 꼭 있어야함
    }

    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("so so")
        else -> println("okay") // 없어도 상관없음
    }


    forAndWhile()


    nullcheck()
}


// Expression vs Statement
// Expression은 값을 반환하는 것
// Statement 명령을 지시하는 문장
// 코틀린의 모든 함수는 Expression 이다
// java의  void는 Statement 이다



//5. Array and List
//Array -> 기본적으로 정해져있는 사이즈가 있음 메모리가 이미 할당, 처음에 크기를 지정해줌
//List -> 1.List : 수정이 불가능함  2.MutableList : 수정가능

fun array(){
    val array = arrayOf(1,2.3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"b",3.4f)
    val list2 = listOf(1,"d",11L)

    array[0] = 3
    //list[0] = 2 //에러가 뜸
    var result = list.get(0)

    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20
}


//6. For / While

fun forAndWhile(){
    val students = arrayListOf("Chaerin", "James", "Jenny", "Jennifer")

    for (name in students){
        println("${name}")
    }


    for((index, name) in students.withIndex()){ //index와 name을 함께 출력하고 싶을 때
        println("${index+1}번쨰 학생 : ${name}")
    }

    var sum : Int = 0
    for (i in 1..10 ){ //1부터 10까지 더해라
        sum += i
    }
    println(sum)

    //for (i in 1..10 step 2) => step 2 = 두칸씩 가라 즉, 1 3 5 7 9를 말함
    //for (i in 1..10 downTo 1) => downTo 1 = 10부터 차례로 10 9 8 7 6 5 4 3 2 1까지 셈
    //for (i in 1..10 1 until 100) => until 100 = 1부터 99가지 (100을 제외) / 1..100은 1부터 100까지

    var index = 0
    while(index < 10){ //index가 10보다 작을 때까지
        println("current index : ${index}")
        index ++
    }

}


//7. Nullable / NonNull
fun nullcheck(){
    //NPE : Null pointer Exception

    var name : String = "Chaerin"//Null이면 안되는 타입, 타입생략 가능
    var nullName : String? = null //?를 붙이면 Nullable타입이 됨, 타입 생략 X

    var nameInUpperCase : String = name.toUpperCase()
    var nullNameInUpperCase : String? = nullName?.toUpperCase()

    // ?:
    val lastName : String? = null // null 대신에 "Yi"를 넣으면 Chaerin Yi로 출력이 됨
    val fullName = name + " " + (lastName?: "No lastName") //lastName 있으면 출력을 하고 lastName이 없으면 No lastName을 출력해라
    println(fullName)

}

//!! => Nullable로 타입이 지정되어있지만 null이 아니다 할 때 사용
fun ignoreNulls(str : String){
    val mNotNull : String = str!! // 사용 자제
    val upper = mNotNull.toUpperCase()

    val email:String = "Chaerin@nana.com"
    email?.let{ //email이 null이 아니면 코드를 실행해라
        println("my email id ${email}")

    }
}



