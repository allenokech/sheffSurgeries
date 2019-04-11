package com.aokech

class Surgery {

  String name
  String address
  String postcode
  String telephone
  int numberOfPatients
  String description
  String openingTime
  Boolean registeringNewPatient

  static hasMany=[nurses: Nurse, doctors: Doctor, patients: Patient, receptionists: Receptionist]

    static constraints = {
      name nullable: false, blank:false
      address nullable: false, blank:false
      postcode nullable: false, blank:false
      telephone nullable: false, blank:false
      numberOfPatients nullable: false, blank:false, max: 50
      description nullable: false, blank:false, maxSize: 5000
      openingTime nullable: false, blank:false
      registeringNewPatient nullable: false, blank:false
    }
}
