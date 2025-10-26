package com.suda.yzune.wakeupschedule.schedule_appwidget

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.suda.yzune.wakeupschedule.R
import com.suda.yzune.wakeupschedule.bean.TableSelectBean

class WidgetTableListAdapter(
    layoutResId: Int,
    data: MutableList<TableSelectBean>
) : BaseQuickAdapter<TableSelectBean, BaseViewHolder>(layoutResId, data) {

    override fun convert(holder: BaseViewHolder, item: TableSelectBean) {
        holder.setVisible(R.id.ib_share, false)
        holder.setVisible(R.id.ib_edit, false)
        holder.setVisible(R.id.ib_delete, false)

        holder.setText(
            R.id.tv_table_name,
            if (item.tableName.isNotEmpty()) item.tableName else "我的课表"
        )

        val imageView = holder.getView<ImageView>(R.id.iv_pic)
        Glide.with(context)
            .load(
                if (item.background.isNotEmpty()) item.background
                else R.drawable.main_background_2020_1
            )
            .override(400, 600)
            .into(imageView)
    }
}