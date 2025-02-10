//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val persona1 = Persona("Elvira", 26, "77176762D")

   persona1.mostrarRol()

    val estudiante1 = Estudiante("Jesús", 26, "31228599G", "DAM1", 9.5)

    estudiante1.mostrarRol()

    estudiante1.mostrarCalificacion()

    val profesor1 = Profesor("Diegool", 26, "31228599G", "DAM1", 10)

    profesor1.mostrarRol()
    profesor1.mostrarExperiencia()
}