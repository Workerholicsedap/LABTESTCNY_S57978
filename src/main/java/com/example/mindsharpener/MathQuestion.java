package com.example.mindsharpener;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

    public class MathQuestion  extends AppCompatActivity {
        private int num1;
        private int num2;
        private char operator;

        public MathQuestion() {
            // generate random numbers
            Random rand = new Random();
            num1 = rand.nextInt(10);
            num2 = rand.nextInt(10);

            // generate a random operator
            char[] operators = {'+', '-', '*', '/'};
            operator = operators[rand.nextInt(operators.length)];
        }

        public String getQuestion() {
            return num1 + " " + operator + " " + num2 + " = ?";
        }

        public int getAnswer() {
            switch (operator) {
                case '+':
                    return num1 + num2;
                case '-':
                    return num1 - num2;
                case '*':
                    return num1 * num2;
                case '/':
                    return num1 / num2;
                default:
                    return 0;
            }
        }
    }


