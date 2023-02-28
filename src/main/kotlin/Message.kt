public class Message(val chatId: Int?, val fUser: User, val sUser: User, val _text: String) {
    var id: Int? = 0;
    var fUse: User
    var sUse: User
    var text: String = ""

    init {
        id = chatId
        fUse = fUser
        sUse = sUser
        text = _text
    }

    fun return_Chat() : Int?{
        return id
    }
    fun text() : String{
        return text
    }
    fun Sec() : Int{
        return 1234567890
    }
}