public class Main {
    public static void main(String[] args) {
        //Задание 6
        System.out.println("Задание №6");
        var boxer1Wegith = 78.2;
        var boxer2Wegith = 82.7;
        System.out.println("Общий вес двух бойцов: "+(boxer1Wegith + boxer2Wegith));
        System.out.println("Разница в весе двух бойцов: "+(boxer2Wegith - boxer1Wegith));
        //Задание 7
        System.out.println("Задание №7");
        System.out.println("Разница в весе двух бойцов (1 способ): "+(boxer2Wegith - boxer1Wegith));
        System.out.println("Разница в весе двух бойцов (2 способ): "+(boxer2Wegith % boxer1Wegith));
        //Задание 8
        System.out.println("Задание №8");
        var totalWorkingHours = 640;
        var hoursPerDay = 8;
        var totalEmploeers = totalWorkingHours / hoursPerDay;
        System.out.println("Всего работников в компании - "+totalEmploeers+" человек");
        totalEmploeers = totalEmploeers + 94;
        totalWorkingHours = totalEmploeers * hoursPerDay;
        System.out.println(" Если в компании работает " + totalEmploeers + " человека то всего " + totalWorkingHours + " часа работы может быть поделено между сотрудниками");
    }
}