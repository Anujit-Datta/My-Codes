public class problem2 {
    String adr,phn;
    int roll;
    public static void main(String[] args){
        problem2 sam=new problem2();
        sam.roll=1;
        sam.phn="01700000000";
        sam.adr="Dhaka";
        System.out.println("Sam's Info: ");
        System.out.println("Roll: "+ sam.roll+"\nPhone: "+sam.phn+"\nAddress: "+sam.adr);

        problem2 john=new problem2();
        john.roll=2;
        john.phn="01300000000";
        john.adr="Cumilla";
        System.out.println("\nJohn's Info: ");
        System.out.println("Roll: "+ john.roll+"\nPhone: "+john.phn+"\nAddress: "+john.adr);
    }
}
