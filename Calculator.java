/** 
    Класс реализует калькулятор
*/
public class Calculator {
    
    /**
        Результат вычислений 
    */
    private int result;
    
    /**
        Суммирует аргументы
        @param params аргументы суммирования
    */
    public void add(int... params) {
        for(Integer param: params) {
            result += param;
        }
    }
    
    /**
        Получить результат
        @return результат вычисления
    */
    public int getResult() {
        return result;
    }
    
    /**
        Очистить резултат вычисления
    */
    public void clearResult() {
        this.result = 0;
    }

}
