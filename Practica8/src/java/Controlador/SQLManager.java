package models;

import java.sql.*;

public class SQLManager
{
  private Connection connection;
  private String sqlString;



  public SQLManager(String user, String pass)
      throws SQLException
  {
    DriverManager.registerDriver(new org.postgresql.Driver());
    String uri = "jdbc:postgresql://localhost:5432/edcortes";
    connection = DriverManager.getConnection(uri, user, pass);
  }
  public void closeConnection()
      throws SQLException
  {
    connection.close();
  }

  public void registerUser(User user)
      throws SQLException
  {
    sqlString = "INSERT INTO users " +
        "(fullname, username, pass, candidate) VALUES (\'" +
        user.getFullname() + "\', \'" +
        user.getUsername() + "\', \'" +
        user.getPass() + "\', " +
        user.getIsCandidate() + ");";
    Statement statement = connection.createStatement();
    statement.execute(sqlString);
  }

  private User getUser(String userId)
      throws SQLException
  {
    int id = Integer.parseInt(userId);
    User user = null;
    String fullname;
    String username;
    String pass;
    boolean isCandidate;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    preparedStatement =
        connection.prepareStatement("SELECT fullname FROM users WHERE id = ?;");
    preparedStatement.setInt(1, id);
    resultSet  = preparedStatement.executeQuery();
    while (resultSet.next())
    {
      if (!resultSet.getString("fullname").equals(""))
      {
        fullname = resultSet.getString("fullname");
        preparedStatement =
            connection.prepareStatement("SELECT username FROM users WHERE id = ?;");
        preparedStatement.setInt(1, id);
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next())
        {
          if (!resultSet.getString("username").equals(""))
          {
            username = resultSet.getString("username");
            preparedStatement =
                connection.prepareStatement("SELECT pass FROM users WHERE id = ?;");
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
              if (!resultSet.getString("pass").equals(""))
              {
                pass = resultSet.getString("pass");
                preparedStatement =
                    connection.prepareStatement(
                        "SELECT candidate FROM users WHERE id = ?;");
                preparedStatement.setInt(1, id);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next())
                {
                  if (!resultSet.getString("candidate").equals(""))
                  {
                    isCandidate = Boolean.parseBoolean(
                        resultSet.getString("candidate"));

                    user = new User(id, fullname, username, pass, isCandidate);
                  }
                }
              }
            }
          }
        }
      }
    }
    return user;
  }

  public User login(String username, String pass)
      throws SQLException
  {
    User user = null;
    ResultSet resultSet;
    PreparedStatement preparedStatement =
        connection.prepareStatement("SELECT id " +
            "FROM users " +
            "WHERE username = ? AND pass = ?;");
    preparedStatement.setString(1, username);
    preparedStatement.setString(2, pass);
    resultSet = preparedStatement.executeQuery();
    while (resultSet.next())
    {
      if (!resultSet.getString("id").equals(""))
      {
        user = getUser(resultSet.getString("id"));
      }
    }
    return user;
  }

  public void poll(Ticket ticket)
      throws SQLException
  {
    sqlString = "INSERT INTO tickets (vote_from, vote_to) VALUES (\'" +
        ticket.getVoteFrom() + "\', \'" +
        ticket.getVoteTo() + "\');";
    Statement statement = connection.createStatement();
    statement.execute(sqlString);
  }
  public ResultSet getPolls(String username)
      throws SQLException
  {
    sqlString = "SELECT count(1) AS votes FROM tickets WHERE vote_to = ?;";
    PreparedStatement preparedStatement =
        connection.prepareStatement(sqlString);
    preparedStatement.setString(1, username);
    return preparedStatement.executeQuery();
  }
}
