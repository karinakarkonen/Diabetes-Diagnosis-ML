/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Karina
 */
public class DiabetesPredictionSystem {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        ArrayList<Patient> trainingData = new ArrayList<>();
        
        //Diabetic Patients
        trainingData.add(new Patient(1, 189, 60, 23, 846, 30.1, 0.398, 59, 1)); 
        trainingData.add(new Patient(2, 197, 70, 45, 543, 30.5, 0.158, 53, 1)); 
        trainingData.add(new Patient(1, 147, 76, 41, 155, 33.7, 0.484, 22, 1)); 
        trainingData.add(new Patient(3, 158, 76, 36, 245, 31.6, 0.851, 28, 1)); 
        trainingData.add(new Patient(7, 196, 90, 29, 250, 39.8, 0.451, 41, 1)); 
        trainingData.add(new Patient(3, 162, 52, 38, 110, 37.2, 0.652, 24, 1)); 
        trainingData.add(new Patient(1, 144, 82, 46, 180, 46.1, 0.335, 46, 1));
        trainingData.add(new Patient(13, 129, 82, 30, 120, 39.9, 0.569, 44, 1));
        trainingData.add(new Patient(3, 173, 84, 33, 474, 35.7, 0.258, 22, 1)); 
        trainingData.add(new Patient(8, 154, 78, 32, 126, 32.4, 0.443, 45, 1));  
        
        //Healthy Patients
        trainingData.add(new Patient(1, 85, 66, 29, 94, 26.6, 0.351, 31, 0)); 
        trainingData.add(new Patient(1, 89, 66, 23, 94, 28.1, 0.167, 21, 0)); 
        trainingData.add(new Patient(5, 116, 74, 20, 105, 25.6, 0.201, 30, 0)); 
        trainingData.add(new Patient(3, 78, 50, 32, 88, 31.0, 0.248, 26, 0)); 
        trainingData.add(new Patient(2, 108, 62, 32, 56, 25.2, 0.128, 21, 0));
        trainingData.add(new Patient(1, 103, 30, 38, 83, 43.3, 0.183, 33, 0));
        trainingData.add(new Patient(1, 97, 66, 15, 140, 23.2, 0.487, 22, 0));
        trainingData.add(new Patient(1, 114, 66, 36, 200, 38.1, 0.289, 21, 0));
        trainingData.add(new Patient(5, 109, 75, 26, 110, 36.0, 0.546, 60, 0)); 
        trainingData.add(new Patient(2, 99, 60, 17, 160, 36.6, 0.453, 21, 0)); 
        
        System.out.println("Welcome to the Diabetes Prediction System ");
        System.out.println("Please enter the patient's data below: ");
        
        System.out.print("Glucose Level: ");
        double glu = input.nextDouble();
        while(glu <= 0){
            System.out.println("Glucose level cannot be zero.\nPlease provide valid medical data for a correct diagnosis.\n");
            System.out.print("Glucose Level: ");
            glu = input.nextDouble();
        }
        
        System.out.print("Boddy Mass Index (BMI): ");
        double bmi = input.nextDouble();
        while(bmi <= 0){
            System.out.println("BMI cannot be zero.\nPlease provide valid medical data for a correct diagnosis.\n");
            System.out.print("Boddy Mass Index (BMI): ");
            bmi = input.nextDouble();
        }
        
        System.out.print("Age: ");
        double age = input.nextDouble();
        while(age <= 0){
            System.out.println("Age cannot be zero.\nPlease provide valid medical data for a correct diagnosis.\n");
            System.out.print("Age: ");
            age = input.nextDouble();
        }
        
        System.out.print("Number of Pregnancies: ");
        double preg = input.nextDouble();
        
        System.out.print("Blood Pressure: ");
        double bp = input.nextDouble();
        while(bp <= 0){
            System.out.println("Blood Preassure cannot be zero.\nPlease provide valid medical data for a correct diagnosis.\n");
            System.out.print("Nlood Preassure: ");
            bp = input.nextDouble();
        }
        
        System.out.print("Skin Thickness: ");
        double skin = input.nextDouble();
        while(skin <= 0){
            System.out.println("Skin Thickness cannot be zero.\nPlease provide valid medical data for a correct diagnosis.\n");
            System.out.print("Skin Thickness: ");
            skin = input.nextDouble();
        }
        
        System.out.print("Insulin Level: ");
        double ins = input.nextDouble();
        while(ins <= 0){
            System.out.println("Insulin level cannot be zero.\nPlease provide valid medical data for a correct diagnosis.\n");
            System.out.print("Insulin Level: ");
            ins = input.nextDouble();
        }
        
        System.out.print("Diabetes Pedigree Function (e.g., 0.5): ");
        double ped = input.nextDouble(); 
        while(ped <= 0){
            System.out.println("Diabetes pedigree function cannot be zero.\nPlease provide valid medical data for a correct diagnosis.\n");
            System.out.print("Diabetes Pedigree Function(e.g., 0.5): ");
            ped = input.nextDouble();
        }
        
        
        
            Patient userPatient = new Patient(preg, glu, bp, skin, ins, bmi, ped, age, 0);
            
            MLProcessor processor = new MLProcessor();
        int result = processor.predict(userPatient, trainingData);
            
        System.out.println("\nDiagnosis Result: " + (result == 1 ? "Diabetic " : "Healthy"));
        
        
        
        
    }
    
}
