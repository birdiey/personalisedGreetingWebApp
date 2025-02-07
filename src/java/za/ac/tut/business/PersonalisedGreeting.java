
package za.ac.tut.business;

public class PersonalisedGreeting {
    private Person person;

    public PersonalisedGreeting(Person person) {
        this.person = person;
    }
    
    
    
    public String gettingNameSurname(){
        
        String nameSurname = person.getNameSurname();
        
        
        return nameSurname;
    }
    
     public String determineTitle() {
        String title = "Ms.";

        if (Character.toUpperCase(person.getGender().charAt(0)) == 'M') {
            title = "Mr.";
        }
        return title;

    }
      }

