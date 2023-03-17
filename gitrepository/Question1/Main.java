public class Main {
    public static void main(String[] args) {

        Bank a=new SBI("rashi","Gokulpuri","Anish",23,4.35F,3.45F,4.43F);
        System.out.println(a.printdetails());
        Bank b=new BOI();
        b.setbranchcount(22);
        b.setchairmanName("Akash Joshi");
        b.setName("Simran");
        b.sethoAddress("Shastri Park");
        b.sethlirate((float)5.0);
        b.setplirate((float)6.67);
        b.setFdirate((float)4.56);
        System.out.println("Name:"+b.getname());
        System.out.println("Chairman name: "+b.getChairmanName());
        System.out.println("home office Address : "+b.gethoAddress());
        System.out.println("Branch Count: "+b.getBranchcount());
        System.out.println("FDI rate: "+b.getfdirate());
        System.out.println("PLI rate : "+b.getplirate());
        System.out.println("HLI rate: "+b.gethlirate());
        ICICI c=new ICICI();
        c.setName("Shreya");
        c.setchairmanName("Shruti");
        c.sethoAddress("Krishna Nagar");
        c.setbranchcount(21);
        c.sethlirate((float)4.56);
        c.setplirate((float)5.55);
        c.setFdirate((float)3.67);
        System.out.println(c.printdetails());
    }
}