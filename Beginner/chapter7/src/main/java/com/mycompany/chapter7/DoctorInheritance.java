package com.mycompany.chapter7;

public class DoctorInheritance {

    static class Doctor {
        boolean worksAtHospital;

        void treatPatient() {
            System.out.println("Performing a checkup");
        }
    }

    static class FamilyDoctor extends Doctor {
        boolean makesHouseCalls;

        void giveAdvice() {
            System.out.println("Giving homespun advice");
        }
        // inherits treatPatient() from Doctor — does NOT override it
    }

    static class Surgeon extends Doctor {
        @Override
        void treatPatient() {
            System.out.println("Performing surgery");
        }

        void makeIncision() {
            System.out.println("Making incision");
        }
    }

    public static void main(String[] args) {
        FamilyDoctor fd = new FamilyDoctor();
        fd.treatPatient();   // inherited from Doctor
        fd.giveAdvice();     // FamilyDoctor's own method

        Surgeon s = new Surgeon();
        s.treatPatient();    // overridden in Surgeon
        s.makeIncision();    // Surgeon's own method
    }
}