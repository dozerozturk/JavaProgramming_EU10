package day42_Exceptions;


class FadyException extends RuntimeException{


    public FadyException(){
        super("Time for a short break");
    }

    public FadyException(String message){
        super(message);
    }
}


class NoBreakException extends Exception { //custom checked exception

}

public class CustomExceptions {

    public static void main(String[] args) {

        try {
            throw new NoBreakException();

        } catch (NoBreakException e) {
            e.printStackTrace();
        }
    }
}

