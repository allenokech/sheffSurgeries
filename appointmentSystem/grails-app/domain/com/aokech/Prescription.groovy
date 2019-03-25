package com.aokech

class Prescription {

String pharmacyName
int prescripNumber
String medicine
double totalCost
Date dateIssued
Boolean patientPaying

    static constraints = {
      pharmacyName nullable: false, blank:false
      prescripNumber nullable: false, blank:false
      
    }
}
