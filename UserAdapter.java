package com.example.my_lifehome;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    // ... الكود الحالي صحيح ...

    // إضافة دالة لتعيين البيانات
    public void setUsers(List<User> users) {
        this.users = new ArrayList<>(users);
        notifyDataSetChanged();
    }

    // تحسين ViewHolder لإضافة صورة المستخدم
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView userName, userRole;
        ImageView userAvatar, editIcon, deleteIcon;

        public ViewHolder(View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.username);
            userRole = itemView.findViewById(R.id.userrole);
            userAvatar = itemView.findViewById(R.id.user_avatar);
            editIcon = itemView.findViewById(R.id.edit_icon);
            deleteIcon = itemView.findViewById(R.id.delete_icon);
        }
    }

    // تحسين onBindViewHolder
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User user = user.get(position);
        holder.userName.setText(user.getName());
        holder.userRole.setText(user.getRole());

        // يمكنك تحميل صورة المستخدم هنا باستخدام Glide/Picasso
        // Glide.with(context).load(user.getImageUrl()).into(holder.userAvatar);

        holder.itemView.setOnClickListener(v -> {
            if (listener != null) listener.onUserClick(user);
        });

        holder.editIcon.setOnClickListener(v -> {
            if (listener != null) listener.onUserClick(user);
        });

        holder.deleteIcon.setOnClickListener(v -> {
            if (deleteListener != null) deleteListener.onUserDelete(user);
        });
    }
}