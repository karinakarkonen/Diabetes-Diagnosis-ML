# Diabetes Diagnosis: Custom k-NN Implementation 

This project is a Java application developed to predict diabetes diagnosis based on medical data. It was created as a technical project for my **Eastern European Machine Learning (EEML)** Summer School application.

## Project Overview
The core of this project is a custom-built **k-Nearest Neighbors (k-NN)** algorithm. Instead of using external machine learning libraries, I implemented the prediction logic from scratch to better understand the underlying mathematics of classification.

### How It Works
The system uses the **Euclidean Distance** formula to compare a new patient's medical metrics against a known dataset. 
1. **Data Input:** The user enters medical data (Glucose, BMI, Age, etc.).
2. **Comparison:** The algorithm calculates the "distance" between the new entry and all existing data points in the training set.
3. **Diagnosis:** The system finds the most similar record (the nearest neighbor) and provides a diagnosis based on that match.

## Features Analyzed
The prediction is based on 8 critical health factors:
* Glucose Level
* Body Mass Index (BMI)
* Age
* Blood Pressure
* Number of Pregnancies
* Insulin Level
* Skin Thickness
* Diabetes Pedigree Function

## Project Structure
* **`Patient.java`**: A class that defines the patient model and ensures data security through encapsulation.
* **`MLProcessor.java`**: The engine of the project. It contains the logic for calculating distances and finding the best match.
* **`DiabetesPredictionSystem.java`**: The main class that handles the user interface and manages the training data.

## 🛠 Tech Stack
* **Language:** Java
* **IDE:** Apache NetBeans
* **Algorithm:** Custom k-Nearest Neighbors (k=1)
