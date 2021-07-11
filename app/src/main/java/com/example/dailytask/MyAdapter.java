package com.example.dailytask;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;
import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.ViewHolder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.reflect.Array.get;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    private Context context;
    private ArrayList<TaskList> taskList;

    public MyAdapter(Context context, ArrayList<TaskList> taskList) {
        this.context = context;
        this.taskList = taskList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
         return new MyViewHolder (LayoutInflater.from (context).inflate (R.layout.show_item, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        final TaskList currentList = taskList.get (position);
         holder.tvTask.setText (currentList.getTask ());


    }



    @Override
    public int getItemCount() {
        return  taskList == null ? 0 :taskList.size ();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvTask;
        ImageView edit,delete;
        RelativeLayout relative;

        public MyViewHolder(@NonNull View itemView) {
            super (itemView);
            tvTask=itemView.findViewById (R.id.showTask);
            edit=(ImageView)itemView.findViewById(R.id.done);
            delete=(ImageView)itemView.findViewById(R.id.cross);
            relative=(itemView).findViewById (R.id.relative);

        }
    }
}
//.child (getRef(position).getKey ())