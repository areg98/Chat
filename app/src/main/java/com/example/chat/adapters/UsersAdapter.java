package com.example.chat.adapters;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chat.R;
import com.example.chat.activities.UsersActivity;
import com.example.chat.databinding.ItemConteinerUserBinding;
import com.example.chat.listeners.UserListener;
import com.example.chat.models.User;

import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserViewHolder> {


    private final List<User> users;

    private final UserListener userListener;
    private UsersActivity usersActivity;

//    public UsersAdapter(List<User> users, UserListener userListener){
//        this.users = users;
//        this.userListener = userListener;
//    }
    public UsersAdapter(List<User> users, UserListener userListener) {
        this.users = users;
        this.userListener = userListener;
    }

    @NonNull
    @Override
    public UsersAdapter.UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemConteinerUserBinding itemConteinerUserBinding = ItemConteinerUserBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        );
        return new UserViewHolder(itemConteinerUserBinding);
    }


    @Override
    public void onBindViewHolder(@NonNull UsersAdapter.UserViewHolder holder, int position) {
        holder.setUserData(users.get(position));
    }

    @Override
    public int getItemCount() {
        return users.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {

        ItemConteinerUserBinding binding;

        UserViewHolder(ItemConteinerUserBinding itemConteinerUserBinding) {
            super(itemConteinerUserBinding.getRoot());
            binding = itemConteinerUserBinding;
        }

        void setUserData(User user) {

                Log.e("my Error", String.valueOf(binding.getRoot()));

            binding.textName.setText(user.name);
            binding.textEmail.setText(user.email);
            if (getUserImage(user.image) != null) {
                binding.imageProfile.setImageBitmap(getUserImage(user.image));
            } else {
                binding.imageProfile.setBackgroundResource(R.drawable.ic_user_default_image);
            }
            binding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    userListener.onUserClicked(user);
                }
            });
        }

        private Bitmap getUserImage(String encodingImage) {
            if (encodingImage != null) {
                byte[] bytes = Base64.decode(encodingImage, Base64.DEFAULT);
                return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
            }
            return null;
        }
    }
}
