package com.suda.yzune.wakeupschedule.settings

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.suda.yzune.wakeupschedule.R
import com.suda.yzune.wakeupschedule.bean.TimeTableBean

class TimeTableAdapter(
    layoutResId: Int,
    data: MutableList<TimeTableBean>,
    var selectedId: Int
) : BaseQuickAdapter<TimeTableBean, BaseViewHolder>(layoutResId, data) {

    override fun convert(holder: BaseViewHolder, item: TimeTableBean) {
        holder.setVisible(R.id.ib_delete, item.id != 1)
        holder.setVisible(R.id.v_selected, item.id == selectedId)
        holder.setText(R.id.tv_time_name, item.name)
    }
}