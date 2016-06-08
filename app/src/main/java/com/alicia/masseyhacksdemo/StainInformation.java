package com.alicia.masseyhacksdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Sam on 5/22/2016.
 */
public class StainInformation extends AppCompatActivity{

    Bundle extras;
    String str1, str2, str3;
    TextView txt1, txt2, txt3, txt4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stain_information);
        extras = getIntent().getExtras();
        str1 = extras.getString("str1");
        str2 = extras.getString("str2");
        str3 = extras.getString("str3");
        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);
        txt4 = (TextView) findViewById(R.id.txt4);
        //str2: material
        //str3: stain
        //the only important strings are str2 and str3 b/c they're the material and the stain
        //figures out what the user's situation is
        String output1 = "", output2 = "", output3 = "", output4 = "";
        switch(str3) { //stain type
            case "Blood":
                switch(str2) {
                    case "Cotton":
                        output1 = "Run under cold water\n" +
                                "Hold cotton taut and run under the coldest possible water";
                        output2 = "Rub stain with fingers while rinsing\n" +
                                "Rub the fabric to remove some of the blood";
                        output3 = "Rub soap into the stain and continue scrubbing\n" +
                                "This removes most of the blood, but the stain will remain";
                        output4 = "Some things you can use to actually remove the stain:\n" +
                                "-Salt\n-A paste of baking soda and water\n-Vinegar";
                        break;
                    default:
                        output1 = "Rub salt water on the stain\n" +
                                "Cover stain with water, then sprinkle salt on stain and scrub with fingers";
                        output2 = "Use toothpaste with dry blood\n" +
                                "Best for materials that are machine washable, but can work in general";
                        break;
                }
                break;
            case "Chocolate":
                output1 = "For washable fabrics:\nGently wipe excess chocolate from the top of the stain, being careful NOT to press into the stain.";
                output2 = "Flush out as much as possible using cold water applied to the BACK of the stain, then wash normally.";
                output3 = "For non-washable fabrics:\nWait for the chocolate to dry completely, then use a towel to blot the stain until it's relatively clear. Don't get the area too wet.";
                break;
            case "Coffee":
                output1 = "There are a few things you can use for coffee stains.\nClub Soda\nBlot until the stain is completely removed";
                output2 = "Beer\nRub a little beer on the stain and rub slightly. Repeat until stain is removed.";
                output3 = "Vinegar\nFor larger stains, soak in a 3 parts vinegar 1 part water solution overnight.";
                output4 = "Egg Yolk\nRub a beaten egg yolk into the stain. Rinse with water.";
                break;
            case "Lipstick":
                output1 = "Scrape off any lipstick\nUse a blunt knife or a dull edge.";
                output2 = "Apply a small amount of liquid detergent directly to the stain.";
                output3 = "Spray some basic stain remover on both sides of the stain, and rinse in warm water, while blotting.";
                output4 = "Wash normally once the stain has been removed.";
                break;
            case "Mud":
                output1 = "Allow the mud to dry completely, DO NOT attempt to wipe away wet mud. When dry, scrape off excess and be careful not to grind the dirt into the fabric.";
                output2 = "Gently brush at dried mud with a toothbrush or other brush.";
                output3 = "Put a few drops of liquid dish soap on the stain, and add a few drops of water. Using the brush, rub soap into both sides of the stain, using circular motions.";
                output4 = "Wash the clothes and repeat the steps if necessary.";
                break;
            case "Tomato Sauce":
                output1 = "Remove as much of the excess as possible from the fabric. If the fabric is washable, run cold water through the back of the stain.";
                output2 = "DON'T run through the front of the stain. Rub a liquid detergent into the stained portion.";
                output3 = "Apply a some stain remover, and allow to sit for at least 5 minutes. Wash normally with detergent.";
                output4 = "Before drying, make sure the stains are gone, or they'll become permanent when dry. If they are not gone, rub detergent into the stains and soak for 30 minutes.";
                break;
            case "Grass":
                output1 = "Pre wash with a vinegar-water solution\nFor every one part vinegar use 2 parts water and let sit for 15 minutes.";
                output2 = "Use a toothbrush\nWork the solution into the fabric with a toothbrush or towel.";
                output3 = "Launder with like fabrics\nUse a standard laundry soap.";
                break;
            case "Grease":
                output1 = "Apply a biological detergent to the stain and rub gently.";
                output2 = "Wash the clothes in the hottest possible water, and make sure the stain has been completely removed before drying.";
                output3 = "If the stains are not gone before drying, repeat the process.";
                break;
            case "Wine":
                output1 = "Blot, don’t rub\n" +
                        "Dab at the stain with a damp, cotton cloth. (Rubbing is the wrong move because it will actually set the stain.)";
                output2 = "Sprinkle salt\n" +
                        "Coat the stain with a generous amount of salt and let sit for at least five minutes to allow the salt to start absorbing the liquid.";
                output3 = "Add boiling water\nPour from a height of at least 8 inches (to flush out the stain).";
                output4 = "Machine wash\nUsing the hottest possible setting.";
                break;


        }
        txt1.setText(output1);
        txt2.setText(output2);
        txt3.setText(output3);
        txt4.setText(output4);
    }



}