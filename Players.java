public class Players {

    public String name;
    public char symbol;

    public Players(String name, char symbol){
        this.name = name;
        this.symbol = symbol;
    }

    public void displayInfo() {
        System.out.print("Name: "+ name + ", \nSymbol: "+ symbol);
        }
        
    }