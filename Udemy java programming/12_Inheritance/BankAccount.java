import java.util.Scanner;
//Challenge 1 Inheritance
class Account{

    public long accountNumber;
    public String accountHolderName;
    public String accountHolderAddress;
    public String phoneNumber;
    public String dateOfBirth;
    public String email;
    public double balance;
    public boolean isClosed = false;
    public String msg = "";
    
    public Account(long accNo, String name, String address, String phone, String dob, String email){
        if(!isClosed){
            this.accountNumber =  accNo;
            this.accountHolderName = name;
            this.accountHolderAddress = address;
            this.phoneNumber = phone;
        
            if(dob.matches("[0-3][0-9]/[0-1][0-9]/[2][0][0-3][0-9]+")){this.dateOfBirth = dob;}
            else {this.dateOfBirth = "Invalid Date of Birth Given...";}
        
            if(email.contains("@")){this.email = email;}
            else{this.email = "Invalid Email Address given";}
        }
        else{
            this.msg = "Sorry! The account is closed...!!";
        }
    }
    
    //getters//
    public String getAccountNumber(){
        if(!isClosed){return "" + this.accountNumber;}
        return this.msg;
    }
    public String getAccountHolderName(){
        if(!isClosed){return this.accountHolderName;}
        return this.msg;
    }
    public String getAccountHolderAddress(){
        if(!isClosed){return this.accountHolderAddress;}
        return this.msg;
    }
    public String getPhoneNumber(){
        if(!isClosed){return this.phoneNumber;}
        return this.msg;
    }
    public String getDateOfBirth(){
        if(!isClosed){return this.dateOfBirth;}
        return this.msg;
    }
    public String getEmail(){
        if(!isClosed){return this.email;}
        return this.msg;
    }
    public String getBalance(){
        if(!isClosed){return "" + this.balance;}
        return this.msg;
    }

    //setter//
    public void setPhoneNumber(String phone){
        if(phone.matches("[+][0-9]+")) {this.phoneNumber = phone;}
        else {this.phoneNumber = "Invalid Phone Number!";}
    }

    public void setEmail(String email){
        if(email.contains("@")) {this.email = email;}
        else{this.email = "Invalid Email was Given...";}
    }

    //General Methods//
    public void CloseAccount(){
        this.isClosed = true;
    }
}

class SavingsAccount extends Account{
    public double fixedDeposit, fixedDepositDuration;
    public String fixedDepositID, fixedDepositMsg;
    
    public SavingsAccount(long accNo, String name, String address, String phone, String dob, String email){
        super(accNo, name, address, phone, dob, email);
    }

    public void depositMoney(double amount){
        this.balance += amount;
    }

    public void withdrawMoney(double amount){
        this.balance -= amount;
    }

    public void fixedDeposit(double amount, int duration, String fixedDepositID){
        this.fixedDeposit = amount;
        this.fixedDepositDuration = duration;
        this.fixedDepositID = fixedDepositID;
    }

    public void liquidate(){
        this.fixedDepositMsg = "We Don\'t Provide any Liquidates.. Kindly go through the policies again..! Thank you!!";
    }
}

class BankAccount{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the name of account holder : ");
        String accountHolderName = input.nextLine();
        
        System.out.print("Account number of [" + accountHolderName + "\'s] : ");
        long accNo = input.nextLong();

        input.nextLine();
        System.out.print("Address (City) : ");
        String city = input.nextLine();

        System.out.print("Phone number["+(accountHolderName)+"\'s] : ");
        String phone = input.nextLine();

        System.out.print("Date of Birth ["+(accountHolderName)+"\'s] (dd/mm/yyyy) : ");
        String dob = input.nextLine();

        System.out.print("Email "+accountHolderName+"\'s : ");
        String email = input.nextLine();


        System.out.println("");
        int option = 0;

        SavingsAccount savAcc = new SavingsAccount(accNo, accountHolderName, city, phone, dob, email);
        
        while(option != 9){
            System.out.print("\n\nAccount Details : ----------\t|\n");
            System.out.print("Account Holder Name: " + savAcc.getAccountHolderName() + "\t|\n");
            System.out.print("Account Number : " + savAcc.getAccountNumber() + "\t|\n");
            System.out.print("Phone Number : " + savAcc.getPhoneNumber() + "\t|\nCity : " + savAcc.getAccountHolderAddress() + "\t|\n");
            System.out.print("Date of Birth : " + savAcc.getDateOfBirth() +"\t|"+ "\nEmail : " + savAcc.getEmail() + "\t|\n");
            System.out.print("\n\nChoose one from the following |\n");
            System.out.print("[1] Deposit Money to Account  |\n");
            System.out.print("[2] Check Balance in Account  |\n");
            System.out.print("[3] Withdraw money Account    |\n");
            System.out.print("[4] Update The Phone Number   |\n");
            System.out.print("[5] Update The Email Address  |\n");
            System.out.print("[6] Fixed Deposit             |\n");
            System.out.print("[7] Liquidate Amount          |\n");
            System.out.print("[8] Close Account             |\n");
            System.out.print("[9] Logout from this system   |\n");
            System.out.print("[Your Option] : ");
            option = input.nextInt();

            switch(option){
                case 1:{
                    System.out.print("\nEnter the Amount you want to deposit : ");
                    double amt = input.nextDouble();
                    System.out.printf("%nCREDITED : $%.2f\n", amt);
                    savAcc.depositMoney(amt);
                    break;
                }
                case 2:{
                    System.out.printf("%n%nBALANCE : $%.2f", Double.parseDouble(savAcc.getBalance()));
                    System.out.println("");
                    break;
                }
                case 3:{
                    if(Double.parseDouble(savAcc.getBalance()) == 0){
                        System.out.print("Unable to withdraw!! Zero balance!");
                        break;
                    }
                    else{
                        System.out.printf("%n%nAvailable balance : $%.2f%n",Double.parseDouble(savAcc.getBalance()));
                        System.out.print("\nEnter Amount to withdraw from : ");
                        double amt = input.nextDouble();
                        if(amt > Double.parseDouble(savAcc.getBalance())){System.out.print("\n\nInsufficient fund..!!\n");}
                        else{
                            System.out.printf("%n%nWithdrawing.... $%.2f%n", amt);
                            System.out.printf("%n%nDEBITED : %.2f%n", amt);
                            savAcc.withdrawMoney(amt);
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.print("\n\nUpdate Phone Number\n\n");
                    input.nextLine();
                    System.out.print("Enter the new phone number : ");
                    String phoneNum = input.nextLine();

                    savAcc.setPhoneNumber(phoneNum);
                    System.out.print("\n\nPhone Number Updated !!!\n");
                    break;
                }
                case 5:{
                    System.out.print("\nUpdate Email \n\n");
                    input.nextLine();
                    System.out.print("Enter the New Email: ");
                    String Email = input.nextLine();
                    savAcc.setEmail(Email);

                    System.out.print("\nEmail Updated !!!\n");
                    break;
                }
                case 6:{
                    System.out.print("Enter the amount to make a fixed deposit : ");
                    double fixedDepositAmt = input.nextDouble();

                    System.out.print("Enter the duration (years) : ");
                    int duration = input.nextInt();
                    
                    input.nextLine();
                    System.out.print("Enter the Fixed Deposit ID : ");
                    String id = input.nextLine();

                    savAcc.fixedDeposit(fixedDepositAmt, duration, id);
                    System.out.print("\n\nInterest rate : 0.05%");
                    System.out.print("\nFixed Deposit Initiated !! You can collect it by!! " + duration + " years!!\n");
                    break;
                }
                case 7:{
                    if(savAcc.fixedDeposit == 0){
                        System.out.print("\nFirst Make a Fixed Deposit!!!\n");
                        break;
                    }
                    savAcc.liquidate();
                    System.out.println("" +savAcc.fixedDepositMsg+ "\n");
                    System.out.print("\nYou Can Collect it after : " + savAcc.fixedDepositDuration + " years \n\n");
                    break;
                }

                case 8:{
                    if(!savAcc.isClosed){
                        System.out.print("Close Account : ");
                        input.nextLine();
                        System.out.print("\nAre you sure? \t[Y]\t[N] : ");
                        String yesNo = input.nextLine();

                        if(yesNo.equals("Y")){
                            savAcc.CloseAccount();
                        }
                        else{
                           System.out.print("\n\nAborted Process of Closing Account...!\n\n");
                        }
                        break;
                    }
                    else{
                        System.out.println("\n\nFirst Create an Account!");
                        break;
                    }
                }
                case 9:{
                    System.out.println("\nLogging you out....");
                    break;
                }
                default:{
                    System.out.println("\nInvalid Choice Made....\n");
                    break;
                }
            }
        }
        input.close();
    }
}