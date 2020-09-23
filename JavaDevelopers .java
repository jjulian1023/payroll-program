/*
    julian arcila
*/

//importing scanner for user 
import java.util.Scanner;
//starting class for main argument below
/*
    This program will print out the developrs pay based on their skill level.
*/
public class JavaDevelopers {
    //starting main program / argument below
    /*
    
    This main method will calculate a developers pay depending on level of seniority of skill they are in.
    As well, depending on the level the user inputs, there will be software packages that they may have to buy.  
    
    Towards the end it will print out the amount earned from hours minus software packages it will need to buy depending the level,
    amount deducted from taxes, and final paycheck amount including everything.
    */
    public static void main(String[] args) {
        //declaring variables
        Scanner input = new Scanner(System.in); // implementing scanner name
        String sName = ""; //name user will input
        double dHoursWorked = 0.0;//hours worked user will input
        int nPaidLevel = 0;// level of pay depending on user inputs
        double dAmountEarned = 0.0;// amount earned
        double dOvertime = 0.0; //overtime hours after 40 hours
        double dAmountToolPackages = 0.0; //amount of software tool packages
        int nOption = 0; //1 or 2 digits will be for option they will choose for tools packages
        int nAnswer = 0; // answer depending what the user will say
        double dPayCheck = 0.0; // amount of final paycheck
        double dAmountDeductedTaxes = 0.0; // amount of taxes
       
        //declaring constants for skill level
        final double OVERTIME_PAY_RATE = 1.5;//overtime rate pay
        final double SKILL_LEVEL_1 = 18.00;//pay for skill level 1
        final double SKILL_LEVEL_2 = 40.00;//pay for skill level 2
        final double SKILL_LEVEL_3 = 60.00;//pay for skill level 3
        final double SKILL_LEVEL_4 = 80.00;//pay for skill level 4
        
        //declaring constants for inputed questions/INPUT
        final String INPUT_1 = "Developer Information";
        final String INPUT_2 = "Developer's name: ";
        final String INPUT_3 = "Skill Level: ";
        final String INPUT_4 = "Total hours worked: ";
        final String INPUT_5 = "Amount Earned: ";
        final String INPUT_6 = "Amount Deducted from Tools: ";
        final String INPUT_7 = "Amount Deducted from Taxes: ";
        final String INPUT_8 = "Final Paycheck Amount: ";
        
        //declaring constants for tool packages
        final double FUNDAMENTAL_TOOL = 30.00;
        final double ANDROID_TOOL = 10.00;
        final double WEB_TOOL = 15.00;
        final double ENTERPRISE_TOOL = 25.00;
        
       //constant for 40 hours
        final double HOURS_BEFORE_OVERTIME = 40.00;
        
        
        //printing out entering your name and prompting user to input the name
        System.out.print("Please enter your name: ");
        sName = input.nextLine();
        
        //promting user to write how many were worked
        System.out.print("How many hours have you worked? ");
        dHoursWorked = input.nextDouble();
        
        
        //prompting user to write their pay level
        System.out.print("What is your paid level? ");
        nPaidLevel = input.nextInt();
        
        //skill level 1
        if (nPaidLevel == 1){
            dAmountToolPackages = 0; //it will be 0 because first level is FREE
            //pay for the developer for 40 hours or less
            if (dHoursWorked <= HOURS_BEFORE_OVERTIME) {
                dAmountEarned = dHoursWorked * SKILL_LEVEL_1;
            }
            //pay for the developer works extra time
            else if (dHoursWorked > HOURS_BEFORE_OVERTIME ){
                // first 40 hours
                dAmountEarned = HOURS_BEFORE_OVERTIME * SKILL_LEVEL_1;
                dOvertime = (dHoursWorked - HOURS_BEFORE_OVERTIME) * SKILL_LEVEL_1 * OVERTIME_PAY_RATE;
                dAmountEarned = dAmountEarned + dOvertime;
            }//end hours worked > 40
            
        }// end of skill level 1 java developer
        
        
        
        //this is for skill level 2
        else if (nPaidLevel == 2) {
            dAmountToolPackages = FUNDAMENTAL_TOOL;
            //printing the option if they want to buy software tool
            System.out.print("Would you like to purchase software tools (1 = Yes, 2 = No)?");
            nOption = input.nextInt();
            //this option will only appear if user wants to purchase software tools
            if(nOption ==1 ){
                System.out.print("Would you like to purchase Java 102 - Android (1 = Yes, 2 = No) ? " );
                nAnswer = input.nextInt();
                //if developer selects yes, this will continue
                if (nAnswer ==1){
                    dAmountToolPackages = dAmountToolPackages + ANDROID_TOOL;
                }//end of if statement if they select yes
                System.out.print("Would you like to purchase Java 103 - Web (1 = Yes, 2 = No)?  " );
                nAnswer = input.nextInt();
                //developer has selected yes for java 103
                if (nAnswer ==1){
                    dAmountToolPackages = dAmountToolPackages + WEB_TOOL;
                }//end of if statement if they select yes
                System.out.print("Would you like to purchase Java 104 - Enterprise (1 = Yes, 2 = No)?  " );
                nAnswer = input.nextInt();
                //if java developer selects yes for java 104
                if (nAnswer == 1){
                    dAmountToolPackages = dAmountToolPackages + ENTERPRISE_TOOL;
                }//end of if statement if they select yes
            }//end of option 1 if they choose yes on the options
            
            //pay for the developer for 40 hours or less
            if (dHoursWorked <= HOURS_BEFORE_OVERTIME) {
                dAmountEarned = dHoursWorked * SKILL_LEVEL_2;
            }
            //pay for the developer works extra time
            else if (dHoursWorked > HOURS_BEFORE_OVERTIME ){
                // first 40 hours
                dAmountEarned = HOURS_BEFORE_OVERTIME * SKILL_LEVEL_2;
                dOvertime = (dHoursWorked - HOURS_BEFORE_OVERTIME) * SKILL_LEVEL_2 * OVERTIME_PAY_RATE;
                dAmountEarned = dAmountEarned + dOvertime;
            }//end hours worked > 40
        }//end of paid level 2 of java developer
    
        
        
        
        
         //this is for skill level 3
         else if (nPaidLevel == 3) {
            dAmountToolPackages = FUNDAMENTAL_TOOL;
            //printing the option if they want to buy software tool
            System.out.print("Would you like to purchase software tools (1 = Yes, 2 = No)? " );
            nOption = input.nextInt();
            //this option will only appear if user wants to purchase software tools
            if(nOption ==1 ){
                System.out.print("Would you like to purchase Java 102 - Android (1 = Yes, 2 = No)?  " );
                nAnswer = input.nextInt();
                //if developer selects yes, this will continue
                if (nAnswer ==1){
                    dAmountToolPackages = dAmountToolPackages + ANDROID_TOOL;
                }//end of if statement if they select yes
                System.out.print("Would you like to purchase Java 103 - Web (1 = Yes, 2 = No)?  " );
                nAnswer = input.nextInt();
                //developer has selected yes for java 103
                if (nAnswer ==1){
                    dAmountToolPackages = dAmountToolPackages + WEB_TOOL;
                }//end of if statement if they select yes
                System.out.print("Would you like to purchase Java 104 - Enterprise (1 = Yes, 2 = No)?  " );
                nAnswer = input.nextInt();
                //if java developer selects yes for java 104
                if (nAnswer == 1){
                    dAmountToolPackages = dAmountToolPackages + ENTERPRISE_TOOL;
                }//end of if statement if they select yes
            }//end of option 1 if they choose yes on the options
            
            //pay for the developer for 40 hours or less
            if (dHoursWorked <= HOURS_BEFORE_OVERTIME) {
                dAmountEarned = dHoursWorked * SKILL_LEVEL_3;
            }
            //pay for the developer works extra time
            else if (dHoursWorked > HOURS_BEFORE_OVERTIME ){
                // first 40 hours
                dAmountEarned = HOURS_BEFORE_OVERTIME * SKILL_LEVEL_3;
                dOvertime = (dHoursWorked - HOURS_BEFORE_OVERTIME) * SKILL_LEVEL_3 * OVERTIME_PAY_RATE;
                dAmountEarned = dAmountEarned + dOvertime;
            }//end hours worked > 40
        }//end of paid level 3 of java developer
        
         
         
        //this is for skill level 4
         else if (nPaidLevel == 4) {
            dAmountToolPackages = FUNDAMENTAL_TOOL;
            //printing the option if they want to buy software tool
            System.out.print("Would you like to purchase software tools (1 = Yes, 2 = No)? " );
            nOption = input.nextInt();
            //this option will only appear if user wants to purchase software tools
            if(nOption ==1 ){
                System.out.print("Would you like to purchase Java 102 - Android (1 = Yes, 2 = No)?  ");
                nAnswer = input.nextInt();
                //if developer selects yes, this will continue
                if (nAnswer ==1){
                    dAmountToolPackages = dAmountToolPackages + ANDROID_TOOL;
                }//end of if statement if they select yes
                System.out.print("Would you like to purchase Java 103 - Web (1 = Yes, 2 = No)?  " );
                nAnswer = input.nextInt();
                //developer has selected yes for java 103
                if (nAnswer ==1){
                    dAmountToolPackages = dAmountToolPackages + WEB_TOOL;
                }//end of if statement if they select yes
                System.out.print("Would you like to purchase Java 104 - Enterprise (1 = Yes, 2 = No)?  " );
                nAnswer = input.nextInt();
                //if java developer selects yes for java 104
                if (nAnswer == 1){
                    dAmountToolPackages = dAmountToolPackages + ENTERPRISE_TOOL;
                }//end of if statement if they select yes
            }//end of option 1 if they choose yes on the options
            
            //pay for the developer for 40 hours or less
            if (dHoursWorked <= HOURS_BEFORE_OVERTIME) {
                dAmountEarned = dHoursWorked * SKILL_LEVEL_4;
            }
            //pay for the developer works extra time
            else if (dHoursWorked > HOURS_BEFORE_OVERTIME ){
                // first 40 hours
                dAmountEarned = HOURS_BEFORE_OVERTIME * SKILL_LEVEL_4;
                dOvertime = (dHoursWorked - HOURS_BEFORE_OVERTIME) * SKILL_LEVEL_4 * OVERTIME_PAY_RATE;
                dAmountEarned = dAmountEarned + dOvertime;
            }//end hours worked > 40
        }//end of paid level 4 of java developer
        
        
       // algorithm for last two equations
        dAmountDeductedTaxes = (dAmountEarned - dAmountToolPackages) * 0.075;// equation for amount deducted from taxes
        dPayCheck = (dAmountEarned - dAmountToolPackages) - dAmountDeductedTaxes;// amount of final paycheck
        
        
        
        //printing out info that is automated
        System.out.println("");// space for design of sample run
        System.out.println(INPUT_1);// Developer's info
        System.out.println(INPUT_2 + sName);// developers name
        System.out.println(INPUT_3+ nPaidLevel);// skill level
        System.out.println(INPUT_4+dHoursWorked);// total hours worked
        System.out.println(INPUT_5+ dAmountEarned);// amount earned
        System.out.println(INPUT_6+ dAmountToolPackages);// amount deducted from tools
        System.out.println(INPUT_7+ dAmountDeductedTaxes);// amount deducted from taxes
        System.out.println(INPUT_8+ dPayCheck);// final paycheck
        
        
        
    }//end of main program
    
}//end of class program javadevelopers
