public class Chat(val _id: Int?, val fUser: User, val sUser: User) {
    var fUse: User
    var sUse: User
    var listMessage : MutableList<Message> = mutableListOf()

    init {
        fUse = fUser
        sUse = sUser
    }


    fun return_Id() : Int?{
        return this._id
    }
    fun ret_FUser() : User {
        return fUse
    }
    fun add_Mess(message: Message){
        listMessage.add(message)
    }
    fun retCountMess() : Int{
        return listMessage.size
    }

}