class Profesor (nombre: String, edad: Int, id: String, val departamento: String, val aniosExperiencia: Int):Persona(nombre, edad, id) {

    override fun mostrarRol() {
        rol = "Rol: profesor"
        println(rol)
    }

    fun mostrarExperiencia(){
        println(aniosExperiencia)
    }
}