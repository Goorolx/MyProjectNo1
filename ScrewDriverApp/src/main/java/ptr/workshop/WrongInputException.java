package ptr.workshop;

public class WrongInputException extends Exception {
//    public WrongInputException() {
//    }

    @Override
    public String getMessage() {
        return "Something is wrong with your input data, please double check";
    }
}
