package com.sajjad.bthsecurity;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

public class RoomAdapter extends RecyclerView.Adapter<RoomAdapter.RoomViewHolder> {

    private Context mContext;

    public RoomAdapter(Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public RoomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        return new RoomViewHolder(inflater.inflate(R.layout.activity_security_room_list, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull RoomViewHolder roomViewHolder, int i) {
        switch (roomViewHolder.getAdapterPosition()) {
            case 0:
                roomViewHolder.mRoomTextView.setText("Front Door");
                break;
            case 1:
                roomViewHolder.mRoomTextView.setText("Side Door");
                roomViewHolder.mRoomSwitch.setChecked(true);
                break;
            case 2:
                roomViewHolder.mRoomTextView.setText("Back Door");
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class RoomViewHolder extends RecyclerView.ViewHolder {

        public TextView mRoomTextView;
        public Switch mRoomSwitch;

        public RoomViewHolder(@NonNull View itemView) {
            super(itemView);

            mRoomTextView = itemView.findViewById(R.id.activity_security_room_list_room_text_view);
            mRoomSwitch = itemView.findViewById(R.id.activity_security_room_list_switch);
        }
    }
}
