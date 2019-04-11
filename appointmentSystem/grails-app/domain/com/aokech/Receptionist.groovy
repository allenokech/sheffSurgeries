package com.aokech

class Receptionist {

  String recepName
  String recepEmail
  String recepUsername
  String recepPassword
  String recepPhone

  Surgery theSurgery

    static constraints = {
      recepName nullable: false, blank:false
      recepEmail nullable: false, blank:false
      recepUsername nullable: false, blank:false
      recepPassword nullable: false, blank:false, password: true
      recepPhone nullable: false, blank:false, size: 9..11
    }
}
