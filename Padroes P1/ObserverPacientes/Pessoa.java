package CalcPaciente;
import java.util.Observable;
import java.util.Observer;
public class Pessoa implements Observer{
    double altura;
    double peso;

    public void update(double peso, double altura) {
    	this.peso = peso;
	this.altura = altura;	
    }
    public String calculoImc() {
	double imc = (this.peso /((this.altura)*(this.altura)));
	String mensagem = "";
	if (imc < 18.5) 
    {
            mensagem = "O IMC está : " + String.valueOf(imc) + " abaixo do peso ideal";
	} 
    else if (imc <= 24.9 || imc >= 18.5)
    {
            mensagem = "O IMC está : " + String.valueOf(imc) + " Peso normal";
	} 
    else if (imc <= 29.9 || imc >= 25.0) 
    {
            mensagem = "O IMC está : " + String.valueOf(imc) + " pre obesidade";
	} 
    else if (imc <= 34.9 || imc >= 30.0) 
    {
            mensagem = "O IMC está : " + String.valueOf(imc) + " obesidade grau 1";
	}
    else if (imc <= 39.9 || imc >= 35.0) 
    {
            mensagem = "O IMC está : " + String.valueOf(imc) + " obesidade grau 2";
	}
    else if (imc >= 40) 
    {
            mensagem = "O IMC está : " + String.valueOf(imc) + " obesidade grau 3";
	}

    
        return mensagem;
	}
    @Override
    public void update(Observable o, Object arg) {
    }





}
