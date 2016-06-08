package com.alicia.masseyhacksdemo;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by alici on 5/21/2016.
 */
public class Laundry extends AppCompatActivity {
    Button bt1, bt2, bt3, bt4, bt5;
    Boolean open1 = false, open2= false, open3 = false, open4 = false, open5 = false;
    Button a1,a2,a3,a4,b1,b2,b3,b4,c1,c2,c3,d1,d2,d3,d4,d5,e1,e2;
    Boolean ba1 = false,ba2 = false,ba3 = false,ba4 = false,bb1 = false,bb2 = false,bb3 = false,bb4 = false,bc1 = false,bc2 = false,bc3 = false,bd1 = false,bd2 = false,bd3 = false,bd4 = false,bd5 = false,be1 = false,be2 = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry);
        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(open1 == false) {
                    a1 = (Button) findViewById(R.id.spon1);
                    a1.setVisibility(View.VISIBLE);
                    a1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(ba1==false) {
                                a1.setBackgroundResource(R.drawable.button_boarder);
                                a1.setText("Hand wash only");
                                ba1=true;
                            }else{
                                a1.setBackgroundResource(R.drawable.handwash);
                                a1.setText(null);
                                ba1=false;
                            }
                        }
                    });
                    a2 = (Button) findViewById(R.id.spon2);
                    a2.setVisibility(View.VISIBLE);
                    a2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(ba2==false) {
                                a2.setBackgroundResource(R.drawable.button_boarder);
                                a2.setText("Do NOT machine wash");
                                ba2=true;
                            }else{
                                a2.setBackgroundResource(R.drawable.dont_machine_wash);
                                a2.setText(null);
                                ba2=false;
                            }
                        }
                    });
                    a3 = (Button) findViewById(R.id.spon3);
                    a3.setVisibility(View.VISIBLE);
                    a3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(ba3==false) {
                                a3.setBackgroundResource(R.drawable.button_boarder);
                                a3.setText("Machine wash in cold water");
                                ba3=true;
                            }else{
                                a3.setBackgroundResource(R.drawable.cold_wash);
                                a3.setText(null);
                                ba3=false;
                            }
                        }
                    });
                    a4 = (Button) findViewById(R.id.spon4);
                    a4.setVisibility(View.VISIBLE);
                    a4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(ba4==false) {
                                a4.setBackgroundResource(R.drawable.button_boarder);
                                a4.setText("Machine wash in warm water");
                                ba4=true;
                            }else{
                                a4.setBackgroundResource(R.drawable.cold_washa);
                                a4.setText(null);
                                ba4=false;
                            }
                        }
                    });

                    RelativeLayout.LayoutParams p = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT);

                    p.addRule(RelativeLayout.BELOW, R.id.spon4);

                    bt2.setLayoutParams(p);
                    bt2.getLayoutParams().height = 270;
                    bt2.getLayoutParams().width = 980;

                    open1 = true;
                }else{
                    a1.setVisibility(View.GONE);
                    a2.setVisibility(View.GONE);
                    a3.setVisibility(View.GONE);
                    a4.setVisibility(View.GONE);

                    open1 = false;
                }
            }
        });
        bt2=(Button)findViewById(R.id.bt2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(open2 == false) {
                    b1 = (Button) findViewById(R.id.spon21);
                    b1.setVisibility(View.VISIBLE);
                    b1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (bb1 == false) {
                                b1.setBackgroundResource(R.drawable.button_boarder);
                                b1.setText("Do not tumble dry");
                                bb1 = true;
                            }else{
                                b1.setBackgroundResource(R.drawable.dont_tumble);
                                b1.setText(null);
                                bb1 = false;
                            }

                        }
                    });

                    b2 = (Button) findViewById(R.id.spon22);
                    b2.setVisibility(View.VISIBLE);
                    b2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(bb2 == false) {
                                b2.setBackgroundResource(R.drawable.button_boarder);
                                b2.setText("Tumble dry, low heat");
                                bb2 = true;
                            }else{
                                b2.setBackgroundResource(R.drawable.tumble_dry);
                                b2.setText(null);
                                bb2 = false;
                            }
                        }
                    });
                    b3 = (Button) findViewById(R.id.spon23);
                    b3.setVisibility(View.VISIBLE);
                    b3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(bb3 ==false) {
                                b3.setBackgroundResource(R.drawable.button_boarder);
                                b3.setText("Tumble dry, medium heat");
                                bb3 = true;
                            }else{
                                b3.setBackgroundResource(R.drawable.dry_med);
                                b3.setText(null);
                                bb3 = false;
                            }
                        }
                    });
                    b4 = (Button) findViewById(R.id.spon24);
                    b4.setVisibility(View.VISIBLE);
                    b4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(bb4 == false) {
                                b4.setBackgroundResource(R.drawable.button_boarder);
                                b4.setText("Tumble dry, high heat");
                                bb4 = true;
                            }else{
                                b4.setBackgroundResource(R.drawable.dry_high);
                                b4.setText(null);
                                bb4 = false;
                            }
                        }
                    });

                    RelativeLayout.LayoutParams p = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT);

                    p.addRule(RelativeLayout.BELOW, R.id.spon24);

                    bt3.setLayoutParams(p);
                    bt3.getLayoutParams().height = 270;
                    bt3.getLayoutParams().width = 980;

                    open2 = true;
                }else{
                    b1.setVisibility(View.GONE);
                    b2.setVisibility(View.GONE);
                    b3.setVisibility(View.GONE);
                    b4.setVisibility(View.GONE);
                    open2 = false;
                }
            }
        });
        bt3=(Button)findViewById(R.id.bt3);
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(open3 == false) {
                    c1 = (Button) findViewById(R.id.spon31);
                    c1.setVisibility(View.VISIBLE);
                    c1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(bc1==false) {
                                c1.setBackgroundResource(R.drawable.button_boarder);
                                c1.setText("Do NOT bleach");
                                bc1 = true;
                            }else{
                                c1.setBackgroundResource(R.drawable.no_bleach);
                                c1.setText(null);
                                bc1 = false;
                            }
                        }
                    });
                    c2 = (Button) findViewById(R.id.spon32);
                    c2.setVisibility(View.VISIBLE);
                    c2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(bc2 == false) {
                                c2.setBackgroundResource(R.drawable.button_boarder);
                                c2.setText("Bleach when needed");
                                bc2 = true;
                            }else{
                                c2.setBackgroundResource(R.drawable.bleach);
                                c2.setText(null);
                                bc2 = false;
                            }
                        }
                    });
                    c3 = (Button) findViewById(R.id.spon33);
                    c3.setVisibility(View.VISIBLE);
                    c3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(bc3 = false) {
                                c3.setBackgroundResource(R.drawable.button_boarder);
                                c3.setText("Non-chlorine bleach ONLY");
                                bc3 = true;
                            }else{
                                c3.setBackgroundResource(R.drawable.bleach_only_non_chlorine_small);
                                c3.setText(null);
                                bc3 = false;
                            }
                        }
                    });
                    RelativeLayout.LayoutParams p = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT);

                    p.addRule(RelativeLayout.BELOW, R.id.spon33);

                    bt4.setLayoutParams(p);
                    bt4.getLayoutParams().height = 270;
                    bt4.getLayoutParams().width = 980;
                    open3 = true;
                }else{
                    c1.setVisibility(View.GONE);
                    c2.setVisibility(View.GONE);
                    c3.setVisibility(View.GONE);
                    open3 = false;
                }
            }
        });
       bt4=(Button)findViewById(R.id.bt4);
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(open4 == false) {
                    d1 = (Button) findViewById(R.id.spon41);
                    d1.setVisibility(View.VISIBLE);
                    d1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(bd1==false) {
                                d1.setBackgroundResource(R.drawable.button_boarder);
                                d1.setText("Do not iron");
                                bd1 = true;
                            }else{
                                d1.setBackgroundResource(R.drawable.dont_iron);
                                d1.setText(null);
                                bd1 = false;
                            }
                        }
                    });
                    d2 = (Button) findViewById(R.id.spon42);
                    d2.setVisibility(View.VISIBLE);
                    d2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(bd2 == false) {
                                d2.setBackgroundResource(R.drawable.button_boarder);
                                d2.setText("Iron, without steam");
                                bd2 = true;
                            }else{
                                d2.setBackgroundResource(R.drawable.no_steam);
                                d2.setText(null);
                                bd2 = false;
                            }
                        }
                    });
                    d3 = (Button) findViewById(R.id.spon43);
                    d3.setVisibility(View.VISIBLE);
                    d3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(bd3 == false) {
                                d3.setBackgroundResource(R.drawable.button_boarder);
                                d3.setText("Iron on low heat");
                                bd3 = true;
                            }else{
                                d3.setBackgroundResource(R.drawable.iron_low);
                                d3.setText(null);
                                bd3 = false;
                            }
                        }
                    });
                    d4 = (Button) findViewById(R.id.spon44);
                    d4.setVisibility(View.VISIBLE);
                    d4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(bd4 == false) {
                                d4.setBackgroundResource(R.drawable.button_boarder);
                                d4.setText("Iron on medium heat");
                                bd4 = true;
                            }else{
                                d4.setBackgroundResource(R.drawable.iron_medium);
                                d4.setText(null);
                                bd4 = false;
                            }
                        }
                    });
                    RelativeLayout.LayoutParams p = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                            ViewGroup.LayoutParams.WRAP_CONTENT);

                    p.addRule(RelativeLayout.BELOW, R.id.spon44);

                    bt5.setLayoutParams(p);
                    bt5.getLayoutParams().height = 270;
                    bt5.getLayoutParams().width = 980;
                    open4 = true;
                }else{
                    d1.setVisibility(View.GONE);
                    d2.setVisibility(View.GONE);
                    d3.setVisibility(View.GONE);
                    d4.setVisibility(View.GONE);
                    open4 = false;
                }
            }
        });
        bt5=(Button)findViewById(R.id.bt5);
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(open5 == false) {
                    e1 = (Button) findViewById(R.id.spon51);
                    e1.setVisibility(View.VISIBLE);
                    e1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(be1==false) {
                                e1.setBackgroundResource(R.drawable.button_boarder);
                                e1.setText("No dry cleaning needed");
                                be1 = true;
                            }else{
                                e1.setBackgroundResource(R.drawable.no_dry_clean);
                                e1.setText(null);
                                be1 = false;
                            }
                        }
                    });
                    e2 = (Button) findViewById(R.id.spon52);
                    e2.setVisibility(View.VISIBLE);
                    e2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if(be2==false) {
                                e2.setBackgroundResource(R.drawable.button_boarder);
                                e2.setText("Dry cleaning");
                                be2 = true;
                            }else{
                                e2.setBackgroundResource(R.drawable.tumble_dry);
                                e2.setText(null);
                                be2 = false;
                            }
                        }
                    });

                    open5 = true;
                }else{
                    e1.setVisibility(View.GONE);
                    e2.setVisibility(View.GONE);
                    open5 = false;
                }
            }
        });
    }
}
