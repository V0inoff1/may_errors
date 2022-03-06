public class Main {
    public static void main(String[] args) {
        System.out.println(sameLength("Petro "));// так как мы создали метод sameLength и описали его параметры как (String text),
        // то при вызаве метода
    }

    public static boolean sameLength(String text) { //  мы передаем текстовое значение Petro Petya в ячейку text
        String[] parts = text.split(" ");// в массив parts будет передаваться разделение текста на две части из переменной text ["Petrov", " Petya"]

        // создаем свой тип ошибки и условия для вызова данной ошибки
        if (parts.length != 2) { // if (если) длинна (length) массива (parts) не ровна двум (!=2)
            throw new NameInputException(text); // Мы создали отдельный класс NameInputException,
            // и в данном классе создали метод NameInputException, в котором создали конструктор, который обращается к главному классу ошибок и выдает от туда сообщение
            // RuntimeException e = new RuntimeException(" В параметре надо указать имя и фамилию, но было указано : " + text ); //Создаем обьект  класса ( отчета) RuntimeException, данный обьект поместим в переменную е, после чего
            // создаем new обьект  типа  RuntimeException()
            //throw e; // вынесение значения в e
        }
        String name = parts[1]; // слово в массиве parts с индексом 1 (Petya)  помещается в переменную name
        String lastName = parts[0];// слово в массиве parts с индексом 0 (Petrov)  помещается в переменную lastName
        return name.length() == lastName.length();// return означает, что возврашвем в программу ответ на задачу name.length()==lastName.length().
        // В данной задаче мы сравниваем длинну двух переменных name и lastName. Так как у нас метод типа boolean, то в возвращеенным ответом
        // будет либо true, либо false
    }
}
