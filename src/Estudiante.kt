class Estudiante(nombre: String, edad: Int, id: String, val curso: String, val calificacionPromedio: Double):Persona(nombre, edad, id) {

    override fun mostrarRol() {
        rol = "Estudiante"
        println("Rol: $rol")
    }

    fun mostrarCalificacion() {
        println(calificacionPromedio)
    }
}