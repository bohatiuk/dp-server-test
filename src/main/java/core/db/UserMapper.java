package core.db;

import core.Config;
import core.VideoDecoder;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserMapper extends AbstractDataMapper {

    public UserMapper(Connection con) {
        super.conn = con;
    }

    public boolean select(String userName, String password) {
        String query = "SELECT COUNT (*) AS rowcount FROM" + Config.dbUserTable + " WHERE user_name = " + userName + " AND user_password = "
                + password + ";";

        Statement stmt = null;
        try {
            stmt = conn.createStatement();

            ResultSet resultSet = stmt.executeQuery(query);
            resultSet.next();
            int rowCount = resultSet.getInt("rowcount");
            stmt.close();
            return rowCount > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return false;
    }



}
