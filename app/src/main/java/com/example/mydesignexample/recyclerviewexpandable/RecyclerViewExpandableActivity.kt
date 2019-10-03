package com.example.mydesignexample.recyclerviewexpandable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mydesignexample.R
import kotlinx.android.synthetic.main.activity_recycler_view_expandable.*

class RecyclerViewExpandableActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_expandable)

        val adapter = TopicAdapter()
        supportActionBar?.hide()

        recycler.apply {
            this.adapter = adapter
        }
        adapter.submitList(getTopic().toMutableList())
    }

    private fun getTopic() = listOf(
        Topic(1, null, 1, "Đại sảnh"),
        Topic(2, 1, 2, "Thông báo"),
        Topic(3, 1, 2, "Thắc mắc - góp ý"),
        Topic(34, 1, 3, "Thread post sai mục"),
        Topic(31, 1, 2, "Tin tức iNet"),
        Topic(32, 1, 2, "Review sản phẩm"),
        Topic(4, null, 1, "Máy tính để bàn"),
        Topic(5, 4, 2, "Modding"),
        Topic(6, 4, 2, "Đồ họa máy tính"),
        Topic(61, 4, 2, "Phần mềm"),
        Topic(611, 4, 3, "Download"),
        Topic(612, 4, 3, "Phát triển phần mềm"),
        Topic(62, 4, 2, "Trường đua"),
        Topic(7, null, 1, "Games"),
        Topic(71, 7, 2, "Thảo luận chung"),
        Topic(72, 7, 2, "Đế chế"),
        Topic(73, 7, 2, "Garena"),
        Topic(8, null, 1, "Khu vui chơi giải trí"),
        Topic(9, 8, 2, "Chuyện trò linh tinh"),
        Topic(10, 8, 3, "From f17 with love"),
        Topic(101, 8, 3, "Offline"),
        Topic(102, 8, 3, "Thể dục thể thao"),
        Topic(111, 8, 2, "Phim - Nhạc - Sách"),
        Topic(112, null, 1, "Phim - XXXX - Sách"),
        Topic(113, 112, 2, "Phim - XXXX - Sách"),
        Topic(114, 112, 3, "Phim - XXXX - Sách")
    )
}
