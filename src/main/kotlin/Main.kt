fun main(args: Array<String>) {
    val us1 = User(1, "ff", "123")
    println(us1.get_Name())
    val us2 = User(2, "gg", "321")
    println(us2.get_Name())

    val ch1 = Chat(1, us1, us2)
    println(ch1.ret_FUser())

    val mess = Message(ch1.return_Id(), us1, us2, "hahahahahaha")
    println(mess.text())

    ch1.add_Mess(mess)
    println(ch1.retCountMess())
}