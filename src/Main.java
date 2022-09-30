public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 1");
        System.out.println("Задание №1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }


        System.out.println("Задание №2");
        age = 25;
        if (age >= 7) {
            System.out.println("ребенок ходит в школу");
        }
        if (age >= 18) {
            System.out.println("Вы уже закончили школу и можете отправляться в университет");
        }
        if (age >= 24) {
            System.out.println("Вы уже окончили университет и Вам пора искать первую работу");
        }

        //В данной задаче код написала согласно заданию, хотя на человеческом языке
        // надо было писать в условии задания : если возраст больше или равно 7  и меньше 18- ребенок ходит в школу
        // если возраст больше или равно 18 но меньше 24 то иди в универ
        // иначе ищи работу. Тогда и код и выполнение кода были бы логичными

        System.out.println("Задание №3");
        int capacityWagon = 102;
        int seating = 60;
        int standing = capacityWagon - seating;
        int numberPassengers = 103;
        if (numberPassengers < 60) {
            System.out.println("В вагоне  есть и сидячие и стоячие места");
        } else if (numberPassengers < 102 && numberPassengers >= 60) {
            System.out.println("В вагоне  есть стоячие места");
        } else {
            System.out.println("В вагоне  нет свободных мест");
        }
        System.out.println("Домашнее задание - №2");
        System.out.println("Задание 1");
        int age1 = 17;
        if (age1 >= 18) System.out.println("Поздравляем с совершеннолетием");
        else {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }

    }
}