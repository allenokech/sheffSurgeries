package com.aokech

class Doctor {

String fullName
String qualification
String position
String doctorEmail
String password
String doctorOffice
int doctorPhone
String bio

static belongsTo= Surgery
static hasMany = [prescriptions:Prescription, patients:Patient, nurses:Nurse, appointments:Appointment]


    static constraints = {

      fullName nullable: false, blank:false
      qualification nullable: false, blank:false
      position nullable: false, blank:false
      doctorEmail nullable: false, blank:false, email: true
      password nullable: false, blank:false
      doctorOffice nullable: false, blank:false, size: 6..6
      doctorPhone nullable: false, blank:false, size: 9..11
      bio nullable: false, blank:false, maxSize: 5000, widget: 'textarea'
    }
}
