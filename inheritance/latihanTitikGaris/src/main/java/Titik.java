/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author praktikan
 */
public class Titik {
    private int koordX;
    private int koordY;
    public Titik(){
        this.koordX = 0;
        this.koordY = 0;
    }
    public Titik(int x, int y){
        this.koordX = x;
        this.koordY = y;
    }
    // GETTER KOORDX
    public int getKoordX(){
        return koordX;
    }
    public int getKoordY(){
        return koordY;
    }
    
    public void naik(){
        koordY++;
    }
    public void turun(){
        koordY--;
    }
    public void kanan(){
        koordX++;
    }
    public void kiri(){
        koordX--;
    }
    public String toString(){
        return "( "+koordX+" , "+koordY+" )";
    }
}
