package com.example.credprofileapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.google.android.material.card.MaterialCardView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {

    private CircleImageView profileImage;
    private TextView tvName;
    private TextView tvMemberSince;
    private ImageButton btnBack;
    private MaterialCardView supportCard;
    private CardView cardGarage;
    private ConstraintLayout layoutCreditScore;
    private ConstraintLayout layoutCashback;
    private ConstraintLayout layoutBankBalance;
    private ConstraintLayout layoutCashbackBalance;
    private ConstraintLayout layoutCoins;
    private ConstraintLayout layoutRefer;
    private ConstraintLayout layoutTransactions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Initialize views
        initViews();

        // Set user data
        setUserData();

        // Set click listeners
        setClickListeners();
    }

    private void initViews() {
        profileImage = findViewById(R.id.profileImage);
        tvName = findViewById(R.id.tvName);
        tvMemberSince = findViewById(R.id.tvMemberSince);
        btnBack = findViewById(R.id.btnBack);
        supportCard = findViewById(R.id.supportCard);
        cardGarage = findViewById(R.id.cardGarage);
        layoutCreditScore = findViewById(R.id.layoutCreditScore);
        layoutCashback = findViewById(R.id.layoutCashback);
        layoutBankBalance = findViewById(R.id.layoutBankBalance);
        layoutCashbackBalance = findViewById(R.id.layoutCashbackBalance);
        layoutCoins = findViewById(R.id.layoutCoins);
        layoutRefer = findViewById(R.id.layoutRefer);
        layoutTransactions = findViewById(R.id.layoutTransactions);
    }

    private void setUserData() {
        // Set profile data from API or local storage
        // For now, we'll use the default values from the layout

        // You could load a real image like this:
        // Glide.with(this).load(userImageUrl).placeholder(R.drawable.profile_placeholder).into(profileImage);

        // Set data values for credit score, cashback, etc.
        TextView tvScoreValue = findViewById(R.id.tvScoreValue);
        tvScoreValue.setText("757");

        TextView tvCashbackValue = findViewById(R.id.tvCashbackValue);
        tvCashbackValue.setText("₹3");

        TextView tvCoinsValue = findViewById(R.id.tvCoinsValue);
        tvCoinsValue.setText("26,46,583");
    }

    private void setClickListeners() {
        // Back button
        btnBack.setOnClickListener(v -> onBackPressed());

        // Support card
        supportCard.setOnClickListener(v -> {
            Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show();
            // Navigate to support screen or open chat
        });

        // Card garage
        cardGarage.setOnClickListener(v -> {
            Toast.makeText(this, "CRED garage clicked", Toast.LENGTH_SHORT).show();
            // Navigate to garage screen
        });

        // Credit score section
        layoutCreditScore.setOnClickListener(v -> {
            Toast.makeText(this, "Credit score clicked", Toast.LENGTH_SHORT).show();
            // Navigate to credit score details
        });

        // Cashback section
        layoutCashback.setOnClickListener(v -> {
            Toast.makeText(this, "Lifetime cashback clicked", Toast.LENGTH_SHORT).show();
            // Navigate to cashback details
        });

        // Bank balance section
        layoutBankBalance.setOnClickListener(v -> {
            Toast.makeText(this, "Bank balance clicked", Toast.LENGTH_SHORT).show();
            // Navigate to bank details or refresh balance
        });

        // Cashback balance section
        layoutCashbackBalance.setOnClickListener(v -> {
            Toast.makeText(this, "Cashback balance clicked", Toast.LENGTH_SHORT).show();
            // Navigate to cashback details
        });

        // Coins section
        layoutCoins.setOnClickListener(v -> {
            Toast.makeText(this, "Coins clicked", Toast.LENGTH_SHORT).show();
            // Navigate to coins details
        });

        // Refer section
        layoutRefer.setOnClickListener(v -> {
            Toast.makeText(this, "Refer and earn clicked", Toast.LENGTH_SHORT).show();
            // Navigate to referral screen
        });

        // Transactions section
        layoutTransactions.setOnClickListener(v -> {
            Toast.makeText(this, "All transactions clicked", Toast.LENGTH_SHORT).show();
            // Navigate to transactions history
        });

        // Profile image click for edit
        profileImage.setOnClickListener(v -> {
            Toast.makeText(this, "Edit profile image", Toast.LENGTH_SHORT).show();
            // Show options to change profile picture
        });
    }

    // You might want to add options to edit the profile
    public void editProfile(View view) {
        // Start edit profile activity or show dialog
        Toast.makeText(this, "Edit profile clicked", Toast.LENGTH_SHORT).show();
    }
}