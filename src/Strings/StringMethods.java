package Strings;

public class StringMethods {
    public static void main(String[] args) {
        String team = new String("Galatasaray");

        System.out.println("Character size : " + team.length());
        System.out.println("Character which is at 5. index : " + team.charAt(5));
        System.out.println("Substring : " + team.substring(6,10));
        System.out.println("Last position of 'a' : " + team.lastIndexOf('a'));
        System.out.println("Change character place : " + team.replace('G','r'));
        System.out.println("All characters are upperCase : " + team.toUpperCase());
        System.out.println("All characters are lowerCase : " + team.toLowerCase());

        String year = "1905";
        System.out.println("Double year : " + Double.parseDouble(year));

        String teamTwo = "Galatasaray";

        if(team.equals(teamTwo)){
            System.out.println("The same teams!");
        }else{
            System.out.println("Different teams");
        }
    }
}
