package lesson6.noa.sharabi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    private static Person person=new Person();

    public static void main(String[] args) {
        try {
            person.setId("123332222");
        }
        catch (InvalidParameterExeption id){
            System.out.println(id.getMessage());
        }
        try {
            person.setName(null);
        }
        catch (InvalidParameterExeption name){
            name.printStackTrace();
        }
        /*
        try {
            person.setBirthDate(new LocalDate(1800,5,8));
        }
        catch (InvalidParameterExeption birthDate){
            birthDate.getMessage();
        }
         */
        finally {
            System.out.println("yes");
        }
    }
}
