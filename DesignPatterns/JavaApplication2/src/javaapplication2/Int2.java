
package javaapplication2;


    public class Int2 implements Car {

	private String carType = "Automatic";
	public void turnon() {
		System.out.println("turn on the automatic car");
	}
	public void turnoff() {
		System.out.println("turn off the automatic car");
	}
	public String getcartype() {
		return this.carType;
	}
        public void setcartype(String type){
            this.carType = type;
            
        }

    
}

