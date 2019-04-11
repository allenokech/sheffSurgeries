package com.aokech

class BootStrap {

    def init = { servletContext ->
      def SPawson=new Nurse(
        nurseName: 'Susan Pawson',
        qualifications: 'Registered General Nurse',
        nurseEmail: 's.peters@myemail.com',
        nurseOffice: 'B-455',
        nursePhone: '01132224433'
        ).save()

      def JDoe=new Nurse(
        nurseName: 'Jane Doe',
        qualifications: 'Registered General Nurse',
        nurseEmail: 'j.doe@myemail.com',
        nurseOffice: 'B-210',
        nursePhone: '01132224433'
        ).save()

      def TRivers=new Patient(
        patientName: 'Tom Rivers',
        patientAddress: '2 One Way Street, Eckington',
        patientResidence: 'Sheffield',
        patientDob: new Date('20/09/1988'),
        patientID: 'E2555',
        patientPhone: '01142224444',
        theAppointment:'AppointmentTom'
        ).save()

      def PMaury=new Patient(
        patientName: 'Peter Maury',
        patientAddress: '1 Three-Bird Close, Peckingham',
        patientResidence: 'Barnsley',
        patientDob: new Date('13/10/1991'),
        patientID: 'J6411',
        patientPhone: '01142224444',
        theAppointment:'AppointmentPeter'
        ).save()

      def AppointmentTom=new Appointment(
        appDate: new Date('11/04/2019'),
        appTime: '3.00pm',
        appDuration: 30,
        roomNumber: 'A-1111'
        ).save()
      def AppointmentPeter=new Appointment(
        appDate: new Date('29/03/2019'),
        appTime: '1.20pm',
        appDuration: 45,
        roomNumber: 'B-4114'
        ).save()

      def RKingston=new Receptionist(
        recepName: 'Rob Kingston',
        recepEmail: 'r.kingston@email.com',
        recepUsername: 'rking',
        recepPassword: 'secret2019',
        recepPhone: '01142224455',
        theAppointment:'AppointmentRob'
        ).save()

      def AReed=new Receptionist(
        recepName: 'Alice Reed',
        recepEmail: 'a.reed@email.com',
        recepUsername: 'areed',
        recepPassword: 'pword9542',
        recepPhone: '01142224455',
        theAppointment:'AppointmentAlice'
        ).save()

      def PanadolTom=new Prescription(
        pharmacyName: 'City Centre Pharmacy',
        prescipNumber: 56788,
        medicine: 'Panadol',
        totalCost: 5.90,
        dateIssued: new Date('25/05/2019'),
        daysSupply: 5,
        thePatient: 'TRivers',
        theDoctor: 'SMacdonald'
        ).save()

      def DoxycylinePeter=new Prescription(
        pharmacyName: 'Wicker Pharmacy',
        prescipNumber: 73108,
        medicine: 'Doxycyline',
        totalCost: 20.00,
        dateIssued: new Date('31/05/2019'),
        daysSupply: 3,
        thePatient: 'PMaury',
        theDoctor: 'TPeterson'
        ).save()

      def SMacdonald=new Doctor(
        fullName: 'Dr Sarah Macdonald',
        qualification: 'MBChB(SHeffield)',
        position: 'GP',
        doctorEmail: 's.macdonald@myemail.com',
        password: 'secret222',
        doctorOffice: 'D-9888',
        doctorPhone: '01538111777',
        bio: 'placeholder'
        ).save()

      def TPeterson=new Doctor(
          fullName: 'Dr Thomas Peterson',
          qualification: 'MBChB(SHeffield)',
          position: 'Surgeon',
          doctorEmail: 't.peterson@myemail.com',
          password: 'iona772',
          doctorOffice: 'D-9181',
          doctorPhone: '06181117770',
          bio: 'placeholder'
          ).save()

      def SMCSurgery=new Surgery(
        name: 'Sheffield Medical Centre',
        address: '21 Spital Street, Sheffield',
        postcode: 'S3 9LB',
        telephone: '01104255555',
        numberOfPatients: 50,
        description: 'Use placeholder text',
        openingTime: '08:00- 18:00hrs',
        registeringNewPatient: true
        )
        SMCSurgery.addToReceptionists(RKingston)
        SMCSurgery.addToDoctors(SMacdonald)
        SMCSurgery.addToNurses(SPawson)
        .save()

      def BGSurgery=new Surgery(
        name: 'Burngreave Surgery',
        address: '5 Burngreave, Sheffield',
        postcode: 'S8 3DR',
        telephone: '06911455555',
        numberOfPatients: 45,
        description: 'Use placeholder text',
        openingTime: '09:00- 17:00hrs',
        registeringNewPatient: true
        )
        BGSurgery.addToReceptionists(AReed)
        BGSurgery.addToDoctors(TPeterson)
        BGSurgery.addToNurses(JDoe)
        .save()

        /* SMCSurgery.addToDoctors(sMacdonald)
        SMCSurgery.addToReceptionists(rKingston)
        SMCSurgery.addToNurses(sPawson)
        SMCSurgery.addToPatients(tRivers)
        SMCSurgery.addToDoctors(tPeterson)
        SMCSurgery.addToReceptionists(rKingston)
        SMCSurgery.addToNurses(jDoe)
        SMCSurgery.addToPatients(pMaury)

        sMacdonald.addToPrescription(PanadolTom),
        sMacdonald.addToPrescription(DoxycylinePeter) */
    }

    def destroy = {
    }
}
