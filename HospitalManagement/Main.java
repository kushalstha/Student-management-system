public class Main {

    public static void main(String[] args) {

        Patient patient = new Patient();
        patient.personID = 1;
        patient.name = "Kushal";
        patient.age = 20;
        patient.gender = "Male";
        patient.address = "Kathmandu";
        patient.contactDetails = "9869300005";

        Doctor doctor = new Doctor();
        doctor.personID = 2;
        doctor.name = "Dr.Babu Rao";
        doctor.age = 40;
        doctor.gender = "Male";
        doctor.address = "Lalitpur";
        doctor.contactDetails = "9874578961";

        Appointment appointment = patient.bookAppointment(doctor, "2026-01-05", "10:30 AM");
        appointment.viewAppointmentDetails();

        Treatment treatment = doctor.prescribeTreatment("Medication", "Paracetamol 500mg");
        treatment.viewTreatmentDetails();
    }
}
