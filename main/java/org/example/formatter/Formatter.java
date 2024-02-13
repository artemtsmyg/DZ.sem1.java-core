package org.example.formatter;

/**
 * Создаем класс для форматированного вывода результатов в отдельном пакете
 */
public class Formatter {
    public static String format(int result) {
        return String.format("Результат: %d", result);
    }

    public static String format(double result) {
        return String.format("Результат: %.2f", result);
    }
}