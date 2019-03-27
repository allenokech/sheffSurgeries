package com.aokech

class Nurse {

String nurseName
String qualifications
String nurseEmail
String nurseOffice
int nursePhone

static belongsTo = Surgery
static hasMany = [doctors:Doctor]

    static constraints = {
      nurseName nullable: false, blank:false
      qualifications nullable: false, blank:false
      nurseEmail nullable: false, blank:false, email: true
      nurseOffice nullable: false, blank:false, size: 5..5
      nursePhone nullable: false, blank:false, size: 9..11
    }
}
