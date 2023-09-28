/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author FA20-BSE-037
 */
    public class Int1 implements Car {

	private String carType = "Manual";
	public void turnon() {
		System.out.println("turn on the manual car");
	}
	public void turnoff() {
		System.out.println("turn off the manual car");
	}
	public String getcartype() {
		return this.carType;
	}
        public void setcartype(String type){
            carType = type;
            
        }
}
    

