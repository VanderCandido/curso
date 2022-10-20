import java.io.Serializable;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class endereço implements Serializable
{
    public String rua;
    public int numero;

    public endereço(String rua, int numero)
    {
        this.r = rua;
        this.n = numero;
    }
}

public class Main {
    public static void main(String[] args)
    {
        endereço r = new endereço("marechal deodoro",280);
        try
        {
            FileOutputStream dados = new FileOutputStream("dados.ser");
            ObjectOutputStream out = new ObjectOutputStream(dados);

            out.writeObject(endereço);
            out.close();
            dados.close();

            System.out.println("O objeto foi serializado");
        }

        catch(IOException erro)
        {
            System.out.println("Erro");
        }

        emdereço r;

        try
        {
            FileInputStream dados = new FileInputStream("dados.ser");
            ObjectInputStream in = new ObjectInputStream(dados);

            r = (endereço)in.readObject();
            in.close();
            dados.close();

            System.out.println("O objeto foi desserializado");
            System.out.println(p1.nome);
            System.out.println(p1.idade);

        }

        catch(IOException erro)
        {
            System.out.println("Erro 1");
        }
        
        catch (ClassNotFoundException erro) 
        {
            System.out.println("Erro 2");
        }
        
    }
}
