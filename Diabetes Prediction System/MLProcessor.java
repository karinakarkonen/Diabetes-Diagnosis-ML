/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patient;

import java.util.ArrayList;

/**
 *
 * @author Karina
 */
public class MLProcessor {
    
    public double calculateDistance(Patient p1, Patient p2){
        
        double sum = 0.0;
        
        sum += Math.pow(p1.getPregnancies() - p2.getPregnancies(), 2);
        sum += Math.pow(p1.getGlucose() - p2.getGlucose(), 2);
        sum += Math.pow(p1.getBloodPressure() - p2.getBloodPressure(), 2);
        sum += Math.pow(p1.getSkinThickness() - p2.getSkinThickness(), 2);
        sum += Math.pow(p1.getInsulin() - p2.getInsulin(), 2);
        sum += Math.pow(p1.getBmi() - p2.getBmi(), 2);
        sum += Math.pow(p1.getPedigree() - p2.getPedigree(), 2);
        sum += Math.pow(p1.getAge() - p2.getAge(), 2);
        
        return Math.sqrt(sum);
    }
    
    public int predict(Patient newPatient, ArrayList<Patient> trainingData){
        
        double minDistance = Double.MAX_VALUE;
        
        int result=0;
        
        for(int i = 0; i < trainingData.size(); i++){
            Patient p = trainingData.get(i);
            double currentDistance = calculateDistance(newPatient, p);
            
            if(currentDistance < minDistance){
                minDistance = currentDistance;
                result = p.getOutcome();
            }
        }
        
        return result;
    }
    
}
