package org.example.ResultFormatter;

/**
 * Класс ResultFormatter позволяет форматировать результаты математических операций для вывода пользователю.
 */
public class ResultFormatter {
    /**
     * Метод для форматированного вывода целочисленного результата.
     *
     * @param result Результат операции
     * @return Форматированная строка с результатом
     */
    public static String format(int result) {
        return String.format("Результат: %d", result);
    }

    /**
     * Метод для форматированного вывода вещественного результата.
     *
     * @param result Результат операции
     * @return Форматированная строка с результатом
     */
    public static String format(double result) {
        return String.format("Результат: %.2f", result);
    }
}