package structuralDesignPatterns.bridge;

import lombok.extern.slf4j.Slf4j;
import structuralDesignPatterns.bridge.hospital.Hospital;
import structuralDesignPatterns.bridge.hospital.HospitalImpl;
import structuralDesignPatterns.bridge.speciality.Cardiology;
import structuralDesignPatterns.bridge.speciality.Orthopedic;

@Slf4j
public class Driver
{
    private static void testBridge()
    {
        Hospital eyeHospital = new HospitalImpl(new Orthopedic());
        eyeHospital.collectFees();
        eyeHospital.treatPatient();
        Hospital heartHospital = new HospitalImpl(new Cardiology());
        heartHospital.collectFees();
        heartHospital.treatPatient();
    }

    public static void main(String[] args)
    {
        testBridge();
    }
}
