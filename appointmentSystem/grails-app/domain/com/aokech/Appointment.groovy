package com.aokech

class Appointment {

  Date appDate
  String appTime
  int appDuration
  String roomNumber

  Patient thePatient
  Doctor theDoctor
  Surgery theSurgery

    static constraints = {
      appDate nullable: false, blank:false
      appTime nullable: false, blank:false
      appDuration nullable: false, blank:false
      roomNumber nullable: false, blank:false, size: 6..6
    }
}
