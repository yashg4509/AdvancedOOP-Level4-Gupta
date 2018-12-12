package _04_hospital;

import java.util.ArrayList;
import java.util.Stack;

public class Hospital extends Doctor {
	ArrayList<Doctor> manydoctors = new ArrayList<Doctor>();
	ArrayList<Patient> manypatients = new ArrayList<Patient>();
	Doctor d = new Doctor();

	public static void main(String[] args) {

	}

	public void addDoctor(Doctor doc) {
		manydoctors.add(doc);
	}

	public ArrayList getDoctors() {
		return manydoctors;
	}

	public void addPatient(Patient pats) {
		manypatients.add(pats);
	}

	public ArrayList getPatients() {
		return manypatients;
	}

	public void assignPatientsToDoctors() {
		int docCount = 0;
		int i;
		for (i = 0; i < manypatients.size(); i++) {
			try {
				manydoctors.get(docCount).assignPatient(manypatients.get(i));
			} catch (DoctorFullException dfe) {
				docCount++;
				i -= 1;
			}
		}
	}
}