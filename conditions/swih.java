import java.util.Scanner;

public class swih{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name = ");
        String a = s.nextLine();
        System.out.println(" ");

        
        switch (a) {
            case "Somil Jain":
            System.out.println("cool");    
            System.out.println("B.tech");    
            System.out.println("AITR");    
            System.out.println("1st year completed");    
                break;
              
                case "Yash Jhawar":
                System.out.println("cool");    
                System.out.println("B.tech");    
                System.out.println("AITR");    
                System.out.println("1st year completed");   
                    break;
                    
                case "Samay Jain":
                    System.out.println("cool");    
                    System.out.println("B.tech");    
                    System.out.println("AITR");    
                    System.out.println("1st year completed");   
                        break;
                
            case "Yogesh Mali":
                System.out.println("cool");  
                System.out.println("B.tech");    
                System.out.println("AITR");    
                System.out.println("1st year completed");     
                    break;

            case "Pragya Jain":
                System.out.println("Pagal");
                System.out.println("Bebkoof");
                System.out.println("Bahut Chillati hai");
                System.out.println("Kaam kuch bhi nhi krti");
                System.out.println("Alsi");

                    break;


            case "Sangita Jain":
                System.out.println("Mummy");    
                System.out.println("Housewife");
                System.out.println("MA Pass");    
                System.out.println("bahut saari cheese hai ab mai kya kya likh du");    

                    break;

            case "Sunil Jain":
                System.out.println("cool");    
                System.out.println("Papa");    
                System.out.println("Businessman");    
                System.out.println("Chemist");    
                System.out.println("......");
                    break;

            case "Vinayak Bajpai":
                System.out.println("cool");  
                System.out.println("B.tech");    
                System.out.println("AITR");    
                System.out.println("1st year completed");       
                    break;
                                                                                 
                    
            default:
            System.out.println("INVALID NAME");
                break;
        }
        System.out.println(" ");
            System.out.println("THANKS FOR USING ");
        System.out.println(" ");
    }
}