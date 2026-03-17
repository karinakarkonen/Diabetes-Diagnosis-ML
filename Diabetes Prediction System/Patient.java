/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patient;

/**
 *
 * @author Karina
 */
public class Patient {

    private double pregnancies;
    private double glucose;
    private double bloodPressure;
    private double skinThickness;
    private double insulin ;
    private double bmi;
    private double pedigree;
    private double age;
    private int outcome;
    
    public Patient(double pregnancies,
            double glucose,
            double bloodPressure,
            double skinThickness, 
            double insulin,
            double bmi,
            double pedigree,
            double age, 
            int outcome){
        
        this.pregnancies = pregnancies;
        this.glucose = glucose;
        this.bloodPressure = bloodPressure;
        this.skinThickness = skinThickness;
        this.insulin = insulin;
        this.bmi = bmi;
        this.pedigree = pedigree;
        this.age = age;
        this.outcome = outcome;
        
    }
    
    public double getPregnancies(){
        return pregnancies;
    }

    public double getGlucose() {
        return glucose;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public double getSkinThickness() {
        return skinThickness;
    }

    public double getInsulin() {
        return insulin;
    }
    
    public double getBmi(){
        return bmi;
    }

    public double getPedigree() {
        return pedigree;
    }

    public double getAge() {
        return age;
    }

    public int getOutcome() {
        return outcome;
    }

}
