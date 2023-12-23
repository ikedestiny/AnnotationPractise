public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Person person = new Person("","","");
        Person validPerson = new Person("Destiny","Ike","");
        Person semiValidPerson = new Person("Emmanuella", "Gory","Stg");
        VerifyProcessor verifyProcessor = new VerifyProcessor();
        verifyProcessor.validate(person);
        verifyProcessor.validate(validPerson);
        verifyProcessor.validate(semiValidPerson);

        System.out.println("INVALID PERSON: "+person.getName()+" "+person.getSurname()+" "+person.getAnotherName());
        System.out.println("VALID PERSON: "+validPerson.getName()+" "+validPerson.getSurname()+" "+validPerson.getAnotherName());
        System.out.println("SEMI-VALID_PERSON: "+semiValidPerson.getName()+" "+semiValidPerson.getSurname()+" "+semiValidPerson.getAnotherName());

        /*Result
         *INVALID PERSON: INVALID INVALID
         *VALID PERSON: Destiny Ike
         *SEMI-VALID_PERSON: INVALID Gory Stg
         */



    }
}
