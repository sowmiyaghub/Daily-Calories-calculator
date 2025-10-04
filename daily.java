import java.util.*;
 class daily{
    public static void main(String[] args){
        Scanner calories=new Scanner(System.in);
        System.out.println("Enter gender(M/F):");
        String gender=calories.nextLine();
        System.out.println("Enter age(years):");
        int age=calories.nextInt();
        System.out.println("Enter weight(kg):");
        double weight=calories.nextDouble();
        System.out.println("Enter height(cm):");
        double height=calories.nextDouble();
        double bmr;
        if(gender.equalsIgnoreCase("M")){
            bmr=66+(13.7*weight)+(5*height)-(6.8*age);
        }
        else{
            bmr=655+(9.6*weight)+(1.8*height)-(4.7*age);
        }
        System.out.println("\nselect Activity level:");
        System.out.println("1. Sedentary(little or no exercise)");
        System.out.println("2. Lightly active(light exercise 1-3 days/week)");
        System.out.println("3. Moderately active(moderate exercise 3-5 days/week)");
        System.out.println("4. very active(hard exercise 6-7 days/week)");
        System.out.println("5. Extra active(very hard exercise,physical job)");
        int activity=calories.nextInt();
        double activityMultiplier;
        switch(activity){
            case 1: activityMultiplier=1.2;break;
            case 2: activityMultiplier=1.375;break;
            case 3: activityMultiplier=1.55;break;
            case 4: activityMultiplier=1.725;break;
            case 5: activityMultiplier=1.9;break;
            default: activityMultiplier=1.2;
        }
        double dailyCalories=bmr*activityMultiplier;
        System.out.printf("your estimated daily calorie requirement: %.0f calories\n",dailyCalories);
    }
    }
