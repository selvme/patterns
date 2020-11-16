/**
 * Фасад - скрывает всю сложность системы путем сведения всех возможных внешних вызовов к одному объекту
 * делегирующему их соответствующим объектам.
 *
 */
public class Main {

    public static void main(String[] args) {
        ShowMeCostOfBitcoin show = new ShowMeCostOfBitcoin();
        show.showCost();
    }
}
class ShowMeCostOfBitcoin{

    // фасад, он будет управлять всеми объектами и контролировать выполнение

    private InitConnection connection = new InitConnection();
    private CoinMarketCap cost = new CoinMarketCap();;
    void showCost(){
        if (connection.isConnection()){
            System.out.println(cost.showMeCost());
        }else {
            connection.setConnection(true);
            System.out.println(cost.showMeCost());
        }
    }
}
class InitConnection{
    private boolean connection;
    InitConnection(){
        this.connection = false;
    }

    public boolean isConnection() {
        return connection;
    }

    public void setConnection(boolean connection) {
        this.connection = connection;
    }
}
class CoinMarketCap{
    String showMeCost(){
        return "123143424231424 $";
    }
}