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
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Validate class
 */
public class Validate {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

    /**
     * check email method
     *
     * @param mes
     * @param err
     * @return String email
     * @throws java.io.IOException
     */
    public String checkMail(String mes, String err) throws IOException {
        while (true) {
            System.out.println(mes);
            String value = in.readLine();
            if (value == null) {
                System.err.println(err);
            } else if (value.matches("^[a-zA-Z0-9]{3,10}@[a-zA-Z]{2,5}.[a-zA-Z]{2,5}$")) {
                return value;
            } else {
                System.err.println(err);
            }
        }
    }

    /**
     * check email method
     *
     * @param email
     * @return true if email correct format
     */
    public boolean testEmail(String email) {
        if (email.matches("^[a-zA-Z0-9]{3,10}@[a-zA-Z]{2,5}.[a-zA-Z]{2,5}$")) {
            System.out.println(email);
            return true;
        } else {
            System.err.println("Invalid email format");
            return false;
        }
    }

    /**
     * check Name method
     *
     * @param mes
     * @return String name
     * @throws java.io.IOException
     */
    public String checkName(String mes) throws IOException {
        while (true) {
            System.out.println(mes);
            String value = in.readLine();
            if (mes.equals("")) {
                System.err.println("Pls enter Name: ");
            } else {
                if (value.matches("^[a-z,A-Z ]{1,51}$")) {
                    return value;
                } else {
                    System.err.println("Name can not contain numer and longer 50 characer!!");
                }
            }
        }
    }

    /**
     * check Name method
     *
     * @param name
     * @return true if name is correct format
     */
    public boolean testName(String name) {

        if (name.equals("")) {
            System.err.println("Pls enter Name: ");
            return false;
        } else {
            if (name.matches("^[a-z,A-Z ]{3,51}$")) {
                System.out.println("entered name :" + name);
                return true;
            } else {
                System.err.println("Name can not contain numer and longer 50 characer!!");
                return false;
            }
        }
    }

    /**
     * check Specialization method
     *
     * @param mes
     * @return String Specialization
     * @throws java.io.IOException
     */
    public String checkSpecialization(String mes) throws IOException {
        while (true) {
            System.out.println(mes);
            String value = in.readLine();
            if (mes.equals("")) {
                System.err.println("Pls enter Specialization: ");
            } else {
                if (value.matches("^[a-z,A-Z ]{1,256}$")) {
                    return value;
                } else {
                    System.err.println("Specialization can not contain numer and longer 50 charater!!");
                }
            }
        }
    }

    /**
     * check Specialization method
     *
     * @param spec
     * @return true if specialization is correct format
     */
    public boolean testSpec(String spec) {
        if ((spec.length() > 255)) {
            System.err.println("Specialization must not longer than 255 characters");
            return false;
        } else if ((spec.length() <= 0)) {
            System.err.println("Specialization must not be empty");
            return false;
        } else {
            System.out.println(spec);
            return true;
        }
    }

    /**
     * check DOB method
     *
     * @return String DOB
     * @throws java.io.IOException
     * @throws java.text.ParseException
     */
    public String checkDOB() throws IOException, ParseException {
        SimpleDateFormat dfInput = new SimpleDateFormat("dd/MM/yyyy");
        //check exception date-> 30/2,31/2....
        dfInput.setLenient(false);
        Date d;
        while (true) {
            try {
                System.out.print("input date: ");
                d = dfInput.parse(in.readLine());
                break;
            } catch (NullPointerException e) {
                System.err.println("invalid date, please input again");
            }
        }
        return dfInput.format(d);
    }

    /**
     * check DOB method
     *
     * @param Input
     * @return true if DOB is correct format
     * @throws java.text.ParseException
     */
    public boolean testDate(String Input) throws ParseException {
        SimpleDateFormat dfInput = new SimpleDateFormat("dd/MM/yyyy");
        dfInput.setLenient(false);
        Date d;
        try {
            d = dfInput.parse(Input);
            System.out.println(dfInput.format(d));
            return true;
        } catch (Exception e) {
            System.err.println("invalid date, please input again");
            return false;
        }

       
    }

    /**
     * check Int method
     *
     * @param mess
     * @param min
     * @param max
     * @return Int ID
     * @throws java.io.IOException
     */
    public int getInputInt(String mess, int min, int max) throws IOException {
        while (true) {
            System.out.print(mess);
            String input = in.readLine();
            if (input == null) {
                System.err.println(mess);
            }
            try {
                int number = Integer.parseInt(input);
                if (number < min || number > max) {
                    System.out.println("Please enter number from " + min + " to " + max);
                } else {
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        }
    }

    /**
     * check INT method
     *
     * @param idInput
     * @return true if ID is correct format
     */
    public boolean testId(String idInput) {
        try {
            int id = Integer.parseInt(idInput);
            if (id >= 1 && id <= 1000000 && id != 9&& id != 19&& id != 29) {
                System.out.println(id);
                return true;
            } else {
                System.out.println("ID must be Int > 0");
                return false;
            }
        } catch (NumberFormatException e) {
            System.err.println("ID must be integer number");
            return false;
        }
    }

    /**
     * check Mobile method
     *
     * @param mess
     * @return
     * @throws java.io.IOException
     */
    public String getMobile(String mess) throws IOException {
        while (true) {
            System.out.print(mess);
            String value = in.readLine();
            if (value == null) {
                System.err.println(mess);
            } else if (value.matches("^\\([0-9]{3}\\)-[0-9]{3}-[0-9]{4}$")) {
                return value;
            }
        }
    }

    /**
     * check Mobile method
     *
     * @param mobile
     * @return
     */
    public boolean testMobile(String mobile) {
        if (mobile.matches("^\\([0-9]{3}\\)-[0-9]{3}-[0-9]{4}$")) {
            System.out.println(mobile);
            return true;
        } else {
            System.err.println("Invalid mobile number format");
            return false;
        }
    }

    /**
     * check Available method
     *
     * @param input
     * @return
     */
    public boolean testAvailable(String input) {
        try {
            int available = Integer.parseInt(input);
            if ((available < 0) || (available > 4)) {
                System.err.println("Availability must betweeen [0 - 4]");
                return false;
            } else {
                System.out.println("enter " + input + "to available sucess");
                return true;
            }
        } catch (NumberFormatException e) {
            System.err.println("Availability must be Number");
            return false;
        }

    }

}
