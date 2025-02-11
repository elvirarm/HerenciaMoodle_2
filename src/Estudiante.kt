class Estudiante(nombre: String, edad: Int, id: String, val curso: String, val calificacionPromedio: Double):Persona(nombre, edad, id) {

    override fun mostrarRol() {

        println("$nombre es estudiante")
    }

    fun mostrarCalificacion() {
        println("El promedio de $nombre es de $calificacionPromedio")
    }
}