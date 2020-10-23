package com.tana.viewpager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatRecyclerAdapter extends RecyclerView.Adapter<ChatRecyclerAdapter.ChatViewHolder> {
    final Context mContext;
    final ArrayList<Chats> mChats;

    public ChatRecyclerAdapter(Context context, ArrayList<Chats> chats) {
        mContext = context;
        mChats = chats;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.items_chat, parent, false);
        return new ChatViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
        Chats chats = mChats.get(position);
        holder.mChatImg.setImageResource(chats.getImage());
        holder.mChatContact.setText(chats.getName());
        holder.mChatMsg.setText(chats.getMessage());
    }

    @Override
    public int getItemCount() {
        return mChats.size();
    }

    public static class ChatViewHolder extends RecyclerView.ViewHolder {
        public ImageView mChatImg;
        public TextView mChatContact;
        public TextView mChatMsg;
        public ChatViewHolder(@NonNull View itemView) {
            super(itemView);

            mChatImg = (ImageView) itemView.findViewById(R.id.chat_img);
            mChatContact = (TextView) itemView.findViewById(R.id.chat_contact);
            mChatMsg = (TextView) itemView.findViewById(R.id.chat_msg);
        }
    }
}
