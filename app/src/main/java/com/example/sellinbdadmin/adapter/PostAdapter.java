package com.example.sellinbdadmin.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.sellinbdadmin.R;
import com.example.sellinbdadmin.model.ModelPost;
import com.example.sellinbdadmin.model.PostModel;
import com.example.sellinbdadmin.model.Record;
import com.example.sellinbdadmin.ui.DetailsActivity;

import java.util.ArrayList;
import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostView> {

    List<ModelPost> posts;
    LayoutInflater inflater;
    Context context;
    public PostAdapter(Context ctx, ArrayList<ModelPost> posts) {
        this.context=ctx;
        this.posts = posts;
        this.inflater = LayoutInflater.from(ctx);
    }


    @NonNull
    @Override
    public PostView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=inflater.inflate(R.layout.list_ad,parent,false);
        return new PostView(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostView holder, int position) {

        holder.title.setText(posts.get(position).getTitle());
        holder.price.setText("BDT: "+posts.get(position).getPrice()+" taka");
        holder.postedby.setText("Posted by: "+posts.get(position).getName());
        holder.address.setText("Location: "+posts.get(position).getArea());
        holder.posttype.setText("Category: "+posts.get(position).getType());
        Uri myUri = Uri.parse(posts.get(position).getImage());
        Glide.with(context).load(posts.get(position).getImage()).into(holder.imageView);
        holder.imageView.setImageURI(myUri);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, DetailsActivity.class);
                intent.putExtra("title",posts.get(position).getTitle());
                intent.putExtra("name",posts.get(position).getName());
                intent.putExtra("price",posts.get(position).getPrice());
                intent.putExtra("address",posts.get(position).getArea());
                intent.putExtra("type",posts.get(position).getType());
                intent.putExtra("title",posts.get(position).getTitle());
                intent.putExtra("title",posts.get(position).getTitle());
                intent.putExtra("title",posts.get(position).getTitle());
                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class PostView extends RecyclerView.ViewHolder {
        ImageView imageView;
        CardView cardView;
        TextView title,price,postedby,address,posttype;
        public PostView(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView123);
            title=itemView.findViewById(R.id.text_title);
            price=itemView.findViewById(R.id.text_price);
            postedby=itemView.findViewById(R.id.text_person);
            address=itemView.findViewById(R.id.text_address);
            posttype=itemView.findViewById(R.id.text_type);
            cardView=itemView.findViewById(R.id.cardView);
        }
    }
}
