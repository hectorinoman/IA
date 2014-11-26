/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.map;

import entities.Entity;
import entities.EntityR2D2;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author Jaime
 */
public class Evironment extends JPanel {
    private JLabel floorLayer_[][];  //  Tablero del suelo
    private JLabel entityLayer_[][]; //  Tablero de entidades
    int dimX_, dimY_;           //  Dimensiones del tablero
    
    private Entity agents_[];   //  Lista de agentes y obstáculo
    int nAgents_;               //  Lúmero de agentes obstáculo
    private Entity mainAgent_;  //  Agente principal (robot) (R2D2)
    
    
    private final ImageIcon floorTile_=new ImageIcon(   //  Tile que
            getClass()                                  //  representa
                    .getResource("defensive.png"));     //  el suelo

    
    
    
    private void init_vars(){
        JLabel thumb= new JLabel();
        thumb.setIcon(new ImageIcon(getClass().getResource("defensive.png")));
        this.add(thumb,new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0,32,32));
        setVisible(true);
        Entity mainAgent_=new EntityR2D2();
    }
    
    private void floorGen(){
        floorLayer_= new JLabel[dimX_][dimY_];
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        for (int i = 0; i < dimX_; i++) {
            for (int j = 0; j < dimY_; j++) {
                floorLayer_[i][j]=new JLabel();
                floorLayer_[i][j].setIcon(floorTile_);
                add(floorLayer_[i][j],new AbsoluteConstraints(i*32, j*32,32,32));
            }
        }
    }
    
    
    
    public Evironment(){
        super();
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }
    
}
