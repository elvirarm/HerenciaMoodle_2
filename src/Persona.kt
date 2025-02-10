open class Persona (val nombre: String, val edad: Int, val id: String) {

    var rol = "Desconocido"

    open fun mostrarRol(){
        rol = "Persona"
        println("Rol $rol")
    }

}

