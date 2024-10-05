class BloodData {
    
    public String bloodType, rhFactor;

    
    BloodData() {
        
    }

    
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    
    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

     public String getBloodType() {
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    
    public void defaultPatient() {
        bloodType = "A";
        rhFactor = "-";
    }

   
    public void displayBloodInfo() {
        System.out.println("Blood Type: " + getBloodType());
        System.out.println("Rh Factor: "  + getRhFactor());
    }


}
