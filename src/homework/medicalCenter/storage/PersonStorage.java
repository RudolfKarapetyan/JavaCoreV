package homework.medicalCenter.storage;

import homework.medicalCenter.Profession;
import homework.medicalCenter.model.Doctor;
import homework.medicalCenter.model.Patient;
import homework.medicalCenter.model.Person;
import homework.medicalCenter.util.DateUtil;

import java.util.Date;

public class PersonStorage {
    private Person[] persons = new Person[10];
    private int size;

    public PersonStorage() {
        size = 0;
    }

    public void add(Person person) {
        if (size == persons.length) {
            extend();
        }
        persons[size++] = person;
    }

    public void extend() {
        Person[] tmp = new Person[persons.length + 10];
        System.arraycopy(persons, 0, tmp, 0, persons.length);
        persons = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(persons[i]);
        }
    }

    public Doctor getDoctorByID(String id) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor && ((Doctor) persons[i]).getId().toLowerCase().equals(id.toLowerCase())) {
                return (Doctor) persons[i];
            }
        }
        return null;
    }

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor) {
                System.out.println(persons[i]);
            }
        }
    }

    public void printPatients() {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient) {
                System.out.println(persons[i]);
            }
        }
    }

    public void searchDoctorByProfession(Profession profession) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor && ((Doctor) persons[i]).getProfession() == profession) {
                System.out.println(persons[i]);
            }
        }
    }

    public void deleteDoctorById(String id) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor && ((Doctor) persons[i]).getId().toLowerCase().equals(id.toLowerCase())) {
                for (int j = i; j < size; j++) {
                    persons[j] = persons[j + 1];
                }
                System.out.println("Doctor deleted!");
            }
        }
    }

    public void changeDoctorDataById(String id, String name, String surname, String email, String profession) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Doctor && ((Doctor) persons[i]).getId().toLowerCase().equals(id.toLowerCase())) {
                ((Doctor) persons[i]).setName(name);
                ((Doctor) persons[i]).setSurname(surname);
                ((Doctor) persons[i]).setEmail(email);
                ((Doctor) persons[i]).setProfession(Profession.valueOf(profession));
            }
        }
    }

    public void printAllPatientByDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient && ((Patient) persons[i]).getDoctor().equals(doctor)) {
                System.out.println(persons[i]);
            }
        }
    }

    public void printTodaysPatients() {
        Date date = new Date();
        for (int i = 0; i < size; i++) {
            if (persons[i] instanceof Patient && ((Patient) persons[i]).getRegisterDateTime().equals(DateUtil.SDF.format(date))) {
                System.out.println(persons[i]);
            }
        }
    }
}
