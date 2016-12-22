package com.hidayatasep.makersinstitute.belajarcustomlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by hidayatasep43 on 12/22/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, List<Word> wordList) {
        super(context, R.layout.item_list, wordList);
    }

    public static class ViewHolder{
        TextView englishTextView;
        TextView indonesiaTextView;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //get the data item for this position
        Word word = getItem(position);
        ViewHolder viewHolder;
        // Check if an existing view is being reused, otherwise inflate the view
        if(convertView == null){
            //jika belum ada view untuk ditampilkan
            //create new view
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_list,null);
            viewHolder = new ViewHolder();
            viewHolder.englishTextView = (TextView)convertView.findViewById(R.id.englisWord);
            viewHolder.indonesiaTextView = (TextView)convertView.findViewById(R.id.indonesiaWord);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)convertView.getTag();
        }
        //set Text
        viewHolder.englishTextView.setText(word.getEnglishWord());
        viewHolder.indonesiaTextView.setText(word.getIndonesianWord());
        //retun view of item
        return convertView;
    }
}
