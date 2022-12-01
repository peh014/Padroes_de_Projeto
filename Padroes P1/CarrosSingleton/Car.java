package CarrosSingleton;

public class Car {
    Nome  name; 
    Color color;
    Tire tire;
    Motor motor;    
    public Car(Nome name, Color color, Tire tire, Motor motor) {
        super();
        this.name = name;
        this.color = color;
        this.tire = tire;
        this.motor = motor;
    }
    Car(String name, Color color, Tire tire, Motor motor) {
    }    
    public Nome getName() {
	return name;
    }    
    public void setName(Nome name) {
	this.name = name;
    }
    public Color  getColor() {
	return color;
    }
    public void setColor(Color color) {
	this.color = color;
    }
    public Tire getTire() {
        return tire;
    }
    public void setRodas(Tire tire) {
	this.tire = tire;
    }
    public Motor getMotor() {
	return motor;
    }
    public void setMotor(Motor motor) {
    	this.motor = motor;
    }    
}
