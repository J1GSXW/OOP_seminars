package presenters;

import models.Table;
import models.TableModel;
import views.BookingView;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver{

    private Model tableModel;
    private View bookingView;

    public BookingPresenter(Model tableModel, View bookingView) {
        this.tableModel = tableModel;
        this.bookingView = bookingView;
        bookingView.setObserver(this);
    }

    public Collection<Table> loadTables(){
        return tableModel.loadTables();
    }

    public void updateTablesUI(){
        bookingView.showTables(loadTables());
    }

    public void updateReservationResultUI(int reservationID){
        bookingView.printReservationResult(reservationID);
    }

    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        int reservationNo = tableModel.reservationTable(orderDate, tableNo, name);
        updateReservationResultUI(reservationNo);
    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        int newReservationNo = tableModel.changeReservationTable(oldReservation, reservationDate, tableNo, name);
        updateReservationResultUI(newReservationNo);
    }
}
