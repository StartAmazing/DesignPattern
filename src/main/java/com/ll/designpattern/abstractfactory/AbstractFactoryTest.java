package com.ll.designpattern.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        IDatabaseUtils iDatabaseUtils = new OracleDatabaseUtil();
        IConnection connection = iDatabaseUtils.getConnection();
        connection.connect();
        ICommand command = iDatabaseUtils.getCommand();
        command.command();
    }
}

//      变化的： mysql, oracle , ....
//      不变化的：  connection,  commanda
interface IConnection {
    void connect();

}
class MysqlConnection implements IConnection {
    @Override
    public void connect() {
        System.out.println("Mysql connected. ");
    }
}
class OracleConnection implements IConnection {
    @Override
    public void connect() {
        System.out.println("Oracle connected. ");
    }
}

interface ICommand {
    void command();
}
class MysqlCommand implements ICommand {
    @Override
    public void command() {
        System.out.println("Mysql Command send. ");
    }
}
class OracleCommand implements ICommand {
    @Override
    public void command() {
        System.out.println("Oracle Command send. ");
    }
}

interface IDatabaseUtils{
    IConnection getConnection();
    ICommand getCommand();
}
class MysqlDatabaseUtil implements IDatabaseUtils {

    @Override
    public IConnection getConnection() {
        return new MysqlConnection();
    }

    @Override
    public ICommand getCommand() {
        return new MysqlCommand();
    }
}
class OracleDatabaseUtil implements IDatabaseUtils {

    @Override
    public IConnection getConnection() {
        return new OracleConnection();
    }

    @Override
    public ICommand getCommand() {
        return new OracleCommand();
    }
}

