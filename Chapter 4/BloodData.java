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
        this.bloodType = "A";
        this.rhFactor = "-";
    }

   
    public void displayBloodInfo() {
        System.out.println("Blood Type: " + this.bloodType);
        System.out.println("Rh Factor: "  + this.rhFactor);
    }


}
