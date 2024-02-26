package ru.job4j.oop;

public class Error {

    private boolean active;
    private int status;
    private String message;

    public Error() {
        active = true;
        status = 11;
        message = "some message error eleven";
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error eleven = new Error();
        eleven.printInfo();
        Error twelve = new Error(false, 12, "some message error twelve");
        twelve.printInfo();
    }

    public void printInfo() {
        System.out.println("Состояние: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }
}
