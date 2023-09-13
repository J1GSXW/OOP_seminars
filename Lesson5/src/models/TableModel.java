package models;

import presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

public class TableModel implements Model {

    private Collection<Table> tables;


    /**
     * Получить список всех столиков
     * @return коллекция столиков
     */
    public Collection<Table> loadTables(){

        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate дата
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table: loadTables()) {
            if(table.getNo() == tableNo){
                Resevation resevation = new Resevation(reservationDate, name);
                table.getResevations().add(resevation);
                return resevation.getId();
            }
        }
        //throw new RuntimeException("Некорректный номер столика");
        return -1;
    }

    /**
     Действие клиента (пользователь нажал на кнопку отмены бронирования)
     @param oldReservation идентификатор бронирования (старый)
     @param reservationDate дата бронирования
     @param tableNo номер столика
     @param name имя
     @return номер брони
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        for (Table table: loadTables()) {
            for (Resevation resevation : table.getResevations()) {
                if(resevation.getId() == oldReservation){
                    table.getResevations().remove(resevation);
                    Resevation newResevation = new Resevation(reservationDate, name);
                    table.getResevations().add(newResevation);
                    return newResevation.getId();
                }
            }
        }
        return -1;
    }
}
