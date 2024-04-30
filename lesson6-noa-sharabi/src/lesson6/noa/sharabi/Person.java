package lesson6.noa.sharabi;

import java.time.LocalDate;
import java.time.LocalTime;

public class Person {
    private String id;
    private String name;
    private LocalDate birthDate;

    public Person(String id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Person() {

    }

    public String getId() {

        return id;
    }

    public void setId(String id) throws InvalidParameterExeption{
        if (id.length()!=9||id.matches("\\d+"))
            throw new InvalidParameterExeption("Id:"+id+" not valid, must be 9 digits only");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidParameterExeption{
        if (name==null||name.isEmpty())
            throw new InvalidParameterExeption("Name: null is not valid, must be not null and not empty");
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate)  throws InvalidParameterExeption{
        if (birthDate.getYear()<1900)
            throw new InvalidParameterExeption("Birth date: "+birthDate+" is not valid, must be greater than 01/01/1900");
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return birthDate.getDayOfMonth()+"/"+birthDate.getMonth()+"/"+birthDate.getYear();
    }
}
