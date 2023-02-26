package homework.medicalCenter.demo;

import homework.medicalCenter.MedicalCenterInterface;
import homework.medicalCenter.Profession;
import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.model.Person;
import homework.medicalCenter.storage.PersonStorage;
import homework.medicalCenter.util.DateUtil;

import java.text.ParseException;
import java.util.Scanner;

public class MedicalCenterDemo implements MedicalCenterInterface {
    static PersonStorage personStorage = new PersonStorage();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String commands = scanner.nextLine();
            switch (commands) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorDataById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR_ID:
                    printAllPatientByDoctorId();
                    break;
                case PRINT_TODAYS_PATIENTS:
                    personStorage.printTodaysPatients();
                    break;
                default:
                    System.out.println("Wrong command!");
                    break;
            }
        }
    }

    private static void printAllPatientByDoctorId() {
        System.out.println("Please input doctor id");
        String id = scanner.nextLine();
        Doctor doctorByID = personStorage.getDoctorByID(id);
        if (doctorByID != null) {
            personStorage.printAllPatientByDoctor(doctorByID);
        }
    }

    private static void addPatient() {
        System.out.println("Please input name,surname,id,phoneNumber,doctorId,registerDateTime(e.g. 26:02:2023)");
        try {
            String data = scanner.nextLine();
            String[] split = data.split(",");
            Patient patient = new Patient();
            patient.setName(split[0]);
            patient.setSurname(split[1]);
            patient.setId(split[2]);
            patient.setPhoneNumber(split[3]);
            patient.setDoctor(personStorage.getDoctorByID(split[4]));
            patient.setRegisterDateTime(DateUtil.SDF.format(DateUtil.stringToDate(split[5])));
            if (patient.getDoctor() != null) {
                personStorage.add((Person) patient);
                System.out.println("Patient added");
            } else {
                System.out.println("There is no doctor with this id! Please try again!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You entered little data. Please try again!");
        } catch (ParseException e) {
            System.out.println("You input wrong date! Please try again!");
        }
    }

    private static void changeDoctorDataById() {
        System.out.println("Please input id");
        String id = scanner.nextLine();
        Doctor doctor = personStorage.getDoctorByID(id);
        if (doctor != null) {
            System.out.println("Please input name,surname,email,phoneNumber,profession");
            String newData = scanner.nextLine();
            try {
                String[] split = newData.split(",");
                doctor.setName(split[0]);
                doctor.setSurname(split[1]);
                doctor.setEmail(split[2]);
                doctor.setPhoneNumber(split[3]);
                doctor.setProfession(Profession.valueOf(split[4]));
                System.out.println("Data updated!");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("You entered little data. Please try again!");
            }catch (IllegalArgumentException e){
                System.out.println("You entered the wrong profession");
            }
        }
    }

    private static void deleteDoctorById() {
        System.out.println("Please input id");
        String id = scanner.nextLine();
        personStorage.deleteDoctorById(id);
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        try {
            personStorage.searchDoctorByProfession(Profession.valueOf(profession));
        } catch (IllegalArgumentException e) {
            System.out.println("You entered the wrong profession");
        }
    }

    private static void addDoctor() {
        System.out.println("Please input name,surname,id,email,phoneNumber");
        try {
            String data = scanner.nextLine();
            String[] split = data.split(",");
            Doctor doctor = new Doctor();
            doctor.setName(split[0]);
            doctor.setSurname(split[1]);
            doctor.setId(split[2]);
            doctor.setEmail(split[3]);
            doctor.setPhoneNumber(split[4]);
            System.out.println("Choose one of the professions:");
            for (Profession values : Profession.values()) {
                System.out.println(values);
            }
            doctor.setProfession(Profession.valueOf(scanner.nextLine()));
            personStorage.add((Person) doctor);
            System.out.println("Doctor added");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You entered little data. Please try again!");
        } catch (IllegalArgumentException e) {
            System.out.println("You entered the wrong profession");
        }
    }

    static void printCommands() {
        System.out.println(EXIT + " - exit");
        System.out.println(ADD_DOCTOR + " - add doctor");
        System.out.println(SEARCH_DOCTOR_BY_PROFESSION + " - search doctor by profession");
        System.out.println(DELETE_DOCTOR_BY_ID + " - delete doctor by id");
        System.out.println(CHANGE_DOCTOR_DATA_BY_ID + " - change doctor data by id");
        System.out.println(ADD_PATIENT + " - add patient");
        System.out.println(PRINT_ALL_PATIENTS_BY_DOCTOR_ID + " - print all patients by doctor");
        System.out.println(PRINT_TODAYS_PATIENTS + " - print todays patients");
    }
}
