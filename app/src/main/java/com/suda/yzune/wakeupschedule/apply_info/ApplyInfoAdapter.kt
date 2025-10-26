package com.suda.yzune.wakeupschedule.apply_info

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder
import com.suda.yzune.wakeupschedule.R
import com.suda.yzune.wakeupschedule.bean.HtmlCountBean

class ApplyInfoAdapter(layoutResId: Int, data: MutableList<HtmlCountBean>) :
    BaseQuickAdapter<HtmlCountBean, BaseViewHolder>(layoutResId, data) {

    override fun convert(holder: BaseViewHolder, item: HtmlCountBean) {
        holder.setVisible(R.id.ll_detail, true)
        holder.setVisible(R.id.ll_detail_num, true)
        holder.setVisible(R.id.v_line, true)
        holder.setText(R.id.tv_school, item.school)
        holder.setText(R.id.tv_count, item.count.toString())
        holder.setText(R.id.tv_checked, item.checked.toString())
        holder.setText(R.id.tv_valid, item.valid.toString())
    }
}