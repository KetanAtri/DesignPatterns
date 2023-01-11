package structuralDesignPatterns.bridge.hospital;

import lombok.AllArgsConstructor;
import structuralDesignPatterns.bridge.speciality.Speicality;

@AllArgsConstructor
public class HospitalImpl implements Hospital
{
    private Speicality speicality;

    @Override
    public void treatPatient()
    {
        speicality.performOperation();
    }

    @Override
    public void collectFees()
    {
        speicality.contactBank();
    }
}
