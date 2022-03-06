
public class NameInputException extends RuntimeException{ // extends RuntimeException говорит о том, что наш класс является наследником класса типа ошибки RuntimeException

    public  NameInputException (String text){
        super (" В параметре надо указать имя и фамилию, но было указано : " + text);
    }
}
