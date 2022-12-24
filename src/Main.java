public class Main {
    public static void main(String[] args) {
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var boxers = boxerOne + boxerTwo;
        System.out.println("Общий вес " + boxers + "кг! ");

        var boxer = boxerTwo - boxerOne;
        System.out.println(boxer);
        var difference = (boxerTwo - boxerOne) % boxers;
        System.out.println(difference);

        var worker = 640 / 8;
        System.out.println("Всего работников в компании " + worker + " человек ");

        var workers = worker + 94;
        System.out.println(workers);
        var time = 174 * 8;
        System.out.println("Если в компании работает " + workers + " человек,то всего "  + time + " часов работы может быть поделено между сотрудниками");

    }
}
