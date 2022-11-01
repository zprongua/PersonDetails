package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        String result = "";
        // create a `counter`
        int counter = 0;
        // while `counter` is less than length of array
        while (counter < personArray.length) {
            // begin loop
            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[counter];
            // get `string Representation` of `currentPerson`
            result += currentPerson.toString();

            // append `stringRepresentation` to `result` variable
            counter++;
        }
            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            for (int i=0; i<personArray.length; i++){
            // begin loop
                Person currentPerson = personArray[i];
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                result += currentPerson.toString();
                // append `stringRepresentation` to `result` variable

            // end loop
            }

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name
        for (Person currentPerson : personArray) {
            // use the above discoveries to declare for-each-loop signature
            result += currentPerson.toString();
            // begin loop
            // get `string Representation` of `currentPerson`
            // append `stringRepresentation` to `result` variable
            // end loop
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
