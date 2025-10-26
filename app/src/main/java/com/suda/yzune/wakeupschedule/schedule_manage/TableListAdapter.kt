package com.suda.yzune.wakeupschedule.schedule_manage

import android.view.View
import androidx.appcompat.widget.AppCompatImageView
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.suda.yzune.wakeupschedule.R
import com.suda.yzune.wakeupschedule.bean.TableSelectBean

class TableListAdapter(
    layoutResId: Int,
    data: MutableList<TableSelectBean>
) : BaseQuickAdapter<TableSelectBean, BaseViewHolder>(layoutResId, data) {

    override fun convert(holder: BaseViewHolder, item: TableSelectBean) {
        holder.getView<View>(R.id.ib_delete).visibility =
            if (item.type == 1) View.GONE else View.VISIBLE

        holder.setText(
            R.id.tv_table_name,
            if (item.tableName.isNotEmpty()) item.tableName else "我的课表"
        )

        val imageView = holder.getView<AppCompatImageView>(R.id.iv_pic)
        Glide.with(context)
            .load(
                if (item.background.isNotEmpty()) item.background
                else R.drawable.main_background_2020_1
            )
            .override(400, 600)
            .into(imageView)
    }
}