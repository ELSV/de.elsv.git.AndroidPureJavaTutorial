package com.example.androidpurejavaprogramming;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.InputType;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	LinearLayout	layout1;
	LinearLayout	buttonLayout;
	EditText	number1Text;
	EditText	number2Text;
	Button		multiplyButton;
	Button		devideButton;
	Button		additionButton;
	Button		substractionButton;
	TextView	answerText;
	TextView	bannerText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		layout1 = new LinearLayout(this);
		buttonLayout = new LinearLayout(this);
		number1Text = new EditText(this);
		number2Text = new EditText(this);
		additionButton = new Button(this);
		substractionButton = new Button(this);
		multiplyButton = new Button(this);
		devideButton = new Button(this);
		answerText = new TextView(this);
		bannerText = new TextView(this);
		
		layout1.setOrientation(LinearLayout.VERTICAL);
		layout1.setGravity(Gravity.CENTER_HORIZONTAL);
//		layout1.setBackgroundColor(Color.BLUE);
		buttonLayout.setOrientation(LinearLayout.HORIZONTAL);
		buttonLayout.setGravity(Gravity.CENTER_HORIZONTAL);
		
		bannerText.setWidth(300);
		bannerText.setGravity(Gravity.CENTER_HORIZONTAL);
		bannerText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 50);
		bannerText.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD);
		bannerText.setText("PI Quick Calculator");
//		bannerText.setTextColor(Color.YELLOW);
		bannerText.setPadding(0, 0, 0, 10);
		
		number1Text.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL | InputType.TYPE_NUMBER_FLAG_SIGNED);
		number2Text.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL | InputType.TYPE_NUMBER_FLAG_SIGNED);
		
		additionButton.setText("+");
		substractionButton.setText("-");
		multiplyButton.setText("*");
		devideButton.setText("/");
		
		answerText.setText("0");
		answerText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
		answerText.setPadding(0, 10, 0, 0);
		answerText.setWidth(150);
		answerText.setGravity(Gravity.CENTER_HORIZONTAL);
		
		additionButton.setOnClickListener(additionClicked);
		substractionButton.setOnClickListener(substractionClicked);
		multiplyButton.setOnClickListener(multiplyClicked);
		devideButton.setOnClickListener(devideClicked);
		
		buttonLayout.addView(additionButton);
		buttonLayout.addView(substractionButton);
		buttonLayout.addView(multiplyButton);
		buttonLayout.addView(devideButton);
		
		layout1.addView(bannerText);
		layout1.addView(number1Text);
		layout1.addView(number2Text);
		layout1.addView(buttonLayout);
		layout1.addView(answerText);
		
		setContentView(layout1);
		
		number1Text.setLayoutParams(new LinearLayout.LayoutParams(350, 70));
		number2Text.setLayoutParams(new LinearLayout.LayoutParams(350, 70));
		additionButton.setLayoutParams(new LinearLayout.LayoutParams(70, 70));
		substractionButton.setLayoutParams(new LinearLayout.LayoutParams(70, 70));
		multiplyButton.setLayoutParams(new LinearLayout.LayoutParams(70, 70));
		devideButton.setLayoutParams(new LinearLayout.LayoutParams(70, 70));
	}
	
private OnClickListener additionClicked = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			String firstString = number1Text.getText().toString();
			String secondString = number2Text.getText().toString();
			double firstNumber = Double.parseDouble(firstString);
			double secondNumber = Double.parseDouble(secondString);
			double result = firstNumber + secondNumber;
			String resultString = String.valueOf(result);
			answerText.setText(resultString);
			
		}
	};
	
private OnClickListener substractionClicked = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			String firstString = number1Text.getText().toString();
			String secondString = number2Text.getText().toString();
			double firstNumber = Double.parseDouble(firstString);
			double secondNumber = Double.parseDouble(secondString);
			double result = firstNumber - secondNumber;
			String resultString = String.valueOf(result);
			answerText.setText(resultString);
			
		}
	};
	
private OnClickListener multiplyClicked = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			String firstString = number1Text.getText().toString();
			String secondString = number2Text.getText().toString();
			double firstNumber = Double.parseDouble(firstString);
			double secondNumber = Double.parseDouble(secondString);
			double result = firstNumber * secondNumber;
			String resultString = String.valueOf(result);
			answerText.setText(resultString);
			
		}
	};
	
	
private OnClickListener devideClicked = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			String firstString = number1Text.getText().toString();
			String secondString = number2Text.getText().toString();
			double firstNumber = Double.parseDouble(firstString);
			double secondNumber = Double.parseDouble(secondString);
			if(secondNumber != 0){
				double result = firstNumber / secondNumber;
				String resultString = String.valueOf(result);
				answerText.setText(resultString);
			}
			
		}
	};

}
