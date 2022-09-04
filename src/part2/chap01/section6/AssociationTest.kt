package part2.chap01.section6

class Patient(val name:String) { // 인자로 참조
    fun doctorList(d: Doctor) {
        println("doctor :$name, Doctor :${d.name}")
    }
}

class Doctor(val name:String) { // 인자로 참조
    fun patientList(p: Patient) {
        println("doctor : $name , Patient :${p.name}")
    }
}

fun main() {
    val doc = Doctor("KimSabu") // 객체가 따로 생성
    val patient = Patient("Kildong")
    doc.patientList(patient)
    patient.doctorList(doc)
}
