package com.z.zdev.adapter;

import android.content.Context;
import android.widget.TextView;

import com.z.andutil.adapter.AdapterM;
import com.z.andutil.adapter.ViewHolderM;
import com.z.zdev.R;
import com.z.zdev.bean.AllAppChilBean;

import java.util.List;


/**
 * @author
 *         ListAdapter List适配器
 */
public class ListAdapter extends AdapterM<AllAppChilBean> {

    public ListAdapter(Context context, int layoutId, List dataArray) {
        super(context, layoutId, dataArray);
    }

    @Override
    public void convert(ViewHolderM holder, AllAppChilBean model) {
        // 为个控件绑定内容
        TextView textView = holder.getView(R.id.tv_title);

        textView.setText(model.getName());

        //holder.setText(R.id.tv_title, model.getName());
        holder.setText(R.id.tv_content, model.getName() + "内容");
        holder.setText(R.id.tv_comment, model.getName() + "条评论");
        holder.setText(R.id.tv_read, model.getName() + "阅读");
    }
}