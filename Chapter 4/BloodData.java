class BloodData {
    
    public String bloodType, rhFactor;

    
    public void BloodData() {
        this.bloodType = " ";
        this.rhFactor = " ";
    }

   
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    
    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
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
