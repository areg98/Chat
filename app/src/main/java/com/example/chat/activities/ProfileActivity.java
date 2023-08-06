package com.example.chat.activities;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

import com.example.chat.ChatSettingsActivity;
import com.example.chat.R;
import com.example.chat.databinding.ActivityProfileBinding;
import com.example.chat.utiles.Constants;
import com.example.chat.utiles.PreferenceManager;

public class ProfileActivity extends BaseActivity {

    private ActivityProfileBinding binding;
    private PreferenceManager preferenceManager;
    AlertDialog.Builder builder;


    @SuppressLint("UseSupportActionBar")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        preferenceManager = new PreferenceManager(getApplicationContext());
        builder = new AlertDialog.Builder(this);
        loadUserDetails();
        setListeners();
    }


    private void setListeners() {

        binding.profileMenu.inflateMenu(R.menu.profile_menu);
        binding.profileMenu.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {


            @Override
            public boolean onMenuItemClick(MenuItem item) {
                int id = item.getItemId();
                if (id == R.id.sing_out) {
                    builder.setMessage("Are you sure ?")
                            .setCancelable(false)
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    signOut(preferenceManager);
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
                    AlertDialog alert = builder.create();
                    alert.show();
                    return true;
                } else {
                    return false;
                }
            }
        });

        binding.imageBack.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        });

        binding.chatSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ChatSettingsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void loadUserDetails() {
        binding.profileEmail.setText(preferenceManager.getString(Constants.KEY_EMAIL));
        binding.profileName.setText(preferenceManager.getString(Constants.KEY_NAME));
        byte[] bytes = Base64.decode(preferenceManager.getString(Constants.KEY_IMAGE), Base64.DEFAULT);
        Bitmap bitmap = BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
        binding.profileImage.setImageBitmap(bitmap);


    }

}