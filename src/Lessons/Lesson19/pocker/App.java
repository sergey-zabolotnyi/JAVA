package Lessons.Lesson19.pocker;

public class App {
    /*
    1, Напишите программу, которая должна имитировать раздачу карт для игры в покер.
    Программа получает число n, задаваемое с консоли пользователем,
    и раздает карты на n  игроков (по 5 карт каждому) из рассортированной колоды.
    Разделяйте пять карт, выданных каждому игроку, пустой строкой.
    - колода карт - массив данных
        - создать
        - наполнить
        - перемешать
    - ввод количества игроков
    - раздать карты игрокам
    - вывести информацию о картах у игроков
    колода карт - массив 52 карты (4 масти по 13 карт от 2 до туза)
    или двумерный массив, где первый индекс - количество игроков, второй индекс = 5 (количество карт у каждого игрока)
    или создаем класс Игрок у которого будет 5 карт и создадим массив из n элементов (количество игроков)

    1. Запускаем метод main
    2. создание экземпляра класса CardTable
    3. создание экземпляра класса Cards
    4. создание переменных
    Card[] deck = new Card[52];
    Card[] deckShuffle = new Card[52];
    5. запускается метод game из экземпляра класса cardTable
    6. запускается метод createDeck() из экземпляра класса cards
    7. метод  createDeck() с помощью своих локальных данных (массивов) заполняет данными массив deck,
    который является переменной экземпляра класса Cards
     */
    public static void main(String[] args) {
        CardTable cardTable = new CardTable();
        cardTable.game();
    }
}
