package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic peppy = new DummyDic();
        String word = peppy.engToRus("echo");
        System.out.println(word);
    }
}
