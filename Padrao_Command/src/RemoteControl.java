



public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;    
    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
        
        Command noCommand = new NoCommand();        
        for(int i = 0; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }    
    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }    
    public void onButtonWasPushed(int slot){
        if(onCommands[slot] != null){
            onCommands[slot].execute();
        }        
    }    
    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
    }    
    public String toString(){
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n-- Remote Control --\n");
        for(int i = 0; i < onCommands.length; i++){
	stringBuff.append("[slot " + i + "] "+ onCommands[i].getClass().getName()+ " " + offCommands[i].getClass().getName() +"\n");
        }
        return stringBuff.toString();
    }

    void setCommand(int i, CeilingFanOnCommand ceilingFanOn, CeilingFanOffCommand ceilingFanOff) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCommand(int i, StereoOnWithCDCommand stereoOnWithCD, StereoOffWithCDCommand stereoOffWithCD) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void undoButtonWasPushed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
