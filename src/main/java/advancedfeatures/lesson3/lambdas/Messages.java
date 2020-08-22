package advancedfeatures.lesson3.lambdas;

public class Messages {
    public static void main(String[] args) {

//        ErrorDisplay errorDisplay = new ErrorDisplay() {
//            @Override
//            public void displayError() {
//                System.out.println("big error");
//            }
//        };
//
        ErrorDisplay errorDisplay = () -> {
            System.out.println("big error");
        };

        errorDisplay.displayError();

        ErrorDisplayAdvanced errorDisplayAdvanced = new ErrorDisplayAdvanced() {

            @Override
            public void displayError(String massage) {

            }
        };

        errorDisplayAdvanced.displayError("unexpected error");


        ErrorMultiDisplay errorMultiDisplay = (message, code) -> {
          System.out.println(message);
          System.out.println(code);
        };
    }

}

