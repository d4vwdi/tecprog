import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        float temp[] = new float[8]; // Esse Array é criado levando em consideração que os graus Celsius são medidos em decimais
        int temps []= new int[7]; // Esse segundo Array é criado para armazenar os valores de temperatura, mas convertidos para inteiro, para fins de comparação
        float media = 0; // A média será realizada com os graus Celsius em decimais e posteriormente convertida em inteiros, para fins de comparação
        int diasAcima = 0, diasAbaixo = 0, controle; // O número de dias é sempre inteiro (não existe um 1,5 dia ou 3,4 dias), porém não será possível dizer quantos dias foram acima ou abaixo da média global se os dados forem de tipos diferentes

        for (controle = 0; controle < 7; controle++) {
            temp[controle] = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a temperatura do: " + (controle + 1) + "º dia:"));

            temps[controle] = Math.round(temp[controle]);

            media += temp[controle];
        } //Dentro do laço recebe-se o input das temperaturas ao longo de 7 dias, os valores serão armazenados em um vetor de tamanho 1 a 7. Após isso o tipo de dado é alterado de decimal para inteiro através de uma aproximação, isto será útil para contarmos a quantidade de dias acima ou abaixo da média global. Por último, o valor da média, anteriormente 0, será a soma dos inputs cada vez que o laço é realizado.

        media /= 7; //Aqui temos de fato o valor da média geral das temperaturas

        int mediaint = Math.round(media); //De maneira semelhante à temperatura em si, aqui é feito uma aproximação da média global, esse valor será utilizado na comparação

        for(controle = 0; controle < 7; controle ++){
            if (temps[controle]>=mediaint){
                diasAcima++;
            };
            if (temps[controle]<mediaint){
                diasAbaixo++;
            }

        } //Ao fim do laço será exibido a quantidade de dias que apresentaram temperatura acima ou abaixo da média, em números inteiros, uma vez que não podemos quebrar o número de dias em decimais (i.e. 3,4 dias por exemplo)

        JOptionPane.showMessageDialog(null, "A média das temperaturas é: " + media);
        JOptionPane.showMessageDialog(null, "A quantidade de dias que a temperatura ficou acima da média é: " + diasAcima);
        JOptionPane.showMessageDialog(null, "A quantidade de dias que a temperatura ficou abaixo da média é: " + diasAbaixo);
        //Agora é só apresentar o resultado do exercício
    }


}

