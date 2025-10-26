package com.suda.yzune.wakeupschedule.settings

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.suda.yzune.wakeupschedule.R
import com.suda.yzune.wakeupschedule.bean.TimeDetailBean

class TimeSettingsAdapter(
    layoutResId: Int,
    list: MutableList<TimeDetailBean>
) : BaseQuickAdapter<TimeDetailBean, BaseViewHolder>(layoutResId, list) {

    override fun convert(holder: BaseViewHolder, item: TimeDetailBean) {
        val name = "第 ${item.node} 节"
        holder.setText(R.id.tv_time_name, name)
        holder.setText(R.id.tv_start, item.startTime)
        holder.setText(R.id.tv_end, item.endTime)
    }
}