public abstract class Bank {
    public String name,hoAddress,chairmanName;
    public int branchcount;
    public float fdirate, plirate,hlirate;
    public Bank(){
    };
    public Bank(String name,String hoAddress,String chairmanName,int branchcount,float fdirate,float plirate,float hlirate) {
        this.name=name;
        this.hoAddress=hoAddress;
        this.branchcount=branchcount;
        this.fdirate=fdirate;
        this.hlirate=hlirate;
        this.plirate=plirate;
        this.chairmanName=chairmanName;
    }
    
    public void setbranchcount(int branchcount) {
        this.branchcount=branchcount;
    }
   
    public void setName(String name) {
        this.name=name;
    }

    
    public void sethoAddress(String hoAddress) {
        this.hoAddress=hoAddress;
    }
    
    public void setchairmanName(String chairmanName) {
        this.chairmanName=chairmanName;
    }
    
    public void setFdirate(float fdirate) {
        this.fdirate=fdirate;
    }
    
    public void setplirate(float plirate) {
        this.plirate=plirate;
    }

    
    public void sethlirate(float hlirate) {
        this.hlirate=hlirate;
    }

    
    public String getname() {
        return name;
    }
    public String gethoAddress() {
        return hoAddress;
    }
    public String getChairmanName() {
        return chairmanName;
    }
    public int getBranchcount() {
        return branchcount;
    }
    public float getfdirate() {
        return fdirate;
    }
    public float getplirate() {
        return plirate;
    }
    public float gethlirate() {
        return hlirate;
    }
    public String printdetails() {
        return "Name : "+name+" \nHome Office Address: "+hoAddress+" \nChairman Name : "+chairmanName+" \nBranch count : "+branchcount+" \n FDI rate: "+fdirate+" \nPLI rate: "+plirate+"\n HLI rate: "+hlirate;
    }
}
