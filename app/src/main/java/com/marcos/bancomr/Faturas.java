package com.marcos.bancomr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.marcos.bancomr.databinding.ActivityFaturasBinding;
import com.vinaygaba.creditcardview.CardType;
import com.vinaygaba.creditcardview.CreditCardView;


public class Faturas extends AppCompatActivity {

    private ActivityFaturasBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFaturasBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportActionBar().hide();

        binding.toolbarFaturas.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        CreditCardView cartaoDeCredito = binding.cartaoDeCredito;
        cartaoDeCredito.setCardNumber("4235 6477 2802 5682");
        cartaoDeCredito.setCardName("Marcos Duarte Gomes");
        cartaoDeCredito.setExpiryDate("11/25");
        cartaoDeCredito.setType(CardType.MASTERCARD);
    }
}