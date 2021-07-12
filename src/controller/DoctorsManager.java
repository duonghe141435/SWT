/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Doctor;

/**
 *
 * @Manager Doctor
 */
public class DoctorsManager {

    private ArrayList<Doctor> list;

    /**
     * controller
     */
    public DoctorsManager() {
    }

    /**
     * @param list
     * controller contain list
     */
    public DoctorsManager(ArrayList<Doctor> list) {
        this.list = list;
    }

    /**
     * menu method
     */
    public void menu() {
        System.out.println("======MANAGER DOCTORS=======");
        System.out.println("1.Create a Doctor\n"
                + "2. Edit a Doctor Information\n"
                + "3. Delete a Doctor\n"
                + "4. Search doctor by Name\n"
                + "5. Search by ID\n"
                + "6. Sort doctor by DateOfBirth\n"
                + "7. Exit\n"
                + "8. display"
        );
    }

    /**
     * display all doctor
     */
    public void display() {
        list.forEach((doctor) -> {
            System.out.println(doctor);
        });
    }

    /**
     *
     *check value of code
     * @param code
     * @return
     */
    public boolean isExist(int code) {
        for (int i = 0; i < list.size(); i++) {
            if (code == list.get(i).getID()) {
                return true;
            }
        }
        return false;
    }

    /**
     * get doc tor by id
     * @param ID
     * @return index of Doctor in list
     */
    public int getElementDoctorInList(int ID) {
        for (int i = 0; i < list.size(); i++) {
            if (ID == list.get(i).getID()) {
                return i;
            }
        }
        return 0;
    }

    /**
     *
     *get id of new doctor
     * @param list
     * @return id
     */
    public int getIDtoAdd(ArrayList<Doctor> list) {
        int lastIndex = list.size() - 1;
        int lastID = list.get(lastIndex).getID();
        int id = lastID + 1;
        return id;
    }

    /**
     * @throws java.io.IOException
     * create doctor
     * @throws java.text.ParseException
     */
    public void createDoctor() throws IOException, ParseException {
        Validate v = new Validate();
        int ID;
        if (list.isEmpty()) {
            ID = 1;
        }
        else {
            ID = getIDtoAdd((ArrayList<Doctor>) list);
        }
        String name = v.checkName("Enter Name: ");
        String date = v.checkDOB();
        String specialzation = v.checkSpecialization("Enter specialzation");
        int availability = v.getInputInt("Enter availability: ", 0, 3);
        String email = v.checkMail("Enter mail: ", "Wrong format!!");
        String mobie = v.getMobile("Enter mobile:");
        list.add(new Doctor(ID, name, date, specialzation, availability, email, mobie));

    }

    /**
     *
     * @throws java.io.IOException
     * edit doctor with information
     * @throws java.text.ParseException
     */
    public void editDoctorInformation() throws IOException, ParseException {
        Validate v = new Validate();
        int id = v.getInputInt("Enter ID to edit: ", 1, Integer.MAX_VALUE);
        if (isExist(id)) {
            int element = getElementDoctorInList(id);
            list.get(element).setName(v.checkName("Enter Name: "));
            list.get(element).setDOB(v.checkDOB());
            list.get(element).setSpecialilation(v.checkSpecialization("Enter specialzation"));
            list.get(element).setAvailability(v.getInputInt("Enter availability: ", 0, 4));
            list.get(element).setEmail(v.checkMail("Enter mail: ", "Wrong format!!"));
        } else {
            System.out.println("ID don't exist!!");
        }
    }

    /**
     *
     
     *delete doctor
     * @return delete function success or not
     */
    public boolean deleteDoctor() {
        int idDelete = 1;
        if (isExist(idDelete)) {
            int element = getElementDoctorInList(idDelete);
            list.remove(element);
            System.out.println("Delete successfully!!");
            return true;
        } else {
            System.out.println("ID Doctor don't exist");

        }
        return false;
    }

    /**
     * @throws java.io.IOException
     * search doctor by name
     */
    public void searchByName() throws IOException {
        Validate v = new Validate();
        boolean checkSearch = false;
        String name = v.checkName("Enter Name: ");
        for (int i = 0; i < list.size(); i++) {
            if (name.equalsIgnoreCase(list.get(i).getName())) {
                checkSearch = true;
                System.out.println(list.get(i).toString());
            }
        }
        if (checkSearch == false) {
            System.err.println("Don't exist Doctor with this name!!");
        }
    }

    /**
     * @throws java.io.IOException
     * search doctor by ID
     */
    public void searchByID() throws IOException {
        Validate v = new Validate();
        boolean checkSearch = false;
        int ID = v.getInputInt("enter id", 1, Integer.MAX_VALUE);
        for (int i = 0; i < list.size(); i++) {
            if (ID == (list.get(i).getID())) {
                checkSearch = true;
                System.out.println(list.get(i).toString());
            }
        }
        if (checkSearch == false) {
            System.err.println("Don't exist Doctor with this name!!");
        }
    }

    /**
     * @param list
     * sort list of doctor
     */
    public void sort(ArrayList<Doctor> list) {
        Collections.sort(list, (Doctor o1 ,Doctor o2) -> {
            SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                 try {
                    return (int) (f.parse(o1.getDOB()).compareTo(f.parse(o2.getDOB())));
                } catch (ParseException ex) {
                    Logger.getLogger(DoctorsManager.class.getName()).log(Level.SEVERE, null, ex);   
                }
            return 0;
            
        });
    display();
    }

}