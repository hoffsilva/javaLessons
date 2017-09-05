/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.hoffsilva.controller;

/**
 *
 * @author ra21652435
 */
public class CalculadoraConsumo {
    
    private double time;
    private double consumption;
    private double distance;

    public CalculadoraConsumo(double time, double consuption, double distance) {
        this.time = time;
        this.consumption = consuption;
        this.distance = distance;
    }
    
    public CalculadoraConsumo(String timeS, String consumptionS, String distanceS ) {
        this(new Double(timeS), new Double(consumptionS), new Double(distanceS));
    }
    
    public double getSpeedAverage() {
        return distance / time;
    }
    
    public double getConsumtionAverage() {
        return distance / consumption;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
   
    
    
    
}
