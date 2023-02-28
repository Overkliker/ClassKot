public class User(val _id: Int, val _name: String, val pass: String) {

    var name = ""
    var password = ""
    var id = 0

    init {
        id = _id
        name = _name
        password = pass
    }

    fun get_Name(): String {
        return name
    }
    fun get_Pass(): String {
        return password
    }
    fun get_Id(): Int {
        return id
    }

}