/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import model.Doctor;

/**
 *
 * Main class
 */
public class Main {

    /**
     * get BufferedReader to input 
     */

    static final BufferedReader IN = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

    /**
     * main method
     * @param args
     * @throws java.io.IOException
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws IOException, ParseException {
        Validate Validation = new Validate();
        ArrayList<Doctor> lst = new ArrayList<>();
        DoctorsManager m = new DoctorsManager(lst);
        lst.add(new Doctor(1, "d", "12/10/2000", "as", 1, "duasdas@gm.com", "(123)-123-1234"));
        lst.add(new Doctor(2, "d", "17/10/2000", "as", 1, "duasdas@gm.com", "(123)-123-1234"));
        lst.add(new Doctor(3, "d", "15/10/2000", "as", 1, "duasdas@gm.com", "(123)-123-1234"));
        lst.add(new Doctor(4, "d", "13/10/2000", "as", 1, "duasdas@gm.com", "(123)-123-1234"));
        lst.add(new Doctor(5, "d", "19/10/2000", "as", 1, "duasdas@gm.com", "(123)-123-1234"));
        lst.add(new Doctor(6, "d", "20/10/2000", "as", 1, "duasdas@gm.com", "(123)-123-1234"));
        do {
            m.menu();
            int choice = Validation.getInputInt("Enter your choice: ", 1, 8);
            switch (choice) {
                case 1:
                    m.createDoctor();
                    break;
                case 2:
                    m.editDoctorInformation();
                    break;
                case 3:
                    m.deleteDoctor();
                    break;
                case 4:
                    m.searchByName();
                    break;
                case 5:
                    m.searchByID();
                    break;
                case 6:
                    m.sort(lst);
                    break;
                case 7:
                    return;
                case 8:
                    m.display();
                    break;

                default:
                    return;

            }
        } while (true);
    }

}

