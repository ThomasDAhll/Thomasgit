/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FX;

import Control.Control;
import FX.Animate.Enemy;
import FX.Animate.Hero;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


/**
 *
 * @author tadah
 */
public class NewFXMain extends Application {
    
    
   public void updater(Hero he, Enemy en, Label a,Label b, Label c, Label d, Image e, ImageView f, TextArea g){
          Control cont = new Control();
          a.setText(" HP "+Integer.toString(he.getHealth()));
          b.setText(" HP "+Integer.toString(he.getMana()));
          c.setText(" HP "+Integer.toString(en.getHealth()));
          d.setText(" HP "+Integer.toString(en.getMana()));
          e = new Image(cont.getRActiveImg()); 
          f.setImage(e);
          g.setText(Control.getOut());
          
   }
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        
        Control cont = new Control();
        GridPane grid = new GridPane();
        Scene scene = new Scene(grid, 1200, 800);
        Hero hero = new Hero();
        Enemy enemy = new Enemy();
        
        cont.setRActiveImg(enemy.getCreatureImg());
        //STATUSBARER
            
        Label hName = new Label (hero.getName());
        Label health = new Label(" HP "+Integer.toString(hero.getHealth()));
        Label mana = new Label (" MP "+Integer.toString(hero.getMana()));
        
        Label eName = new Label (enemy.getName());
        Label eHealth = new Label(" HP "+Integer.toString(enemy.getHealth()));
        Label eMana = new Label (" MP "+Integer.toString(enemy.getMana()));
        
        health.setFont(Font.font ("Verdana", 35));
        mana.setFont(Font.font ("Verdana", 35)); 
        eHealth.setFont(Font.font ("Verdana", 35));
        eMana.setFont(Font.font ("Verdana", 35));
        hName.setFont(Font.font ("Verdana", 50));
        eName.setFont(Font.font ("Verdana", 50));
         
        VBox sLBox = new VBox(health,mana);
        HBox sLHBox = new HBox(hName,sLBox);
        VBox sRBox = new VBox(eHealth,eMana);
        HBox sHHBox = new HBox(eName,sRBox);
        
        //BILDER
        
        Image hImg =new Image(hero.getCreatureImg());
        ImageView heroImg = new ImageView(hImg);
        heroImg.setFitHeight(scene.getHeight()/1.5);
        heroImg.setFitWidth(scene.getWidth()/4);
        
        Image eImg = new Image(cont.getRActiveImg());
        ImageView enemyImg = new ImageView(eImg);
        enemyImg.setFitHeight(scene.getHeight()/1.5);
        enemyImg.setFitWidth(scene.getWidth()/4);
	
        //TEXT
        
        TextArea text = new TextArea("WELCOME TO THE DUNGEON");
        text.setWrapText(true);
        text.setFont(Font.font ("Verdana", 30));
        text.setMinSize(scene.getWidth()/3, scene.getHeight()/2);
        
        //KNAPPER
        
        Button act1 = new Button("Attack");
        Button act2 = new Button("Action2");
        Button act3 = new Button("Action3");
        Button act4 = new Button("Action4");
        
        act1.setMinSize(scene.getWidth()/4, scene.getHeight()/10);
        act2.setMinSize(scene.getWidth()/4, scene.getHeight()/10);
        act3.setMinSize(scene.getWidth()/4, scene.getHeight()/10);
        act4.setMinSize(scene.getWidth()/4, scene.getHeight()/10);
      
        HBox actH = new HBox(act1,act2);
        HBox actH2 = new HBox(act3,act4);
        VBox actions = new VBox (actH,actH2);
        
        //GridPlassering
  
            grid.add(sLHBox, 0, 0);
            grid.add(sHHBox, 4, 0);
            grid.add(heroImg, 0, 1);
            grid.add(text, 2,1);
            grid.add(enemyImg, 4,1);
            grid.add(actions, 2, 2);
       
        //KNAPPER
            
            act1.setOnAction(new EventHandler<ActionEvent>() {
        
            @Override
            public void handle(ActionEvent event) {
                hero.dealDamage(enemy);
                updater(hero, enemy, health, mana, eHealth, eMana, eImg, 
                        enemyImg,  text);
              
            }
        });
  
         primaryStage.setTitle("FX");
         primaryStage.setScene(scene);
         primaryStage.show();

        
        
        
        

        
    
        
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
