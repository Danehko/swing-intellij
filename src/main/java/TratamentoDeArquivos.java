import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

// padrao de escrita i:1,p:1:2;

public class TratamentoDeArquivos {
    public boolean lerArquivo(String nomeArq) {
        File arquivo;
        try {
            arquivo = new File(nomeArq);
            Scanner leitor = new Scanner(arquivo);

            //varrendo o arquivo linha por linha at´e chegar no final do mesmo
            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }

            leitor.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
    /* a = 0
            while a != -1:
            if d.find('/') != (-1):
    d = d[:d.find('/')] + d[d.find('/')+1:]
    elif d.find(' ') != (-1):
    d = d[:d.find(' ')] + d[d.find(' ')+1:]
    elif d.find('.') != (-1):
    d = d[:d.find('.')] + d[d.find('.')+1:]
    elif d.find(':') != (-1):
    d = d[:d.find(':')] + d[d.find(':')+1:]
            else:
    a = -1
    d = d[2:4] + d[:2] + d[4:]
    print(d)
    return int(d) */

    public boolean escreverArquivo(String nomeArq) {
        File arquivo;
        try{
            arquivo = new File(nomeArq);
            FileWriter fwArquivo = null;

            if (arquivo.exists() == true) {// Abre para adicionar dados
            fwArquivo = new FileWriter(arquivo, true);
            }else{ // se n~ao existir, ent~ao cria o arquivo
            fwArquivo = new FileWriter(arquivo);
            }
            BufferedWriter bw = new BufferedWriter(fwArquivo);
            bw.write("Ol´a mundo\n");

            // fechando arquivo
            bw.close();
            fwArquivo.close();
            }
            catch(Exception e){
                return false;
            }
            return true;
    }
}


