/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * entity
 *
 */
public class Doctor {

    private int ID;
    private String name, DOB, specialilation;
    private int availability;
    private String email, mobile;

    /**
     * constructor
     *
     */

    public Doctor() {
    }

    /**
     * constructor with properties
     *
     * @param ID
     * @param name
     * @param DOB
     * @param specialilation
     * @param availability
     * @param email
     * @param mobile
     */
    public Doctor(int ID, String name, String DOB, String specialilation, int availability, String email, String mobile) {
        this.ID = ID;
        this.name = name;
        this.DOB = DOB;
        this.specialilation = specialilation;
        this.availability = availability;
        this.email = email;
        this.mobile = mobile;
    }

    /**
     * getID
     *
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * setID
     *
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * getName
     *
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * setName
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * getDOB
     *
     * @return DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * setDOB
     *
     * @param DOB
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * getSpecialilation
     *
     * @return specialilation
     */
    public String getSpecialilation() {
        return specialilation;
    }

    /**
     * setSpecialilation
     *
     * @param specialilation
     */
    public void setSpecialilation(String specialilation) {
        this.specialilation = specialilation;
    }

    /**
     * getAvailability
     *
     * @return availability
     */
    public String getAvailability() {
        switch (availability) {
            case 0: {
                return "in vacation";
            }
            case 1: {
                return "available";

            }
            case 2: {
                return "busy in emergency";
            }
            default:
                return "in diagnosing";
        }

    }

    /**
     * setAvailability
     *
     * @param availability
     */
    public void setAvailability(int availability) {
        this.availability = availability;
    }

    /**
     * getEmail
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * setEmail
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * getMobile
     *
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * setMobile
     *
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * get all properties parse to String
     *
     * @return String
     */
    @Override
    public String toString() {
        return ID + " | " + name + " | " + DOB + " | " + specialilation + " | " + getAvailability() + " | " + email + " | " + mobile;
    }

}
