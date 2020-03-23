package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_limpar, btn_apagar, btn_plus, btn_less, btn_div, btn_multi, btn_resultado;
    TextView valor_1, valor_2, sinal, resultado;
    float val1 = 0;
    float val2 = 0;
    float res = 0;
    int operacao = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_limpar = findViewById(R.id.btn_limpar);
        btn_apagar = findViewById(R.id.btn_apagar);
        btn_plus = findViewById(R.id.btn_plus);
        btn_less = findViewById(R.id.btn_less);
        btn_div = findViewById(R.id.btn_div);
        btn_multi = findViewById(R.id.btn_multi);
        btn_resultado = findViewById(R.id.btn_resultado);
        valor_2 = findViewById(R.id.valor_2);
        valor_1 = findViewById(R.id.valor_1);
        sinal = findViewById(R.id.sinal);
        resultado = findViewById(R.id.resultado);

        //nome para os botões
        btn_0.setText("0");
        btn_1.setText("1");
        btn_2.setText("2");
        btn_3.setText("3");
        btn_4.setText("4");
        btn_5.setText("5");
        btn_6.setText("6");
        btn_7.setText("7");
        btn_8.setText("8");
        btn_9.setText("9");
        btn_apagar.setText("<=");
        btn_limpar.setText("CE");
        btn_less.setText("-");
        btn_plus.setText("+");
        btn_div.setText("/");
        btn_multi.setText("*");
        btn_resultado.setText("=");
    }

    public void btn_0(View v){
        if(operacao > 0){
            String str = valor_2.getText().toString();
            valor_2.setText(str+"0");

            String val = valor_2.getText().toString();
            val2 = Integer.parseInt(val);
        }else{
            String str = valor_1.getText().toString();
            valor_1.setText(str+"0");

            String val = valor_1.getText().toString();
            val1 = Integer.parseInt(val);
        }
    }

    public void btn_1(View v){
        if(operacao > 0){
            String str = valor_2.getText().toString();
            valor_2.setText(str+"1");

            String val = valor_2.getText().toString();
            val2 = Integer.parseInt(val);
        }else{
            String str = valor_1.getText().toString();
            valor_1.setText(str+"1");

            String val = valor_1.getText().toString();
            val1 = Integer.parseInt(val);
        }
    }

    public void btn_2(View v){
        if(operacao > 0){
            String str = valor_2.getText().toString();
            valor_2.setText(str+"2");

            String val = valor_2.getText().toString();
            val2 = Integer.parseInt(val);
        }else{
            String str = valor_1.getText().toString();
            valor_1.setText(str+"2");

            String val = valor_1.getText().toString();
            val1 = Integer.parseInt(val);
        }
    }

    public void btn_3(View v){
        if(operacao > 0){
            String str = valor_2.getText().toString();
            valor_2.setText(str+"3");

            String val = valor_2.getText().toString();
            val2 = Integer.parseInt(val);
        }else{
            String str = valor_1.getText().toString();
            valor_1.setText(str+"3");

            String val = valor_1.getText().toString();
            val1 = Integer.parseInt(val);
        }
    }

    public void btn_4(View v){
        if(operacao > 0){
            String str = valor_2.getText().toString();
            valor_2.setText(str+"4");

            String val = valor_2.getText().toString();
            val2 = Integer.parseInt(val);
        }else{
            String str = valor_1.getText().toString();
            valor_1.setText(str+"4");

            String val = valor_1.getText().toString();
            val1 = Integer.parseInt(val);
        }
    }

    public void btn_5(View v){
        if(operacao > 0){
            String str = valor_2.getText().toString();
            valor_2.setText(str+"5");

            String val = valor_2.getText().toString();
            val2 = Integer.parseInt(val);
        }else{
            String str = valor_1.getText().toString();
            valor_1.setText(str+"5");

            String val = valor_1.getText().toString();
            val1 = Integer.parseInt(val);
        }
    }

    public void btn_6(View v){
        if(operacao > 0){
            String str = valor_2.getText().toString();
            valor_2.setText(str+"6");

            String val = valor_2.getText().toString();
            val2 = Integer.parseInt(val);
        }else{
            String str = valor_1.getText().toString();
            valor_1.setText(str+"6");

            String val = valor_1.getText().toString();
            val1 = Integer.parseInt(val);
        }
    }

    public void btn_7(View v){
        if(operacao > 0){
            String str = valor_2.getText().toString();
            valor_2.setText(str+"7");

            String val = valor_2.getText().toString();
            val2 = Integer.parseInt(val);
        }else{
            String str = valor_1.getText().toString();
            valor_1.setText(str+"7");

            String val = valor_1.getText().toString();
            val1 = Integer.parseInt(val);
        }
    }

    public void btn_8(View v){
        if(operacao > 0){
            String str = valor_2.getText().toString();
            valor_2.setText(str+"8");

            String val = valor_2.getText().toString();
            val2 = Integer.parseInt(val);
        }else{
            String str = valor_1.getText().toString();
            valor_1.setText(str+"8");

            String val = valor_1.getText().toString();
            val1 = Integer.parseInt(val);
        }
    }

    public void btn_9(View v){
        if(operacao > 0){
            String str = valor_2.getText().toString();
            valor_2.setText(str+"9");

            String val = valor_2.getText().toString();
            val2 = Integer.parseInt(val);
        }else{
            String str = valor_1.getText().toString();
            valor_1.setText(str+"9");

            String val = valor_1.getText().toString();
            val1 = Integer.parseInt(val);
        }
    }

    public void btn_limpar(View v){
        valor_1.setText("");
        valor_2.setText("");
        sinal.setText("");
        resultado.setText("");

        val1 = val2 = operacao = 0;
    }

    public void btn_apagar(View v){
        if(val2 > 0){
            String str = valor_2.getText().toString();
            if(str.length()>0){
                String str_sub = str.substring(0, str.length()-1);
                valor_2.setText(str_sub);
            }else{
                val2 = 0;
            }
        }else if(operacao > 0){
            String str = sinal.getText().toString();
            if(str.length()>0){
                String str_sub = str.substring(0, str.length()-1);
                sinal.setText(str_sub);
                operacao = 0;
            }
        }else{
            String str = valor_1.getText().toString();
            if(str.length()>0){
                String str_sub = str.substring(0, str.length()-1);
                valor_1.setText(str_sub);
            }else{
                val1 = 0;
            }
        }
    }

    public void btn_resultado(View v) {
        float res = 0;
        if ((val1 > 0 || val2 > 0) && operacao > 0) {
            switch (operacao) {
                case 1:
                    if (val2 > 0) {
                        res = val1 / val2;
                    }
                    break;

                case 2:
                    res = val1 * val2;
                    break;

                case 3:
                    res = val1 + val2;
                    break;

                case 4:
                    res = val1 - val2;
                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + operacao);
            }

            String result = Float.toString(res);
            resultado.setText(result);
        }
    }

    public void btn_divisao(View v){
        sinal.setText("/");
        operacao = 1;

        String str = valor_1.getText().toString();
        val1 = Integer.parseInt(str);
    }

    public void btn_multiplicacao(View v){
        sinal.setText("*");
        operacao = 2;

        String str = valor_1.getText().toString();
        val1 = Integer.parseInt(str);
    }

    public void btn_adicao(View v){
        sinal.setText("+");
        operacao = 3;

        String str = valor_1.getText().toString();
        val1 = Integer.parseInt(str);
    }

    public void btn_subtracao(View v){
        sinal.setText("-");
        operacao = 4;

        String str = valor_1.getText().toString();
        val1 = Integer.parseInt(str);
    }
}
