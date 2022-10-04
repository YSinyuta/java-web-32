import database.DBServices;
import entity.Discipline;
import entity.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DBServices services = new DBServices();
        services.createStudent("Иванов","Евгений","КТ-21","2022-09-14");
    }
}
